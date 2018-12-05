$(function(){
    $(".J_menuItem").on('click',function(){
    	var url = $(this).attr('href');
        $("#J_iframe").attr('src',url);
        $(".J_menuItem").css("color","#869fb1");
		$(this).css("color","white");
        return false;
    });
});