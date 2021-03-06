/* If you are not architect or front-end owner, Don't change the code in here */
(function() {
  'use strict';
  
  define(["angular","moment"], function(angular,moment) {
    
    var commonServ = angular.module('commonServ', []);
    
    /**
     * @description 測試用 service
     * 
     * @inject $http : http service
     * 
     * @notes Created by Tabris
     *          Created on 2017/07/11
     */
    commonServ.factory('testService', ['$http', function($http) {
         return {
          start: function() {
            alert("QQ");
          }
        }
    }]);
    
   
    commonServ.factory('ajaxService', genericHyService);
    
    /** @ngInject */
	function genericHyService($http, $httpParamSerializerJQLike) {
		
		var getConfig = function(url, type, data, sendtype) {
			
			var config = {};
			config.url = url;
			config.method = type.toUpperCase();
			config.timeout = 6e5;
			
			if("POST" == config.method) {				
				config.data = JSON.stringify(data);
				config.headers = {'Content-Type': 'application/json'};
			}
			else {
				config.params = data;
				config.paramSerializer = '$httpParamSerializerJQLike';
			}
			return config;
		}
		
		/**
		 * url : 執行 ajax url 路徑
		 * type : type of request
		 * data : 傳到後端的物件 
		 * success : function(data, status) 成功時會執行的 function, 其中 data 為回傳的資料 status 為狀態代碼 
		 * failure : function(data, status) 失敗時會執行的 function, 其中 data 為回傳的資料 status 為狀態代碼
		 * error : function(e) 發生非預期錯誤, 其中 e 為錯誤資訊
		 */
		var doHttpService = function(url, type, data, success, failure, error, sendtype) {
			try {	
				$http(getConfig(url, type, data, sendtype))
					.success(
						function(data, status, headers, config, statusText) {
							if(data != null && data.result != null && data.result.status == "200") {
								success(data.result, status);
							}
							else {
								failure(data.result, status);
							}
						})
					.error(
						function(data, status, headers, config, statusText) { // 非預期的錯誤
							error(status);
							location.reload();
						});
			} catch (e) {
				if(error) {
					error(e);
				}
			}	
		};

		return {
			get : function(url, data, success, failure, error) {
				doHttpService(url, 'get', data, success, failure, error);
			},
			post : function(url, data, success, failure, error, sendtype) {
				doHttpService(url, 'post', data, success, failure, error, sendtype);
			}
		}
	}
    
    
    
    
    
    
    /**
     * @description datetimepicker 區間 Start
     * 
     * @notes Created by Ryan
     *          Created on 2017/07/20
     */
    commonServ.factory('datePickerRange', function() {
        
    	function limitEnd (view, dates, dateRangeEnd) {
    		   if (dateRangeEnd) {
 		        var activeDate = moment(dateRangeEnd);
 		        dates.filter(function (date) {
 		          return date.localDateValue() >= activeDate.valueOf()
 		        }).forEach(function (date) {
 		          date.selectable = false;
 		        })
 		      }
           } 
        
        function limitStart (view, dates, dateRangeStart) {
		      if (dateRangeStart) {
		    	  var activeDate = moment(dateRangeStart).subtract(1, view).add(1, 'minute');
		        dates.filter(function (date) {
		          return date.localDateValue() <= activeDate.valueOf()
		        }).forEach(function (date) {
		          date.selectable = false;
		        })
		      }
        }
    	
    	return {
    		limitEnd:limitEnd,
    		limitStart:limitStart
         } 
         

        
    });
    
   
    
    /**
     * @description datetimepicker 區間 end
     * 
     * 
     * @notes Created by Ryan
     *          Created on 2017/07/20
     */
    commonServ.factory('datePickerEnd', function() {
         return 
        
    });
    
    
    /**
     * @description 假資料Resource
     * 
     * @notes Created by Ryan.Hsu
     *          Created on 2017/07/17
     */
    commonServ.factory('Resource', ['$q', '$filter', '$timeout', function ($q, $filter, $timeout) {

		//this would be the service to call your server, a standard bridge between your model an $http

		// the database (normally on your server)
		var randomsItems = [];

		function createRandomItem(id) {
			var heroes = ['Batman', 'Superman', 'Robin', 'Thor', 'Hulk', 'Niki Larson', 'Stark', 'Bob Leponge'];
			return {
				id: id,
				name: heroes[Math.floor(Math.random() * 7)],
				age: Math.floor(Math.random() * 1000),
				birthday:randomDate(new Date(1980, 0, 1), new Date(1995, 0, 1)),
				saved: Math.floor(Math.random() * 10000)
			};

		}
		
		function randomDate(start, end) {
		    return new Date(start.getTime() + Math.random() * (end.getTime() - start.getTime()));
		}

		for (var i = 0; i < 1000; i++) {
			randomsItems.push(createRandomItem(i));
		}


		//fake call to the server, normally this service would serialize table state to send it to the server (with query parameters for example) and parse the response
		//in our case, it actually performs the logic which would happened in the server
		function getPage(start, number, params) {

			var deferred = $q.defer();

			var filtered = params.search.predicateObject ? $filter('filter')(randomsItems, params.search.predicateObject) : randomsItems;

			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}

			var result = filtered.slice(start, start + number);

			$timeout(function () {
				//note, the server passes the information about the data set size
				deferred.resolve({
					data: result,
					numberOfPages: Math.ceil(filtered.length / number)
				});
			}, 500);


			return deferred.promise;
		}

		return {
			getPage: getPage
		};

	}]);
    
    

  });

  

})();