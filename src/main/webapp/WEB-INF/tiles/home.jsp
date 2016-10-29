<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- MAPPING  -->
<c:set var="url" value="/" />

<!-- DISPLAYING LATEST 3 NEWS WITH STILLING AND PAGGING -->

<div class="row">
	<c:forEach items="${page.content}" var="news">
		<div class="col-sm-5 col-lg-5 col-md-5">
			<div class="thumbnail">
				<div class="caption">
					<h4 class="pull-right">
						<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${news.added}" />
					</h4>
					<h4>
						<a href="/shownews/<c:out value="${news.title}"/>"><c:out
								value="${news.title}" /></a>
						<c:set var="newsContent" value="${news.content}" />
						<c:set var="shortNews"
							value="${fn:substring(newsContent, 0, 300)}" />
					</h4>
					<p>
						<c:set var="newsContent" value="${news.content}" />
						<c:set var="shortNews"
							value="${fn:substring(newsContent, 0, 300)}" />
						<c:out value="${shortNews}" />
					</p>
				</div>
				<div class="ratings">
					<p class="pull-right">15 comments</p>
					<p></p>
				</div>
			</div>
		</div>
	</c:forEach>


</div>
<div class="paggination">

	<a href="${url}?p=1">&larr;</a>
	<c:forEach var="pageNumber" begin="1" end="${page.totalPages}">
		<a href="${url}?p=${pageNumber}"><c:out value="${pageNumber}" /></a>
		<c:if test="${pageNumber != page.totalPages}">
						|
			</c:if>
	</c:forEach>
	<a href="${url}?p=${page.totalPages}">&rarr;</a>
</div>


