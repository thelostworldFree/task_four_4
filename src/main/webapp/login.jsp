<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Login</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>
<body>
<center>
<h1>用户登录</h1>
    <p style="color:red">${error}</p>
<hr>
<form name="" action="/Login" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="pwd" name="pwd" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="登录"/>&nbsp;&nbsp;<button><a
                    href="/register">注册</a></button></td>
        </tr>
    </table>
</form>
</center>
</body>
</html>
