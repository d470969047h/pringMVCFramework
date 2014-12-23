<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>blog首页</title>
<link href="<%=path%>/style/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
<link href="<%=path%>/paging/css/style.css" rel="stylesheet" type="text/css"/>
<script src="<%=path%>/paging/jquery.js"></script>
<script src="<%=path%>/paging/jquery.paginate.js"></script>
<script>
	$(function(){
	
		//导航鼠标悬浮
		$("#mainMenu a").mouseover(function(){
			var $thisA = $(this);
			$("#menuMasker").animate({left:($(this).offset().left-220)},500,function(){
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
	});
	
	//插件分页：
		$(function() {
			$("#demo2").paginate({
				count 		: $("#pageCount").val(),
				start 		: $("#pageIndex").val() ,
				display     : 5,
				border					: false,
				text_color  			: '#888',
				background_color    	: '#EEE',	
				text_hover_color  		: 'black',
				background_hover_color	: '#CFCFCF',
				
					onChange: function(page) {
						location.href = "<%=path%>/blogshow/blogShow.jsp?pageIndex=" + page;
					}
			});
		});
</script>

</head>
<body>
<s:hidden name="pageCount"  id="pageCount"></s:hidden>
<s:hidden name="pageIndex" id="pageIndex"></s:hidden>
<div id="header">
	<div id="headerTop">
    	<img src="<%=path%>/images/logo.gif" alt="启奥实训" />
        <div id="searchBox">
        	<div id="searchSpan">
            	<input type="text" id="keys" />
                <input type="button" id="searchSub" value="搜索" />
            </div>
       		<img id="search" src="<%=path%>/images/search.gif" alt="搜索" />
        </div>
    </div>
    <div id="mainMenu">
    	<img id="menuLeft" src="<%=path%>/images/menuLeft.gif" alt="左滑动" />
        <img id="menuRight" src="<%=path%>/images/menuRight.gif" alt="右滑动" />
        <img id="menuMasker" src="<%=path%>/images/menuBlock.gif" alt="蒙" />
        <ul>
        	<li><a href="<%=path%>/blogshow/blogShow.jsp" class="over">首 页</a></li>
            <li><a href="<%=path%>/bloglist/bloglist.jsp">日 志</a></li>
            <li><a href="<%=path%>/photoAlbum/photoAlbum.jsp">相 册</a></li>
            <li><a href="<%=path%>/friends/friends.jsp">博 友</a></li>
            <li><a href="<%=path%>/about/about.jsp">关 于</a></li>
        </ul>
    </div>
</div>
<div id="left">
	<s:iterator value="articleList" >
	<div class="ListItem">
    	<div class="ListItemTop">
        	<span>Posted by <s:property value="userinfo.nickName"/> in <img src="<%=path%>/images/ico2.gif" alt="文章分类" /> <a href="#" class="sort"><s:property value="articlecategory.categoryName"/></a> on <img src="<%=path%>/images/ico3.gif" alt="发布时间" /> <s:property value="articlePostTime" /> |</span>
            <img src="<%=path%>/images/x.gif" class="del" alt="关闭文章" />
        </div>
        <div class="ListItemContent">
        	<h1><a href="<%=path%>/blogShow.jsp" target="_blank"><s:property value="articleTitle"/></a></h1>
 			<div class="content">
				<s:property value="articleContent"/>
			</div>
            <div class="foot">
				<span class="tag">标签：<a href="#"><s:property value="label.labelName" /></a></span>
				<a href="<%=path%>/blogshowpage/blogShow" target="_blank" class="more">Read More</a>
            </div>
        </div>
    </div>
  </s:iterator>
  <%--
  		    <div class="pages">
    
    	<a href="<%=path%>/blogshowpage/blogShow">首页</a>
    	<s:iterator value="pageCount">
        <a href="<%=path%>/indexpage/index?pageNum=${indexButton-2}">sd</a>
        </s:iterator>
        <a href="<%=path%>/indexpage/index?pageNum=${pageCount}">末页</a>
    </div>
   --%>
   <div id="demo2">   
</div>

</div>
<div id="right">
	<div class="rightMenu">login</div>
    <div class="rightNr">
    
    	<s:form id="myForm" method="post" action="indexlogin" namespace="/blogshow" theme="simple">
    	<s:fielderror></s:fielderror>
        	<p><label>登录名：</label><input class="txt" type="text" id="userName" name="user.userName" /></p>
            <p><label>密 码：</label><input class="txt" type="password" id="userPass"  name="user.userPass"/></p>
            <p><input type="submit" id="subbut" value="登录" />&nbsp;
            	<a></a>
            </p>
        </s:form>
    </div>

	<div class="rightMenu">about us</div>
    <div class="rightNr">
    	唐山市启奥职业培训学校即唐山启奥IT实训基地，依托知名的专业化软件公司，致力于高端IT人才的培养。建筑面积2000多平方米，具有强大的师资队伍和教学管理团队以及设备精良的实训环境，是唐山市高校大学生就业见习基地。
    </div>
    
    <div class="rightMenu">articles Category</div>
    <div class="rightNr">
    	<ul>
        	<li>
            	<p class="reTag">
            	<a href="#">DOTNET</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="#">JAVA</a>
                </p>
            </li>
        	<li>
            	<p class="reTag">
            	<a href="#">美工实习</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="#">美工培训</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="#">企业运维</a>
                </p>
            </li>
		</ul>
    </div>
    
    <div class="rightMenu">random posts</div>
    <div class="rightNr">
    	<ul>
        	<li>
            	<p class="reName">
            	<a href="#">css 3.0 中文手册API</a>
                </p>
            </li>
            <li>
            	<p class="reName">
            	<a href="#">CSS禅意花园中文版PDF电子书下载</a>
                </p>
            </li>
            <li>
            	<p class="reName">
            	<a href="#">HTML5</a>
                </p>
            </li>
		</ul>
    </div>
    
    <div class="rightMenu">recent comments</div>
    <div class="rightNr">
    	<ul>
        	<li>
            	<p class="reName">
            	<a href="#">张三</a>
                </p>
                <p class="reNr">
                我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="#">李四</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="#">王五</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="#">赵六</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="#">冯七</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="#">马八</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        </ul>
    </div>
    
    <strong class="rightListTitle">STUDENTS</strong>
    <div class="rightList">
    	<ul>
        	<li><a href="#">张三</a> [唐山学院]</li>
        	<li><a href="#">李四</a> [煤炭医学院]</li>
        	<li><a href="#">王五</a> [河北理工]</li>
            <li><a href="#">赵六</a> [煤炭医学院]</li>
            <li><a href="#">冯七</a> [唐山学院]</li>
            <li><a href="#">马八</a> [河北理工]</li>
            <li><a href="#">西门庆</a> [师范学院]</li>
        </ul>
    </div>
    <strong class="rightListTitle">ARCHIVE</strong>
    <div class="rightList">
    	<ul>
        	<li><a href="#">2010.05</a> (5)</li>
        	<li><a href="#">2010.04</a> (4)</li>
        	<li><a href="#">2010.03</a> (3)</li>
            <li><a href="#">2010.02</a> (2)</li>
            <li><a href="#">2010.01</a> (1)</li>
            <li><a href="#">2009.12</a> (0)</li>
            <li><a href="#">2009.11</a> (1)</li>
            <li><a href="#">2009.10</a> (2)</li>
            <li><a href="#">2009.09</a> (3)</li>
        </ul>
    </div>
</div>

<div id="footer">
	&copy; Copyright 2010. All rights shinowIT.com
</div>
</body>
</html>
