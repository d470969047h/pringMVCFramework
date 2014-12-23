<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%String path= request.getContextPath();%>
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
        <img id="menuMasker" src="<%=path%>/images/menuBlock.gif" style="left:340px;" alt="蒙" />
        <ul>
<li><a href="<%=path%>/blogshow/blogShow.jsp" >首 页</a></li>
            <li><a href="<%=path%>/bloglist/bloglist.jsp">日 志</a></li>
            <li><a href="<%=path%>/photoAlbum/photoAlbum.jsp">相 册</a></li>
            <li><a href="<%=path%>/friends/friends.jsp">博 友</a></li>
            <li><a href="<%=path%>/about/about.jsp" class="over">关 于</a></li>
        </ul>
    </div>
</div>
<div id="left">
	<div class="ListItem">
    	<div class="ListItemTop">
        	<span>当前位置 > 关于我们</span>
        </div>
        <div class="contentBox">
		<p>
		<s:property value="about.aboutContent"/>	
		</p>
        </div>
    </div>
</div>
<div id="right">    
    <div class="rightMenu">articles Category</div>
    <div class="rightNr">
    	<ul>
    	<s:iterator value="artcList">
        	<li>
            	<p class="reTag">
            	<a href="#"><s:property value="categoryName"/></a>
                </p>
            </li>
            </s:iterator>
		</ul>
    </div>
    
    <div class="rightMenu">random posts</div>
    <div class="rightNr">
    	<ul>
    	<s:iterator value="articleList">
        	<li>
            	<p class="reName">
            	<a href="#"><s:property value="articleTitle"/></a>
                </p>
            </li>
            </s:iterator>
		</ul>
    </div>
    <strong class="rightListTitle">STUDENTS</strong>
    <div class="rightList">
    	<ul>
    	<s:iterator value="userList">
        	<li><a href="#"><s:property value="userName"/> </a> [<s:property value="schoolId.schoolName"/>]</li>
        	</s:iterator>
		</ul>
    </div>    
<div id="footer">
	&copy; Copyright 2010. All rights shinowIT.com
</div>
</body>
</html>