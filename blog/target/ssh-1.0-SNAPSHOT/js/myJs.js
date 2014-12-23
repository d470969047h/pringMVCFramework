$(function(){
	
	//导航鼠标悬浮
	$("#mainMenu a").mouseover(function(){
		var $thisA = $(this);
		$("#menuMasker").animate({left:($(this).offset().left-258)},500,function(){
			$(".over").removeClass();
			$thisA.addClass("over");
		});
	});
	
	//导航向左滚动
	$("#menuLeft").click(function(){
		if($("#menuMasker").position().left > 50)
		{
			$("#menuMasker").animate({left:($("#menuMasker").position().left-73)},500,function(){
				var $prevA = $(".over").parent().prev().find("a");
				$(".over").removeClass();
				$prevA.addClass("over");
			});
		}
	});
	
	//导航向右滚动
	$("#menuRight").click(function(){
		if($("#menuMasker").position().left < 340)
		{
			$("#menuMasker").animate({left:($("#menuMasker").position().left+73)},500,function(){
				var $prevA = $(".over").parent().next().find("a");
				$(".over").removeClass();
				$prevA.addClass("over");
			});
		}
	});
	
	//搜索菜单
	$sear = false;
	$("#search").mouseover(function(){
		if($sear)
		{
			$sear = false;
			$("#searchSpan").slideUp(401);
		}
		else
		{
			$sear = true;
			$("#searchSpan").slideDown(410);
		}
	});
	
	//右侧菜单展开
	$(".rightMenu").toggle(
		function(){
			$(this).next().slideDown(500);
			$(this).removeClass().addClass("rightMenu2");
		},
		function(){
			$(this).next().slideUp(500);
			$(this).removeClass().addClass("rightMenu");
		}
	);
	
	//移除文章
	$(".del").click(function(){
		$(this).closest(".ListItem").fadeOut(800,function(){
			$(this).closest(".ListItem").remove();
		});
	});
	
	//相册浏览
	$(".photoS").click(function(){
		$thisPhoto = $(this);
		$offset = $("#photoShow").offset();
		$("#photoShow").animate({"filter":"alpha(opacity=0)","-moz-opacity":"0","opacity":"0"},200,function(){
			$thisPhoto.after("<img src='images/"+$thisPhoto.attr("name")+".gif' width='50' />").next().css({"position":"absolute","top":$thisPhoto.offset().top,"left":$thisPhoto.offset().left}).animate({"left":$offset.left,"top":$offset.top,"width":$(this).width()},500,function(){
				$("#photoShow").attr("src","images/"+$thisPhoto.attr("name")+".gif").animate({"filter":"alpha(opacity=100)","-moz-opacity":"1","opacity":"1"},1);
				$(this).remove();
			});;
		});						
	});
})