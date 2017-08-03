/* If you are not architect or front-end owner, Don't change the code in here */
(function() {
  'use strict';
  
  define(["angular"], function(angular) {
    
    var commonDrtv = angular.module('commonDrtv', []);
    
    /**
     * @description 測試用 directive q
     * 
     * @inject $http : http service
     * 
     * @notes Created by Tabris
     *          Created on 2017/07/11
     */
    commonDrtv.directive('testDirective', ['$http', function($http) {
         return {
           restrict : 'A',
           replace: true,
           templateUrl : 'app/directives/templates/testDirective.html',
           scope : {
             id : '=?',
             title : '=?',
             subColumns : '=?'
           },
           link : function(scope, element, attrs) {
             console.log($http);
             console.log(scope.id);
             console.log(scope.title);
             console.log(scope.subColumns);
           }
        }
    }]);
    
    /**
     * @description smart table selector
     * 
     * @inject stConfig : smart-table stConfig
     * 
     * @notes Created by Ryan.Hsu
     *          Created on 2017/07/17
     */
    commonDrtv.directive('csSelect', ['stConfig', function (stConfig) {
        return {
            require: '^stTable',
            template: '<input type="checkbox"/>',
            scope: {
                row: '=csSelect',
                selectData : '=csSelectData'
            },
            link: function (scope, element, attrs, ctrl) {
            	
            	//single or multiple
            	var mode = attrs.csSelectMode || stConfig.select.mode;
            	var parentScope = scope.$parent.$parent;
            	if(!scope.selectData) { scope.selectData = [] };
            	
                element.bind('change', function (evt) {
                	scope.$apply(function () {
                        ctrl.select(scope.row, mode);
                    });
                });

                scope.$watch('row.isSelected', function (newValue, oldValue) {
                    if (newValue === true) {
                        element.parent().addClass('st-selected');
                        if(oldValue!==true){
                        	scope.selectData.push(scope.row);
                        }else{
                        	element.children().prop('checked',true);
                        }
                    } else {
                        element.parent().removeClass('st-selected');
                        element.children().prop('checked',false);
                        deleteRow(scope.row);
                    }
                });  
                
                function deleteRow(row){
                	var index = scope.selectData.indexOf(row);
                	if (index !== -1) {
                		scope.selectData.splice(index, 1);
                    }
                }
            }
        };
    }]);
    
    /**
     * @description page template select
     * 
     * @notes Created by Ryan.Hsu
     *          Created on 2017/07/17
     */
    commonDrtv.directive('pageSelect', function() {
      return {
        restrict: 'E',
        template: '<input type="text" class="select-page" ng-model="inputPage" ng-change="selectPage(inputPage)">',
        link: function(scope, element, attrs) {
          scope.$watch('currentPage', function(c) {
            scope.inputPage = c;
          });
        }
      }
    });
    
    
  });

  

})();