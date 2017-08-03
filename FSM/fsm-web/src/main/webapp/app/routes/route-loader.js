/* If you are not architect, Don't change the code in here */
(function() {
  'use strict';

  define([ "require", "angular", "mainCtrl", "angularRoute", "jquery", "bootstrap", "commonServ", "commonDrtv","smartTable","angularAnimate","angularToastr","moment","angularMutiSelect", 'd3', 'requireCss!leafletCss', 'leaflet'],
  	function(requireLoad, angular, mainCtrl, moment) {
  		var mainApp = angular.module('mainApp', ['ngRoute', 'commonServ', 'commonDrtv','ngAnimate', 'isteven-multi-select']);
  		console.log("route-loader.js");
  		//載入 main controller
  		mainCtrl(mainApp);
  		
  		/* 覆寫 angular.module */
  		(function(orig) {
  		    angular.module = function() {
  		        return orig.apply(null, arguments);
  		    }
  		})(angular.module);
  		
  		
  		/* 延遲載入 module function */
  		angular._lazyLoadModule = function(moduleName) {
  			var m = angular.module(moduleName);
  			var $injector = angular.element(document).injector();
  			// 遞迴載入 module
  			angular.forEach(m.requires, function(r) {
  				angular._lazyLoadModule(r);
  			});
  			
  			if(m._invokeQueue) {
  				angular.forEach(m._invokeQueue, function(invokeArgs) {
  					try {
  						var searchName = invokeArgs[2][0] + invokeArgs[1].charAt(0).toUpperCase() + invokeArgs[1].slice(1);
  						if(!mainApp.providers.$injector.has(searchName)) {
  							var provider = mainApp.providers.$injector.get(invokeArgs[0]);
  							provider[invokeArgs[1]].apply(provider, invokeArgs[2]);
  						}
  					} catch (e) {
  						console.error('load module invokeQueue failed:'
  								+ e.message, invokeArgs);
  					}
  				});
  			}
  			
  			if(m._configBlocks) {
  				angular.forEach(m._configBlocks, function(invokeArgs) {
  					try {
  						var searchName = invokeArgs[2][0] + invokeArgs[1].charAt(0).toUpperCase() + invokeArgs[1].slice(1);
  						if(!mainApp.providers.$injector.has(searchName)) {
  							mainApp.providers.$injector.invoke.apply(mainApp.providers.$injector,
  									invokeArgs[2]);
  						}
  					} catch (e) {
  						console.error('load module configBlocks failed:'
  								+ e.message, invokeArgs);
  					}
  				});
  			}
  			
  			if(m._runBlocks) {
  				angular.forEach(m._runBlocks, function(fn) {
  					$injector.invoke(fn);
  				});
  			}
  		};
  		
  		
  		/* 載入自動載入 route 設定 */
  		mainApp.config(['$injector', '$locationProvider', '$routeProvider', '$controllerProvider',
  					function($injector, $locationProvider, $routeProvider, $controllerProvider) {
  			
  						mainApp.providers = {
  							$injector : $injector,
  							$controllerProvider : $controllerProvider
  						};
  						
  						if(window.glroute && window.glroute.modules) {
  							
  							var routeProvider = $routeProvider;
  							var baseModulePath = window.glconfig.contentPath + "/app/modules"
  							angular.forEach(window.glroute.modules, function(module, key) {
  							  
  								var routePath = (typeof module === 'string')? module:module['path'];
  								if(routePath && "" != routePath) {
                    var moduleFilePath = baseModulePath + routePath + "/" + routePath.substring(routePath.lastIndexOf("/") + 1);
                    var template = (module['template'])? module['template']:(moduleFilePath + ".html");
                    var controller = (module['controller'])? module['controller']:(moduleFilePath + "-ctrl.js");
  									var providerConfig = {};
  									var usingTemplateFile = false;
  									var glrouteConfig = window.glroute;
  									//驗證及鎖定特定檔案格式才能當 template file, 未符合條件當字串 template 處理
  									if(glrouteConfig && glrouteConfig.templateFileExt 
  											&& Array.isArray(glrouteConfig.templateFileExt) 
  											&& glrouteConfig.templateFileExt.length > 0) {
  										
  										for(var i = 0, tmpeSize = glrouteConfig.templateFileExt.length; i < tmpeSize; i++) {
  											if(template.endsWith(glrouteConfig.templateFileExt[i]) ) {
  												usingTemplateFile = true;
  												break;
  											}
  										}
  									}
  									
  									if(usingTemplateFile) {
  										providerConfig.templateUrl = template;
  									}
  									else {
  										providerConfig.template = template;
  									}
  									
  									if(controller && "" != controller) {
  										providerConfig.controllerUrl = controller;
  										providerConfig.offload = [];
  
  										providerConfig.resolve = {
  												load: ['$q', function($q) {
  													var defer = $q.defer();
  													requireLoad([controller], function(loader) {
  														loader.onload && loader.onload(function() {
  															defer.resolve();
  														});
  														loader.initOffloadFunc && loader.initOffloadFunc(providerConfig.offload);
  													});
  													return defer.promise;
  												}]
  										};
  									}
  									
  									routeProvider = routeProvider.when(routePath, providerConfig);
  								}	
  							});
  							
  							// default 路徑
  							routeProvider.otherwise({
  								template : '<div>path not found</div>',
  							});
  							
  						}					
  		}]);
  		
  		mainApp.run(function($rootScope) {
  			$rootScope.$on("$routeChangeStart", function(event, next, current) {
  			  if(next && next.$$route) {
  			    if(current && current.$$route) {
  			      if(current.$$route.offload && current.$$route.offload.length > 0) {
  			        current.$$route.offload[0]();
  			      } 
  			      require.undef(current.$$route.controllerUrl);
  	          //TODO 後端驗證該使用者是否有讀取頁面的權限
  			    }
  			  }
  			  else {
  			    event.preventDefault();
  			  }
  			});
  		});
  		
  		angular.bootstrap(document, ['mainApp']);
  });
})();