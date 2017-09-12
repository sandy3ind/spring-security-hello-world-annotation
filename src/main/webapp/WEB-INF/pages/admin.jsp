<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Admin Page</title>
	</head>
	<body>
		<h1>This is Admin Page</h1>
		<h3>Title : ${title}</h3>
		<h3>Message : ${message}</h3>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h3>Welcome : ${pageContext.request.userPrincipal.name}
				| <a href="<c:url value="/logout" />" > Logout</a></h3>
		</c:if>
		
	</body>
</html>