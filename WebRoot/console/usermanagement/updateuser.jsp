<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>会员用户添加</title>
  </head>

  <body>
    <form action="usermsg_updateUser.action" method="post">
    <input type="text" name="user.id" value="${user.id }" style="display: none;"/>
     用户名称：<input type="text" name="user.name" value="${user.name }"/><br/>
     用户邮箱:<input type="text" name="user.email" value="${user.email }"/><br/>
     是否激活:<input type="text" name="user.active" value="${user.active }"/><br/>
     用户类型:<input type="text" name="user.type" value="${user.active }"/><br/>
     用户级别:<input type="text" name="user.level" value="${user.active }"/><br/>
     用户状态:<input type="text" name="user.state" value="${user.active }"/><br/>
     <input type="submit" value="修改">
  </form>
  </body>
</html>
