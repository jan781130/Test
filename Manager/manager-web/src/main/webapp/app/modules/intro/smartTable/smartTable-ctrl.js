(function() {
  'use strict';
  
  var otherArgs = {};
  
  otherArgs.requireConfig = {
    paths: {
      'highlight':"//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min",
      'highlight-css':window.glconfig.contentPath + "/assets/plugins/heightlight/9.12.0/styles/atom-one-dark"
    },
    loadPaths: ["highlight", "requireCss!highlight-css"] 
  };
  
  otherArgs.onloadFunc = function() {
    console.log('module1 - onload func start');
  };
  
  otherArgs.offloadFunc = function() {

    require.undef('highlight');
    require.undef('requireCss!highlight-css');
    require.undefCss('highlight-css');

  };
  
  /**
   * 注入stConfig 
   * 修改st-table的global參數
   */
  otherArgs.moduleConfigArgs = ['stConfig','$controllerProvider', function(stConfig,$controllerProvider) {
    console.log('module1 - config begin');
    /**
     * change pagination template to our template
     */
    stConfig.pagination.template = 'app/directives/templates/my-custom-pagination-tmpl.html';
    
  }];
  
  /**
   * 注入smart-table module
   */
  window.glfunc.buildNgController("smartTableEx", ['smart-table'], ['$scope','Resource','$location','$anchorScroll','$filter', 'ajaxService',function(scope, resource, $location, $anchorScroll, $filter, ajaxService) {
	
	  $('pre code').each(function(i, block) {
		    hljs.highlightBlock(block);
	  });
	  
	  scope.scrollTo = function(id) {
		  var old = $location.hash();
		  $location.hash(id);
	      $anchorScroll();
	      $location.hash(old);
	   };
      
	   /**
	   * 放入表格的datas
	   */
      scope.displayed = [];
      
      /**
       * 選取data的陣列
       */
      scope.selectDatas = [];
      
      /**
       * 編寫向Sever讀取資料的邏輯
       * st-table 會將此方法rewrite至 ctrl.pipe()方法
       * param: 
       * 	tableState  st-table傳入查詢條件 包括
				={sort: {},
				  search: {},
				  pagination: { start: 0, totalItemCount: 0 }
				  };
			ctrl st-table的Controller 可呼叫內部的function  
       */
      scope.callServer = function callServer(tableState,ctrl) {

    	    scope.isLoading = true;
    	    /**
    	     * 指向st-table的reload方法
    	     */
    	    scope.reloadFunc = ctrl.pipe;
    	    
    	    /**
  	       	 * 放入自己的變數
  	       	 */
    	    if(scope.search){
    	    	tableState.search.predicateObject = scope.search;
    	    	scope.search = null;
    	    }
    	    
    	    var pagination = tableState.pagination;
    	    var start = pagination.start || 0;     
    	    var number = pagination.number || 10;  
    	    
    	    /**
           * 向後台拿取假資料的範例服務
           */
    	    ajaxService.post(
                  'table/getData',
                  /**
                   * 傳入參數
                   */
                  tableState,
                  function(result){
                    /**
                     * 資料放入
                     */
                    console.log(result.datas.data);
                    console.log(tableState);
                    scope.displayed = result.datas.data;
                    /**
                     * 總頁數比數放入tableState內，此參數為必要，否則st-table不知道總資料筆數為多少
                     */
                    tableState.pagination.numberOfPages = Math.ceil(result.datas.dataCounts/tableState.pagination.number);
                    scope.isLoading = false;
                  },
                  function(){},
                  function(){}
              );

    	    
    	  };
      
	  /**
       * 表格reload 
       */
      scope.reload = function (){
    	  scope.search = {
	  		 'id': scope.id,
	  		  'name':scope.name,
	  		  'age':scope.age,
	  		  'birthday':scope.birthday
	  	  };
    	  
    	  scope.reloadFunc();
    	  
      }
	  /**
       * 顯示選取資料
       */      
      scope.showSelected = function(){
    	  console.log(scope.selectDatas);
      }
      
      function testTable(tableState, successFun) {
    	 console.log(tableState);
    	  
      };
      
    
  }], otherArgs);
  

  
})();