<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>




<c:forEach items="${allNews}" var="news">
	<a href="/shownews/<c:out value="${news.title}"/>"><c:out value="${news.title}"/></a><br>
		
				<c:set var="newsContent" value="${news.content}"/>
<c:set var="shortNews" value="${fn:substring(newsContent, 0, 300)}" />
				
				
				<c:out value="${shortNews}"/><br>
				
							created on
				<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${news.added}" /><br>
				
		<br>
</c:forEach>






