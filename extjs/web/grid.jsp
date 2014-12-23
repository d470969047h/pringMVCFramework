<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link href="extjs/resources/ext-theme-neptune/ext-theme-neptune-all.css" rel="stylesheet" type="text/css"/>
    <script src="extjs/ext-all.js" type="text/javascript"></script>
    <script src="ShiNow/study/grid.js" type="text/javascript"></script>
    <script src="extjs/locale/ext-lang-zh_CN.js" type="text/javascript"></script>
    <script>
        Ext.onReady(function(){
           Ext.create('ShiNow.study.grid',{
               renderTo:Ext.getBody()
           })
        });
    </script>
</head>
<body>

</body>
</html>
