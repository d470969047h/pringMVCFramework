<%@ page import="java.net.HttpURLConnection" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>注册页面</title>
    <link href="<%=path%>/style/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=path%>/style/reg.css" rel="stylesheet" type="text/css"/>
    <script src="<%=path %>/js/my97/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
    <script type="text/javascript" src="<%=path%>/js/myJs.js"></script>
    <script src="<%=path%>/js/reg.js"></script>

    <script type="text/javascript">
        $(function () {
            $("#validImage").click(function () {
                document.getElementById("validImage").src = "<%=path%>/validCode/validCode.jsp?r=" + Math.random();
            });
        });

    </script>

</head>

<body>
<div id="header">
    <div id="headerTop">
        <img src="<%=path%>/images/logo.gif" alt="启奥实训"/>
    </div>
    <div id="mainMenu">
        <label class="reg">用户注册</label>
    </div>
</div>
<div id="left">
    <div class="ListItem">
        <div id="log" style="margin-top:10px;">
            <s:form method="post" action="reg" namespace="/reg" enctype="multipart/form-data" theme="simple">
                <div id="cmopd">
                    <ul>
                        <li><strong class="ltt">登录名：</strong><s:textfield name="user.userName" id="username"
                                                                          required="true"
                                                                          cssErrorStyle="border:1px dotted red"
                                                                          class="ltx"></s:textfield><span
                                id="nameSpan"></span></li>

                        <li><strong class="ltt">登录密码：</strong><s:password name="user.userPass" id="userpass"
                                                                          cssErrorStyle="border:1px dotted red"
                                                                          class="ltx"></s:password></li>

                        <li><strong class="ltt">确认密码：</strong><s:password name="user.userPass1" id="userpass1"
                                                                          class="ltx"></s:password></li>

                        <li><strong class="ltt">密码保护问题：</strong><s:textfield name="user.userPassQue" id="pass_question"
                                                                             class="ltx"></s:textfield></li>

                        <li><strong class="ltt">您的答案：</strong><s:textfield name="user.userPassAns" id="pass_ques_answer"
                                                                           class="ltx"></s:textfield></li>

                        <li><strong class="ltt">学校：</strong><s:select list="schoolList" name="user.TSchoolEntity.schoolId" headerKey="-1" headerValue="请选择学校" listKey="schoolId" listValue="schoolName"></s:select>
                        </li>

                        <li><strong class="ltt">出生日期：</strong><s:textfield name="user.birthday" id="birthday"
                                                                           class="ltx" onclick="WdatePicker()"
                                                                           readonly="true"></s:textfield></li>

                        <li><strong class="ltt">性 别：</strong><s:select list="sexList" name="user.TSexEntity.code" listKey="code" listValue="sexName"></s:select></li>

                        <li><strong class="ltt">所在地：</strong><s:textfield name="user.address" id="address"
                                                                          class="ltx"></s:textfield></li>

                        <li><strong class="ltt">昵 称：</strong><s:textfield name="user.nickName" id="nick_name"
                                                                          class="ltx"></s:textfield></li>

                        <li><strong class="ltt">头像：</strong><s:file name="userPhoto"></s:file></li>

                        <li><strong class="ltt">密保邮箱：</strong><s:textfield name="user.email" id="ques_email_addr"
                                                                           class="ltx"></s:textfield></li>

                        <li><strong class="ltt">验证码：</strong><s:textfield name="validcode" id="validcode" maxlength="4"
                                                                          class="lty" style="float:left;"></s:textfield>

                            <img src="<%=path%>/validCode/validCode.jsp" id="validImage"/></li>

                        <li><label style="margin-left:80px;">大家努把力！两天时间紧任务重啊！</label></li>

                        <li><strong class="ltt">&nbsp;</strong><s:checkbox name="agree" id="agree"
                                                                           class="ltc"></s:checkbox>同意服务条款
                        </li>
                    </ul>
                </div>
                <div id="cfopd">
                    <input type="submit" class="btn_sub" value="注册" />
                    <input type="reset" class="btn_res" value="重置"/>
                </div>

                <s:iterator value="FieldErrors">
                    <s:iterator value="value" status="status">
                        <script type="text/javascript">
                            alert("<s:property value='value.get(#status.index).toString()'/>");
                        </script>
                    </s:iterator>
                </s:iterator>
            </s:form>
        </div>
    </div>
</div>
<div id="footer">
    &copy; Copyright 2010. All rights shinowIT.com
</div>
</body>
</html>
