(function() {
  'use strict';
  
  var otherArgs = {};
  
  otherArgs.requireConfig = {

  };
  
  otherArgs.onloadFunc = function() {
    console.log('module1 - onload func start');
  };
  
  otherArgs.offloadFunc = function() {
  };
  
  /**
   * 注入stConfig 
   * 修改st-table的global參數
   */
  otherArgs.moduleConfigArgs = ['stConfig','$controllerProvider', function(stConfig,$controllerProvider) {
    console.log('module1 - config begin');
    /**
     * change pagination template to our template
     */
    stConfig.pagination.template = 'app/directives/templates/my-custom-pagination-tmpl.html';
    
  }];
  
  /**
   * 注入smart-table module
   */
  window.glfunc.buildNgController("captainView", ['smart-table'], ['$scope','Resource','$location','$anchorScroll','$filter',function(scope, resource, $location, $anchorScroll, $filter) {
	
	  $('pre code').each(function(i, block) {
		    hljs.highlightBlock(block);
	  });
	  
	  scope.scrollTo = function(id) {
		  var old = $location.hash();
		  $location.hash(id);
	      $anchorScroll();
	      $location.hash(old);
	   };
	   
	   require(['domReady'], function() {
	      require(['app', 'requireCss!mCustomScrollbarCss', 'mCustomScrollbar', 'requireCss!bootstrapSwitchCss', 'bootstrapSwitch'], function() {
	        $(".fsm-ship-info-body").mCustomScrollbar({
	          axis: 'y',
	          // scrollButtons:{enable:true},
	          theme:"dark-3"
	        });
	        $(".encounter-table").mCustomScrollbar({
	            axis: 'xy',
	            // scrollButtons:{enable:true},
	            theme:"dark-3"
	        });
	        // switch button
	        $(".switch input[type='checkbox']").bootstrapSwitch({
	            onText:'On',
	            offText:'Off'
	        });
	      });
	  });
      
	  require(['d3'], function(d3) {

	    /*
	     * Test: Show map
	     */
	    // --------------------------------------
	        var shipData;
	        var center = [12, 151];
	        var mapOptions = {
	            center: center,
	            zoom: 10,
	            startOver: true
	        };
	        var mapDivId = $('.map-box').attr('id');
	        var map = new L.Map(mapDivId, mapOptions);

	        var mapUrl = 'http://10.1.49.164:28080/styles/basic-v9/{z}/{x}/{y}.png';
	        var mapBasicLayer = L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
	          id: 'mapbox.streets'
	        }).addTo(map);
	        
	        var mapUrl2 = 'http://10.1.49.164:28080/styles/bright-v9/{z}/{x}/{y}.png';
	        var mapOSMLayer = L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
	          id: 'mapbox.satellite'
	        });
	     // --------------------------------------
	        

	        function Compass(containerId) {
	          
	          this.id = containerId;
            
	          /**
	           * 用 svg 的 viewBox 屬性調整整個羅盤的大小
	           */
            var viewWidth = 110;
            var viewHeight = 110;
            var width = 140;
            var height = 140;
	          var svg = d3.select('#' + this.id).append('svg')
	              .attr('id', 'compass')
	              .attr('width', viewWidth)
	              .attr('height', viewHeight)
	              .attr('viewBox', '0 0 ' + width + ' ' + height)
         
	          var compassColor = 'white';
	          var windDirectionColor = '#D0D3DC';

	          var circleSize = 90;
	          var compassCenter = 75;

	          this.compassGroup = svg.append('g');
	          
	          // compass border
	          this.compassGroup.append('circle')
	              .attr('cx', compassCenter)
	              .attr('cy', compassCenter)
	              .attr('r', circleSize / 2)
	              .attr('fill', 'none')
	              .attr('stroke', '#038592')
	              .attr('stroke-width', '1.5px')

	          // text indicator
	          var indicatorText = [
	            {'text': 'N',
	             'x' : function() {
                    var textWidth = this.getBBox().width / 2;
                    return compassCenter - textWidth;
	                },
	             'y' : function() {
	                  return 30 - this.getBBox().height / 2;
	                }
	             },
	             {'text': 'S',
	               'x' : function() {
                       var textWidth = this.getBBox().width / 2;
                         return compassCenter - textWidth;
	                },
	               'y' : 140
	               },
	               {'text': 'E',
	                 'x' : 126,
	                 'y' : function() {
	                    return 90 - this.getBBox().height / 2;
	                   }
	                 },
	                 {'text': 'W',
	                   'x' : 9,
	                   'y' : function() {
	                         return 90 - this.getBBox().height / 2;
	                       }
	                   },
	            ];
	          for (var i = 0; i<indicatorText.length; i++) {
	            this.compassGroup.append('text')
              .text(indicatorText[i].text)
              .attr('fill', '#038592')
              .style('font-size', '16px')
              .style('font-weight', 'bold')
              .attr('x', indicatorText[i].x)
              .attr('y', indicatorText[i].y)
	          }
	         
	          // direction mark
	          svg.append('defs').append('marker')
	              .attr('id', 'dArrow')
	              .attr('viewBox', '0 0 4 4')
	              .attr('refX', 2)
	              .attr('refY', 3.9)
	              .append('path')
	              .attr('d', 'M2 1 L0 4 L4 4 L2 1')
	              .attr('fill', '#038592')

	          // direction
	          this.direction = this.compassGroup.append('path')
	              .attr('d', 'M' + compassCenter + ' 50 V110')
	              .attr('stroke', '#038592')
	              .attr('stroke-width', 6)
	              .attr('marker-start', 'url(#dArrow)')
	          // arrow
	          this.arrow = this.compassGroup.append('polygon')
	              .attr('points', compassCenter + ',60 65,90 ' + compassCenter + ',80 85,90 ' + compassCenter + ',60')
	              .attr('fill', compassColor)

	          // wind mark
	          svg.append('defs').append('marker')
	              .attr('id', 'windArrow')
	              .attr('viewBox', '0 0 4 4')
	              .attr('refX', 2)
	              .attr('refY', 0.9)
	              .append('path')
	              .attr('d', 'M0 0 L2 3 L4 0 L0 0')
	              .attr('fill', windDirectionColor)

	          // wind indicator
	          this.wind = this.compassGroup.append('line')
	              .attr('x1', compassCenter)
	              .attr('y1', '35')
	              .attr('x2', compassCenter)
	              .attr('y2', '50')
	              .attr('stroke', windDirectionColor)
	              .attr('stroke-width', 6)
	              .attr('marker-end', 'url(#windArrow)')

	          var refresh = function(target, rotate) {
	              if (isNaN(rotate)) {
	                  return;
	              }
	              rotate = rotate % 360;
	              var currentRotate = 0;
	              if (target.attr('transform')) {
	                  currentRotate = target.attr('transform').split('rotate(')[1].split(',')[0];
	              }
	              target.transition()
	                  .duration(Math.abs(currentRotate - rotate) / 10 * 300) 
	                  // TODO: need to check speed.
	                  .attrTween("transform", function() {
	                      return d3.interpolateString("rotate(" + currentRotate + "," + compassCenter + ", " + compassCenter + ")", "rotate(" + rotate + "," + compassCenter + ", " + compassCenter + ")");
	                  });
	          }

	          this.refreshWind = function(rotate) {
	              refresh(this.wind, rotate);
	          }

	          this.refreshDirection = function(rotate) {
	              refresh(this.direction, rotate);
	          }

	          this.refreshArraw = function(rotate) {
	              refresh(this.arrow, rotate);
	          }

	      }

	      var compass = new Compass('compass');
	  });
  }], otherArgs);

})();