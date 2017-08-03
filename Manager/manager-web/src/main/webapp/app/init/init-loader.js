/* If you are not architect, Don't change the code in here */
(function() {
  'use strict';

	var INIT_GL_CONFIG_FILE = "init-config.json";
	var INIT_GL_ROUTE_FILE = "app/routes/route-config.json";
	
	// 讀取全域 Function
	require(['init-func'], function() {
				
				// 讀取全域變數設定檔
				window.glfunc.getJSON(INIT_GL_CONFIG_FILE, function(json) {
					window.glconfig = json;
					if(window.glconfig) {
					  window.glconfig.contentPath = window.glfunc.getContextPath();
					}
				}, false);
				
				// 讀取 route 設定檔, 之後可由後端權限控制
				window.glfunc.getJSON(INIT_GL_ROUTE_FILE, function(json) {
					window.glroute = json;
				}, false);


				// 讀取必要 js 資源
				require.config({
					paths : {
						domReady : window.glconfig.contentPath + '/webjars/requirejs-domready/2.0.1/domReady',
						angular : window.glconfig.contentPath + '/webjars/angularjs/1.5.8/angular',
						angularRoute : window.glconfig.contentPath + '/webjars/angular-route/1.5.8/angular-route',
						requireCss : window.glconfig.contentPath + '/assets/plugins/require-css/0.1.6/css.min',
						jquery : window.glconfig.contentPath + '/webjars/jquery/3.2.1/dist/jquery.min',
						mainCtrl : window.glconfig.contentPath + "/app/modules/main/main-ctrl",
						bootstrap : window.glconfig.contentPath + '/assets/plugins/bootstrap/3.3.7-fsm/js/bootstrap.min',
						commonServ : window.glconfig.contentPath + "/app/services/common-serv",
						commonDrtv : window.glconfig.contentPath + "/app/directives/common-drtv",
						smartTable : window.glconfig.contentPath + "/assets/plugins/smart-table/1.0.0/js/smart-table",
						jqueryUi : window.glconfig.contentPath + '/webjars/jquery-ui/1.12.1/jquery-ui.min',
						bootstrapSelect : window.glconfig.contentPath + '/webjars/bootstrap-select/1.12.1/dist/js/bootstrap-select.min',
						bootstrapSwitch : window.glconfig.contentPath + '/webjars/bootstrap-switch/3.3.2/dist/js/bootstrap-switch.min',
						moment : window.glconfig.contentPath + '/webjars/moment/2.18.1/min/moment-with-locales.min',
						angularBootstrap : window.glconfig.contentPath + '/webjars/angular-bootstrap/1.3.3/ui-bootstrap-tpls.min',
						angularAnimate : window.glconfig.contentPath + '/webjars/angular-animate/1.5.8/angular-animate.min',
						angularToastr : window.glconfig.contentPath + '/assets/plugins/angular-toastr/2.1.1/dist/angular-toastr.tpls',
						angularDatetimepicker : window.glconfig.contentPath + '/assets/plugins/angular-bootstrap-datetimepicker/1.1.4/src/js/datetimepicker',
						angularDatetimepickerTemp : window.glconfig.contentPath + '/assets/plugins/angular-bootstrap-datetimepicker/1.1.4/src/js/datetimepicker.templates',
						angularDatetimeInput : window.glconfig.contentPath + '/assets/plugins/angular-datetime-input/src/dateTimeInput',
						angularMutiSelect : window.glconfig.contentPath + '/assets/plugins/angular-muti-select/4.0.0/isteven-multi-select'
					},
					shim : {
						"angular": {
							deps: ["jquery"],
							exports: "angular"
						},
						"angularRoute": {
							deps: ["angular"]
						},
						"mainCtrl": {
							exports: "bootstrapMainCtrl"
						},
						"bootstrap" : {
						  deps: ["jquery"]
						},
						"smartTable" : {
						  deps: ["angular"]
						},
						"bootstrapSwitch" : {
						  deps: ["jquery","bootstrap"]
						},
						"angularBootstrap" : {
						  deps: ["angular"]
						},
						"angularAnimate" : {
						  deps: ["angular"]
						},
						"angularToastr" : {
						  deps: ["angular"]
						},
						"angularDatetimepickerTemp" :{
							deps: ["angularDatetimepicker","angularDatetimeInput"]
						},
						"angularMutiSelect" : {
							deps: ["angular"]
						}
					},
					deps : [ 'app/routes/route-loader.js' ], 
					urlArgs : "v=" + window.glconfig.version
				});
			});
})();