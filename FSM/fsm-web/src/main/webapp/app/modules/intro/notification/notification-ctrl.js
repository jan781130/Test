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
  
  otherArgs.onloadFunc = function() {
    console.log('module1 - onload func start');
  };
  
  otherArgs.offloadFunc = function() {
    require.undef('highlight');
    require.undef('requireCss!highlight-css');
    require.undefCss('highlight-css');
    console.log('module1 - offload func start');
  };
  
  otherArgs.moduleConfigArgs = [ '$controllerProvider', function($controllerProvider) {
    console.log('module1 - config begin');
    
  }];
  
  /**
   * 注入toastr  需要要改toastr Config再注入toastrConfig
   */
  window.glfunc.buildNgController("notification", ['toastr','ngAnimate'], ['$scope','toastr','toastrConfig','$location','$anchorScroll', function($scope, toastr, toastrConfig, $location, $anchorScroll) {
		 
	  
	  $scope.showMessage = function(){
		  /**
		   * toastr.+level+('Title','Message',{other setting});
		   * level 包括:
		   *    success,info,warning,error
		   *    
		   * other setting 可參考上表Creator範例的參數 如不需要則省略會自動引入default值 
		   *    
		   */
		  toastr.success('鴻陽','讚讚讚');
	  }
	  
	  

	  
	  var defaultConfig = angular.copy(toastrConfig);
	    $scope.types = ['success', 'error', 'info', 'warning'];

	    $scope.quotes = [
	      {
	        title: 'Come to Freenode',
	        message: 'We rock at <em>#angularjs</em>',
	        options: {
	          allowHtml: true
	        }
	      },
	      {
	        title: 'Looking for bootstrap?',
	        message: 'Try ui-bootstrap out!'
	      },
	      {
	        title: 'Wants a better router?',
	        message: 'We have you covered with ui-router'
	      },
	      {
	        title: 'Angular 2',
	        message: 'Is gonna rock the world'
	      },
	      {
	        title: null,
	        message: 'Titles are not always needed'
	      },
	      {
	        title: null,
	        message: 'Toastr rock!'
	      },
	      {
	        title: 'What about nice html?',
	        message: '<strong>Sure you <em>can!</em></strong>',
	        options: {
	          allowHtml: true
	        }
	      },
	      {
	        title: 'Ionic is <em>cool</em>',
	        message: 'Best mobile framework ever',
	        options: {
	          allowHtml: true
	        }
	      }
	    ];

	    var openedToasts = [];
	    $scope.options = {
	      autoDismiss: false,
	      positionClass: 'toast-top-right',
	      type: 'info',
	      timeOut: '5000',
	      extendedTimeOut: '2000',
	      allowHtml: false,
	      closeButton: false,
	      tapToDismiss: true,
	      progressBar: false,
	      newestOnTop: true,
	      maxOpened: 0,
	      preventDuplicates: false,
	      preventOpenDuplicates: false,
	      title: "Some title here",
	      msg: "Type your message here"
	    };


	    $scope.clearLastToast = function () {
	      var toast = openedToasts.pop();
	      toastr.clear(toast);
	    };

	    $scope.clearToasts = function () {
	      toastr.clear();
	    };

	    $scope.openRandomToast = function () {
	      var type = Math.floor(Math.random() * $scope.types.length);
	      var quote = Math.floor(Math.random() * $scope.quotes.length);
	      var toastType = $scope.types[type];
	      var toastQuote = $scope.quotes[quote];
	      openedToasts.push(toastr[toastType](toastQuote.message, toastQuote.title, toastQuote.options));
	      $scope.optionsStr = "toastr." + toastType + "(\'" + toastQuote.message + "\', \'" + toastQuote.title + "', " + JSON.stringify(toastQuote.options || {}, null, 2) + ")";
	    };

	    $scope.openToast = function () {
	      angular.extend(toastrConfig, $scope.options);
	      openedToasts.push(toastr[$scope.options.type]($scope.options.msg, $scope.options.title));
	      var strOptions = {};
	      for (var o in  $scope.options) if (o != 'msg' && o != 'title')strOptions[o] = $scope.options[o];
	      $scope.optionsStr = "toastr." + $scope.options.type + "(\'" + $scope.options.msg + "\', \'" + $scope.options.title + "\', " + JSON.stringify(strOptions, null, 2) + ")";
	    };

	    $scope.$on('$destroy', function iVeBeenDismissed() {
	      angular.extend(toastrConfig, defaultConfig);
	    })
	  
	  
		  $('pre code').each(function(i, block) {
			    hljs.highlightBlock(block);
		  });
		  
		  $scope.scrollTo = function(id) {
			  var old = $location.hash();
			  $location.hash(id);
		      $anchorScroll();
		      $location.hash(old);
		   };
	    
  }], otherArgs);
  

  
})();