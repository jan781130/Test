(function() {
  'use strict';
 
  var otherArgs = {};
  
  otherArgs.requireConfig = {
		    paths: {
		      'highlight':"//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min",
		      'highlight-css':"/Manager/assets/plugins/heightlight/9.12.0/styles/atom-one-dark"
		    },
		    loadPaths: ["highlight", "requireCss!highlight-css"]
		  };
		  
		  
		  otherArgs.offloadFunc = function() {
		    require.undef('highlight');
		    require.undef('requireCss!highlight-css');
		    require.undefCss('highlight-css');

		  };
  
  
  window.glfunc.buildNgController("mutiSelect", [], ['$scope','$log', function(scope, log) {
    
	  
        
	  scope.inputEmployee = [
        	{	icon: picPath('A'),	firstName: "Alien",	lastName: "Liao",	selected: false	},
         	{	icon: picPath('E'),	firstName: "Eddie",	lastName: "Heish",	selected: false	},
         	{	icon: picPath('I'),	firstName: "Ian",	lastName: "Wu",	selected: false	},
         	{	icon: picPath('J'),	firstName: "John",	lastName: "Heish",	selected: false	},
         	{	icon: picPath('T'),	firstName: "Tabris",	lastName: "Zhang",	selected: false	}

        ];
    
      /**
       * 選單關閉的CallBack
       */
	  scope.selectClose = function( ){
		  angular.forEach(scope.outputEmployee, function(value){
			  log.log(value);
		  });  
	  };
	  
	  function picPath(letter){
		  return "<img src='app/modules/intro/mutiSelect/src/"+letter+".png'>";
	  }
	  
	  
	  $('pre code').each(function(i, block) {
		    hljs.highlightBlock(block);
	  });
	  
  
  }], otherArgs);
  
})();