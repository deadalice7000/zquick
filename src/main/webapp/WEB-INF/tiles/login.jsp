<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<c:url var="loginUrl" value="/login" />

<div class="row">

	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel default">




			<div class="panel-heading">

				<div class="panel-title">log in!</div>
			</div>

			<form method="post" action="${loginUrl}">
			
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			
				<div class="input-group">
					<input type="text" name="username" placeholder="username" class="form-control" />
				</div>
				<div class="input-group">
					<input type="password" name="password" placeholder="password" class="form-control"/>
				</div>
				<div class="input-group">
				
				
					<button type="submit" class="btn-primary pull-right">Log in!</button>
				</div>
				
				
				<!-- TEST JESLI PARAMETER ERROR NIE JEST PUSTY WTEDY WYSKAKUJE ERROR XD -->
				<c:if test="${param.error !=null}">
					<font color="red"><b>Wrong username or password. Please try again!</b></font>
				</c:if>
				
				

			</form>

			<div class="panel-body"></div>




		</div>
	</div>
</div>