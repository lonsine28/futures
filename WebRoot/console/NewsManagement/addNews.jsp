<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>新闻管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div>
		<form action="<%=path %>/news/news_add.action" method=post>
		新闻栏目：<select name="column">
          <c:forEach items="${columnMap}" var="column" varStatus="index">
              <option>${column.key}</option>
          </c:forEach>
              
          </select><br>
                       新闻标题：<input type="text" name="title"><br>
                       新闻内容：<input type="text" name="content"><br>
                       新闻来源：<input type="text" name="resource"><br>
		 是否推荐：<input type="checkbox" name="recomend"><br>
		<input type="submit" value="增加"><br>
		</form>
	</div>
	
</body>
</html>
