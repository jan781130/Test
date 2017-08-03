/* ================================================================
  FSM (2017)
================================================================ */
(function() {
  // js start

  // *** app-layout-menu" *** //
  $('.fsm-layout-menu .dropdown>a').click(function() {
      var _open = ($(this).parent().hasClass('open')) ? true : false;
      console.log(_open);
      event.stopPropagation();
      $(this).parent().parent().find('.dropdown').removeClass('open');
      // $(this).parent().toggleClass('open');
      if (_open == false) {
        $(this).parent().addClass('open');
      }
      // console.log('ddddd');
    })
    // 
  $('.btn-turn-menu').click(function() {
    $('body').toggleClass('open');
  });
  // 
  $('.map-list .header-btn>a').click(function() {
    $('.map-list').toggleClass('open');
  });
  // 
  $('.shipInfo-box .header-btn>a').click(function() {
    $(this).parent().parent().parent().toggleClass('open');
  });
  //
  // 
  $('.fsm-ship-encounter .btn').click(function() {
    $(this).parent().toggleClass('open');
  });
  $('.tools-setting>.btn-tools , .tools-filter>.btn-tools , .tools-playback>.btn-tools').click(function() {
    // console.log($(this).parent().hasClass('open'));
    if($(this).parent().hasClass('open')) {
      $('.tools-setting>.btn-tools , .tools-filter>.btn-tools , .tools-playback>.btn-tools').parent().removeClass('open');
    }else {
      $('.tools-setting>.btn-tools , .tools-filter>.btn-tools , .tools-playback>.btn-tools').parent().removeClass('open');
      $(this).parent().addClass('open');
    }
  });

  // RWD UI Behavior
  var _win_w = $(window).innerWidth();
  var _win_h = $(window).innerHeight();
  // console.log('win-w : '+_win_w+' ; win-h : '+_win_h);
  // if(_win_w<767){//小版時
  //   // console.log(($('.panel').hasClass('fms-map')))
  //   $('.panel').hasClass('fms-map')?_fms_map_min_ui ():'';
  // }
  // *** nav menu *** //

  //
})();