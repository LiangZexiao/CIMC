$(function(){

	// 侧边导航栏三级展开逻辑
	$('.third-menu-toggle').mouseenter(function(event) {
		console.log('mouseover');
		$(this).children('.dropdown-menu').show();
	}).mouseleave(function(event) {
		$(this).children('.dropdown-menu').hide();
	});;
})