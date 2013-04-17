<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<<<<<<< HEAD
=======
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
>>>>>>> 55f1a018d5851b0ec8a81d74ac4f08fb569e2d9b

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<<<<<<< HEAD
    
    <title>欢迎进入后台管理页面</title>
	
	<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
 <script type="text/javascript" src="../js/consoleindex.js" charset="gbk"></script> 
=======
    <base href="<%=basePath%>">
    
    <title>欢迎进入后台管理页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
>>>>>>> 55f1a018d5851b0ec8a81d74ac4f08fb569e2d9b
  </head>
  
  <body>
    <ul>
<<<<<<< HEAD
       <li><a href="../column/column_list.action">栏目管理</a></li>
       <li><span id="usermsg" >用户管理</span>
        <ul style="display: none;" id="usermsgdet">
        <li><a href="">管理员用户管理</a>
        </li>
        <li><a href="">会员用户管理</a>
        </li>
        </ul>
       </li>
=======
       <li><a href="<%=path%>/column/column_list.action">栏目管理</a></li>
       <li><a href="<%=path%>/news/news_list.action">新闻管理</a></li>
       <li>用户管理</li>
>>>>>>> 55f1a018d5851b0ec8a81d74ac4f08fb569e2d9b
       <li>问题类型管理</li>
    </ul>
  </body>
</html>
