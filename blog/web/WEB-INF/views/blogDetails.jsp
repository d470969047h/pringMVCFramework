<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%String path = request.getContextPath();%>
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
        <img id="menuMasker" src="<%=path%>/images/menuBlock.gif" style="left:120px;" alt="蒙" />
        <ul>
<li><a href="<%=path%>/blogshow/blogShow.jsp" >首 页</a></li>
            <li><a href="<%=path%>/bloglist/bloglist.jsp" class="over">日 志</a></li>
            <li><a href="<%=path%>/photoAlbum/photoAlbum.jsp">相 册</a></li>
            <li><a href="<%=path%>/friends/friends.jsp">博 友</a></li>
            <li><a href="<%=path%>/about/about.jsp">关 于</a></li>
        </ul>
    </div>
</div>

<div id="left">
	<s:iterator value="articleList">
	<div class="ListItem">
    	<div class="ListItemTop">
        	<span>当前位置 > 日志 ><s:property value="articleTitle"/></span>
        </div>
        <div class="contentBox">
			<s:property value="articleContent"/>
        </div>
        <a href="javascript:window.close()" style="float:right;margin-top:20px;">[关闭窗口]</a>
    </div>
    </s:iterator>
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
            	<a href="<%=path%>#">DOTNET</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="<%=path%>#">JAVA</a>
                </p>
            </li>
        	<li>
            	<p class="reTag">
            	<a href="<%=path%>#">美工实习</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="<%=path%>#">美工培训</a>
                </p>
            </li>
            <li>
            	<p class="reTag">
            	<a href="<%=path%>#">企业运维</a>
                </p>
            </li>
		</ul>
    </div>
    
    <div class="rightMenu">random posts</div>
    <div class="rightNr">
    	<ul>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">css 3.0 中文手册API</a>
                </p>
            </li>
            <li>
            	<p class="reName">
            	<a href="<%=path%>#">CSS禅意花园中文版PDF电子书下载</a>
                </p>
            </li>
            <li>
            	<p class="reName">
            	<a href="<%=path%>#">HTML5</a>
                </p>
            </li>
		</ul>
    </div>
    
    <div class="rightMenu">recent comments</div>
    <div class="rightNr">
    	<ul>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">张三</a>
                </p>
                <p class="reNr">
                我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">李四</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">王五</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">赵六</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">冯七</a>
                </p>
                <p class="reNr">
                我来说点啥.我来说点啥.我来说点啥.我来说点啥.我来说点啥.
                </p>
            </li>
        	<li>
            	<p class="reName">
            	<a href="<%=path%>#">马八</a>
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
        	<li><a href="<%=path%>#">张三</a> [唐山学院]</li>
        	<li><a href="<%=path%>#">李四</a> [煤炭医学院]</li>
        	<li><a href="<%=path%>#">王五</a> [河北理工]</li>
            <li><a href="<%=path%>#">赵六</a> [煤炭医学院]</li>
            <li><a href="<%=path%>#">冯七</a> [唐山学院]</li>
            <li><a href="<%=path%>#">马八</a> [河北理工]</li>
            <li><a href="<%=path%>#">西门庆</a> [师范学院]</li>
        </ul>
    </div>
    <strong class="rightListTitle">ARCHIVE</strong>
    <div class="rightList">
    	<ul>
        	<li><a href="<%=path%>#">2010.05</a> (5)</li>
        	<li><a href="<%=path%>#">2010.04</a> (4)</li>
        	<li><a href="<%=path%>#">2010.03</a> (3)</li>
            <li><a href="<%=path%>#">2010.02</a> (2)</li>
            <li><a href="<%=path%>#">2010.01</a> (1)</li>
            <li><a href="<%=path%>#">2009.12</a> (0)</li>
            <li><a href="<%=path%>#">2009.11</a> (1)</li>
            <li><a href="<%=path%>#">2009.10</a> (2)</li>
            <li><a href="<%=path%>#">2009.09</a> (3)</li>
        </ul>
    </div>
</div>

<div id="footer">
	&copy; Copyright 2010. All rights shinowIT.com
</div>
</body>
</html>
