
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="extjs/resources/ext-theme-neptune/ext-theme-neptune-all.css" rel="stylesheet" type="text/css"/>
    <script src="extjs/ext-all.js" type="text/javascript"></script>
    <script src="js/myLogin.js" type="text/javascript"></script>
    <script src="Extjs/locale/ext-lang-zh_CN.js" rel="script"></script>
    <script type="text/javascript">
        Ext.onReady(function(){
            Ext.create('ShiNowLogin',{
                renderTo:Ext.getBody()
            }).center();
        });
    </script>
    <title></title>
</head>
<body style="background: url(images/background.png);background-size: 100%" >

</body>
</html>
