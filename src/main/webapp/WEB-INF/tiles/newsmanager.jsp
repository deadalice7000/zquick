<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="row">
	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<!-- COLLAPSING MENU OR fORM OR ADDING NEWS -->
		<div class="panel panel-default">

			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" href="#addnews">Add a news</a>
				</h4>
			</div>


			<div id="addnews" class="panel-collapse collapse">
				<div class="panel-body">

					<form:form commandName="news">
						<div>
							<label for="title">Title:</label>
							<form:input path="title" type="text" name="title"
								class="form-control"></form:input>
							<label for="content">Content</label>
							<form:textarea path="content" name="content" rows="5"
								class="form-control"></form:textarea>

							<div></div>
						</div>

						<div class="panel-footer">
							<input type="submit" class="btn btn-default" value="Add" />


						</div>

					</form:form>

				</div>



			</div>

		</div>



		<!-- SECOND HIDDING -->
		<div class="panel panel-default">

			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" href="#showAllNews">Show all news</a>
				</h4>
			</div>



			<div id="showAllNews" class="panel-collapse collapse">

				<!-- DISPLAYING ALL NEWS, WITH EDIT AND DELETE BUTTON -->

				<c:forEach items="${allNews}" var="news">
					<div class="panel-body">
						<c:out value="${news.title}" />
						created on
						<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${news.added}" />
						<a href="<c:url value='/newsmanager/delete${news.id}' />">Delete</a>
						<div class="panel-footer">
							<c:out value="${news.content}" />
						</div>
					</div>
				</c:forEach>
			</div>


		</div>

	</div>

</div>


