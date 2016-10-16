<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class=row>

	<div class="col-md-8 col-md-offset-2">



		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">Add a status update</div>
			</div>
			<div class="panel-body">
				<form:form commandName="statusUpdate">
					<div class="form-group">
						<form:textarea path="text" name="text" rows="10" cols="50"></form:textarea>
					</div>


					<input type="submit" name="submit" value="add status" />
				</form:form>

			</div>
		</div>


		<div class="panel panel-default">

			<div class="panel-heading">
				<div class="panel-title">
					Added on
					<c:out value="${latestStatusUpdate.added}" />
				</div>
					<c:out value="${latestStatusUpdate.text}" />
			</div>
		
		</div>
	</div>
</div>
