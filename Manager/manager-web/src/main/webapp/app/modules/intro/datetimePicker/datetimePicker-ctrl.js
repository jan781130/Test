(function() {
  'use strict';
  
  var otherArgs = {};
  
  otherArgs.requireConfig = {
    paths: {
      'highlight':"//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min",
      'highlight-css':"/Manager/assets/plugins/heightlight/9.12.0/styles/atom-one-dark"
    },
    loadPaths: ["angularDatetimepickerTemp","highlight","requireCss!highlight-css"]
  };
  
  otherArgs.onloadFunc = function() {
    console.log('module1 - onload func start');

  };
  
  otherArgs.offloadFunc = function() {
	require.undef('angularDatetimepickerTemp');
    require.undef('highlight');
    require.undef('requireCss!highlight-css');
    require.undefCss('highlight-css');
    console.log('module1 - offload func start');
  };
  
  otherArgs.moduleConfigArgs = [ '$controllerProvider', function($controllerProvider) {
    console.log('module1 - config begin');
    
  }];
  
  /**
   * 注入toastr  需要要改toastr Config再注入toastrConfig
   */
  window.glfunc.buildNgController("datetimePicker", ['ui.bootstrap.datetimepicker','ui.dateTimeInput'], ['$scope','$location','$anchorScroll', '$log','datePickerRange', function($scope, $location, $anchorScroll, $log, datePickerRange) {
	
	 
	  /**
	   *  Config 參數
	   *  {
	   *  	dropdownSelector : '#dropdown Id', //toggle dropdown當selected
	   *  	startView : 'minute|hour|day|month|year', //dropdown打開的init view, Default day
	   *  	minView : 'minute|hour|day|month|year', //dropdown結束的view,必須 =< startView, Default minute
	   *    minuteStep : number, // minute view increment, default 5
	   *    configureOn : 'event-name', //listen event-name,當觸發時重新讀Config檔, default null
	   *    renderOn : 'event-name', //listen event-name,當觸發時重新render dateObject, default null
	   *    modelType : 'Date | moment | milliseconds | other string' //回傳model型態, defult Date。 P.S. other string小心使用 假如設定yyyy/mm/dd，input型態對不起來會報錯
	   *  }
	   */
	 
	  	  
	  $scope.basicConfig = {
			dropdownSelector: '#dropdown1'
	  };
	  
	  //<---------------call back function start(不需要可以不要用)---------->
	  
	  /**
	   * desp : datetime Picker 啟動前執行的function
	   * param : $view render的view name
	   *         $dates array of DateObject's (可被選擇的 DateObject)
	   *         $leftDate  點選← 傳回的 DateObject
	   *         $upDate    點選上方文字 傳回的 DateObject
	   *         $rightDate 點選→ 傳回的 DateObject
	   */	 	  
	  $scope.basicBeforeRender = function($view, $dates, $leftDate, $upDate, $rightDate){
			  console.log('啟動');
			  console.log('$view='+$view);
			  console.log('$dates='+$dates);
			  console.log('$leftDate='+$leftDate);
			  console.log('$upDate='+$upDate);
			  console.log('$rightDate='+$rightDate);
	  }
	  
	/**      自己看
	  * 	 DateObject {
	  *		    utcDateValue: Number - UTC time value of this date object. It does NOT contain time zone information so take that into account when comparing to other dates (or use localDateValue function).
	  *		    localDateValue: FUNCTION that returns a Number - local time value of this date object - same as moment.valueOf() or Date.getTime().
	  *		    display: String - the way this value will be displayed on the calendar.
	  *		    active: true | false | undefined - indicates that date object is part of the model value.
	  *		    selectable: true | false | undefined - indicates that date value is selectable by the user.
	  *		    past: true | false | undefined - indicates that date value is prior to the date range of the current view.
	  *		    future: true | false | undefined - indicates that date value is after the date range of the current view.
	  *		}
	  */	  
	  
	  /**
	   * desp : datetime Picker 選擇完時間後執行Call Back
	   * param : newDate 新選擇時間
	   *         oldDate 原選擇時間 
	   */ 	  
	  $scope.basicTimeSet = function(newDate,oldDate){
		  console.log(newDate);
		  console.log(oldDate);
	  }
	  
	//<---------------call back function end---------->
	  
	  
	  
	  var validViews = ['year', 'month', 'day', 'hour', 'minute'];
	    var selectable = true;

	    $scope.controllerName = 'demoController';

	    /* Bindable functions
	     -----------------------------------------------*/
	    $scope.beforeRender = beforeRender;
	    $scope.changeConfig = changeConfig;
	    $scope.checkboxOnTimeSet = checkboxOnTimeSet;
	    $scope.configFunction = configFunction;
//	    $scope.getLocale = getLocale;
	    $scope.guardianOnSetTime = guardianOnSetTime;
	    $scope.inputOnTimeSet = inputOnTimeSet;
	    $scope.renderOnBeforeRender = renderOnBeforeRender;
	    $scope.renderOnClick = renderOnClick;


//	    $scope.setLocale = setLocale;
//	    $scope.startDateBeforeRender = startDateBeforeRender
//	    $scope.startDateOnSetTime = startDateOnSetTime

//	    moment.locale('en');

	    $scope.config = {
	      datetimePicker: {
	        startView: 'year'
	      }
	    };

	    $scope.data = {
	      guardians: [
	        {
	          name: 'Peter Quill',
	          dob: null
	        },
	        {
	          name: 'Groot',
	          dob: null
	        }
	      ]
	    };

	    $scope.config = {
	      configureOnConfig: {
	        startView: 'year',
	        configureOn: 'config-changed'
	      },
	      renderOnConfig: {
	        startView: 'year',
	        renderOn: 'valid-dates-changed'
	      }
	    };

	    function checkboxOnTimeSet () {
	      $scope.data.checked = false;
	    }

	    function inputOnTimeSet (newDate) {
	      // If you are not using jQuery or bootstrap.js,
	      // this will throw an error.
	      // However, can write this function to take any
	      // action necessary once the user has selected a
	      // date/time using the picker
	      $log.info(newDate);
	      $('#dropdown3').dropdown('toggle');
	    }

//	    function getLocale () {
//	      return moment.locale();
//	    }

//	    function setLocale (newLocale) {
//	      moment.locale(newLocale);
//	    }

	    function guardianOnSetTime ($index, guardian, newDate, oldDate) {
	      $log.info($index);
	      $log.info(guardian.name);
	      $log.info(newDate);
	      $log.info(oldDate);
	      angular.element('#guardian' + $index).dropdown('toggle');
	    }

	    function beforeRender ($dates) {
	      var index = Math.ceil($dates.length / 2);
	      $log.info(index);
	      $dates[index].selectable = false;
	    }

	    function configFunction () {
	      return {startView: 'month'};
	    }

	    function changeConfig () {
	      var newIndex = validViews.indexOf($scope.config.configureOnConfig.startView) + 1;
	      console.log(newIndex);
	      if (newIndex >= validViews.length) {
	        newIndex = 0;
	      }
	      $scope.config.configureOnConfig.startView = validViews[newIndex];
	      $scope.$broadcast('config-changed');
	    }

	    function renderOnBeforeRender ($dates) {
	      angular.forEach($dates, function (dateObject) {
	        dateObject.selectable = selectable;
	      });
	    }

	    function renderOnClick () {
	      selectable = (!selectable);
	      $scope.$broadcast('valid-dates-changed');
	    }


	    
		  $('pre code').each(function(i, block) {
			    hljs.highlightBlock(block);
		  });
		  
		  $scope.scrollTo = function(id) {
			  var old = $location.hash();
			  $location.hash(id);
		      $anchorScroll();
		      $location.hash(old);
		   };	    
	  
			$scope.startDateOnSetTime = function () {
			      $scope.$broadcast('start-date-changed');
		    }
			
			$scope.endDateOnSetTime = function () {
			      $scope.$broadcast('end-date-changed');
		    }
			
			$scope.startDateBeforeRender = function($view, $dates){
				datePickerRange.limitEnd($view, $dates, $scope.dateRangeEnd);
			}
			
			$scope.endDateBeforeRender = function($view, $dates){
				datePickerRange.limitStart($view, $dates, $scope.dateRangeStart);
			}
			
			$scope.startLimitBeforeRender = function($view, $dates){
				datePickerRange.limitStart($view, $dates, new Date());
			}
		    
			$scope.endLimitBeforeRender = function ($view, $dates){
				datePickerRange.limitEnd($view, $dates, new Date());
			}
	  
  }], otherArgs);
  

  
})();