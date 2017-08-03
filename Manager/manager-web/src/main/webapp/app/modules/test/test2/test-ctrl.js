(function() {
  'use strict';
  
  window.glfunc.buildNgController("module2", [], ['$scope', function($scope) {
    
    $scope.profileData = "[\"Tabris\",\"Alien\",\"John\",\"Eddie\",\"Ian\",\"Ryan\",\"Elaine\",\"Tammy\",\"Michelle\"]";
      
    $scope.openDialog = function() {
      if($scope.profileData) {
        var profileData = JSON.parse($scope.profileData);
        var index = Math.floor(Math.random() * profileData.length + 1);
        alert(profileData[index - 1]);
      }
    };
    
    
    
    
    
  }]);
})();