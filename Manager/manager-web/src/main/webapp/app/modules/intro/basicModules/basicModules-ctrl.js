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
  
  otherArgs.moduleConfigArgs = [ '$controllerProvider', function($controllerProvider) {
    console.log('module1 - config begin');
    
  }];
  
  
  window.glfunc.buildNgController("basicModules", [], ['$scope','$location','$anchorScroll','$routeParams', function($scope, $location , $anchorScroll, $routeParams) {
		 
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