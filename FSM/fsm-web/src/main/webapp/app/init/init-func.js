(function() {
  'use strict';
	
	var INIT_GL_JS_FILE = "init-func.js";
	
	window.glfunc = {
		/**
		 * @description 使用原生 javascript, 取得 json 檔案
		 * 
		 * @param filePath : json 檔案路徑
		 * @param callbackFunc : callback function
		 * @param async : 是否異步
		 * 
		 * @notes Created by Tabris
		 * 					Created on 2016/10/21
		 */
		getJSON : function(filePath, callbackFunc, async) {
			
			if(filePath && callbackFunc) {
				var dir = "";
				var isAsync = (async!=false)?true:false;
				// 確認檔案路徑是否為相對或絕對路徑, 如不是, 則以 INIT_GL_JS_FILE 所在位置為主
				if(filePath.indexOf("/") == -1) {
					var scriptDom = document.querySelector('script[src*="'+INIT_GL_JS_FILE+'"]');
					if(scriptDom) {
						var src = scriptDom.getAttribute('src');
						dir = src.substring(0, (src.lastIndexOf("/") + 1));
					}
				}

				var xobj = new XMLHttpRequest();
				xobj.overrideMimeType("application/json");
				xobj.open('GET', dir + filePath, isAsync);
				xobj.onreadystatechange = function() {
					if (xobj.readyState == 4 && xobj.status == "200") {
						var json;
						try {
							json = JSON.parse(xobj.responseText);
						} catch(ex) {
							json = {};
						}
						callbackFunc(json);
					}
				};
				xobj.send(null);
			}
		},
		/**
     * @description 使用原生 javascript, 取得 ContextPath
     * 
     * @notes Created by Tabris
     *          Created on 2017/07/07
     */
		getContextPath : function() {
		   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
		},
		
		
		
		/**
     * @description build angular's controller
     * 
     * @param moduleId : module identity key
     * @param loadModules : new controller dependent on other modules 
     * @param controllerArgs : controller's arguments
     * @param otherArgs : you can configure 
     *        "onloadFunc" : call this function before load controller, 
     *        "offloadFunc" : call this function before change other controller, 
     *        "requireConfig" : using requireJs load other js file in controller, 
     *        "moduleConfigArgs" : angular's config setting
     * 
     * @notes Created by Tabris
     *          Created on 2017/07/10
     */
		buildNgController : function(moduleId, loadModules, controllerArgs, otherArgs) {
		  if(moduleId && loadModules && controllerArgs) {
		    define(["angular"], function(angular) {
		      
	        var onloads = [];
	        var requirePaths = [];
	        
	        if(otherArgs && otherArgs.onloadFunc) {
	          onloads.push(otherArgs.onloadFunc);
	        }
	        
	        if(otherArgs && otherArgs.requireConfig) {
	          require.config(otherArgs.requireConfig);
	          if(otherArgs.requireConfig.loadPaths) {
	            requirePaths = otherArgs.requireConfig.loadPaths;
	          }
	        }
	        
	        require(requirePaths, function() { //require injection, not yet released
	          
	         var angularModule = angular.module(moduleId, loadModules);
	         if(otherArgs && otherArgs.moduleConfigArgs) {
	           angularModule.config(otherArgs.moduleConfigArgs);
	         }
	         
	         angularModule.controller(moduleId + 'Ctrl', controllerArgs);
	          
	          //lazyLoad
	          angular._lazyLoadModule(moduleId);
	          
	          angular.forEach(onloads, function(onload) {
	            angular.isFunction(onload) && onload();
	          });
	        });
	        
	        return {
	          onload: function(callback) {
	            onloads.push(callback);
	          },
	          initOffloadFunc: function(offload) {
	            if(otherArgs && otherArgs.offloadFunc) {
	              offload.push(otherArgs.offloadFunc);
	            }
	          }
	        };
	      });
		  }
		  else {
		    alert("Error：moduleId, loadModules or controllerArgs Not Found")
		  }
		}
	
	
	
	};
})();