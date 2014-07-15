<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://com.jrj.tag/em" prefix="em" %>
<%@ page import="java.util.*" %>
<%
	String path = request.getContextPath();
	ArrayList<String> values = new ArrayList<String>();
	values.add("zhouming");
	values.add("xiaoshou");
	values.add("minggou");
	pageContext.setAttribute("values", values);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
</head>
<body>
	<em:out></em:out>
	<em:if condition="${1==1}">
		if is validate
	</em:if>
	<em:foreach items="${pageScope.values}" var="val">
		<em:out></em:out>
		${val}
	</em:foreach>
	<%-- <em:foreach items="${values}" var="val">
		<em:out></em:out>
		${val}
	</em:foreach> --%>
	
</body>
</html>

