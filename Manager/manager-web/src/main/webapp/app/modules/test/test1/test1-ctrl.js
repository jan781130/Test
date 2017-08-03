(function() {
  'use strict';
  
  var args = {};
  
  args.requireConfig = {
    paths: {
      'ui-bootstrap-tpls': '//cdn.bootcss.com/angular-ui-bootstrap/1.1.2/ui-bootstrap-tpls.min'
    },
    shim: {
      "ui-bootstrap-tpls": {
        deps: ['angular']
      }
    },
    loadPaths: ["ui-bootstrap-tpls"] 
  };
  
  
  window.glfunc.buildNgController("module3", ['ui.bootstrap'], ['$scope', '$uibModal', function($scope, $uibModal) {
    //console.log('module1 - ctrl begin');
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
  }], args);
  
})();