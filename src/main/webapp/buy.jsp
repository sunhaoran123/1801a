<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
英雄：<input type="text" name="hname">
价格：<input type="text" name="price">
阵营：<select name="cid">
<option value="1">南荒</option>
<option value="2">长安</option>
<option value="3">扶桑</option>
</select>
状态：<select name="status">
<option value="0">未拥有</option>
</select>
<a href="queryAll"><input type="button" value="提交"></a>

</body>
</html>