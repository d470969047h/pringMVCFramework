<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>blog首页</title>
<link href="<%=path%>/style/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/js/myJs.js"></script>
</head>

<body>
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
        <img id="menuMasker" src="<%=path%>/images/menuBlock.gif" style="left:194px;" alt="蒙" />
        <ul>
			<li><a href="<%=path%>/blogshow/blogShow.jsp">首 页</a></li>
            <li><a href="<%=path%>/bloglist/bloglist.jsp">日 志</a></li>
            <li><a href="<%=path%>/photoAlbum/photoAlbum.jsp">相 册</a></li>
            <li><a href="<%=path%>/friends/friends.jsp">博 友</a></li>
            <li><a href="<%=path%>/about/about.jsp"  class="over">关 于</a></li>
        </ul>
    </div>
</div>

<div id="left">
	<div class="ListItem">
    	<div class="ListItemTop">
        	<span>当前位置 > 相册</span>
        </div>
        <div class="contentBox">
			<div class="photoBox">
            	<a href="<%=path%>/photoes.jsp"><img class="photoFace" src="<%=path%>/images/photoLogo.gif" alt="相册封面" /></a>
                <a href="<%=path%>/photoes.jsp">世界凶犬</a>
            </div>
        </div>
    </div>
    <div class="pages">
        <a href="#">首页</a>
        <a href="#">1</a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">末页</a>
    </div>
</div>

<div id="right">
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
