<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="row">

	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">


		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" href="#collapse1">Add a news</a>
				</h4>
			</div>
			<div id="collapse1" class="panel-collapse collapse">
				<div class="panel-body">

					<div>
						<label for="title">Title:</label> <input type="text"
							class="form-control" id="title">
					</div>

					<div>
						<label for="comment">Content</label>
						<textarea class="form-control" rows="5" id="comment"></textarea>
					</div>


				</div>
				<div class="panel-footer">
					<div>
						<button type="button" class="btn btn-default">Add</button>
						<button type="button" class="btn btn-default">Clear</button>
					</div>
				
				</div>
			</div>
		</div>


	</div>
</div>

