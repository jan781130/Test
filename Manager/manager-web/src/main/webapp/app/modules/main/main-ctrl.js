// (function() {
'use strict';

// 初始化 main controller
function bootstrapMainCtrl(mainApp) {
  mainApp.controller('mainCtrl', ['$scope', '$location', function($scope, $location) {
    $scope.isDisplayReady = false;
    $scope.modules = {};
    if (window.glroute && window.glroute.modules) {
      angular.forEach(window.glroute.modules,
              function(module, key) {
                if (!module.parent) { // 無子選單
                  if ($scope.modules[key]) { // 如 modules
                                              // 已有值，應為暫時父選單物件
                    var submenus = $scope.modules[key].submenus;
                    $scope.modules[key] = module;
                    $scope.modules[key].submenus = submenus;
                  } else {
                    $scope.modules[key] = module;
                  }
                } else {
                  if (!$scope.modules[module.parent]) { // 如父選單尚未新增，先建暫時父選單物件
                    $scope.modules[module.parent] = {};
                  }
                  if (!$scope.modules[module.parent].submenus) {
                    $scope.modules[module.parent].submenus = [];
                  }
                  $scope.modules[module.parent].submenus
                          .push(module);
                }
              });
    }

    // *** app-layout-menu" *** //
    $scope.openMenu = function($event, submenus) {
      if (submenus) {
        var _open = (jQuery($event.currentTarget).parent()
                .hasClass('open')) ? true : false;
        event.stopPropagation();
        jQuery($event.currentTarget).parent().parent().find(
                '.dropdown').removeClass('open');
        if (_open == false) {
          jQuery($event.currentTarget).parent().addClass('open');
        }
      }
    };

    document.getElementById("displayDiv").style = "";
  }]);

  //require(["commonServ"]);

}
// })();
