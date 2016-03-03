<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAuthenticated()">
<p>
	<a href="<c:url value='/j_spring_security_logout'/>">Log out</a> />
</p>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
<p>
	<a href="<c:url value='/login'/>">Log in</a> />
</p>
</sec:authorize>


<p>
	<a href="<c:url value='/admin'/>">Admin</a> />
</p>


