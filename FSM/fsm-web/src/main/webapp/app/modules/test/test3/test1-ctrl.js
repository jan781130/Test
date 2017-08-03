(function() {
  'use strict';
  
  var otherArgs = {};
  
  otherArgs.requireConfig = {
    paths: {
      'ui-bootstrap-tpls': '//cdn.bootcss.com/angular-ui-bootstrap/1.1.2/ui-bootstrap-tpls.min',
      'test-css': '//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min'
    },
    shim: {
      "ui-bootstrap-tpls": {
        deps: ['angular']
      }
    },
    loadPaths: ["ui-bootstrap-tpls", "requireCss!test-css"] 
  };
  
  otherArgs.onloadFunc = function() {
    console.log('module1 - onload func start');
  };
  
  otherArgs.offloadFunc = function() {
    require.undef('ui-bootstrap-tpls');
    require.undef('requireCss!test-css');
    require.undefCss('test-css');
    console.log('module1 - offload func start');
  };
  
  otherArgs.moduleConfigArgs = [ '$controllerProvider', function($controllerProvider) {
    console.log('module1 - config begin');
  }];
  
  
  window.glfunc.buildNgController("module1", ['ui.bootstrap'], ['$scope', '$uibModal', 'testService', function($scope, $uibModal, testService) {
    //console.log('module1 - ctrl begin');
    //Service example
    testService.start();
    
    $scope.id = "test id";
    $scope.title = "test title";
    $scope.subColumns = [];
    $scope.subColumns.push($scope.id);
    $scope.subColumns.push($scope.title);
    
    var dlg = '<div class="modal-header">';
    dlg += '<h3 class="modal-title">I\'m a modal!</h3>';
    dlg += '</div>';
    dlg += '<div class="modal-body">content</div>';
    dlg += '<div class="modal-footer">';
    dlg += '<button class="btn btn-primary" type="button" ng-click="ok()">OK</button>';
    dlg += '<button class="btn btn-warning" type="button" ng-click="cancel()">Cancel</button>';
    dlg += '</div>';
    $scope.openDialog = function() {
      $uibModal.open({
            template : dlg,
            controller : ['$scope', '$uibModalInstance',
                function($scope, $mi) {
                  $scope.cancel = function() {
                    $mi.dismiss();
                  };
                  $scope.ok = function() {
                    $mi.close();
                  };
                } ],
            backdrop : 'static'
          });
    };
  }], otherArgs);
  

  
})();