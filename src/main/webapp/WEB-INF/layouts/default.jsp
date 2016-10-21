<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<title><tiles:insertAttribute name="title" /></title>

<!-- Bootstrap -->
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/main.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<!-- Static navbar -->
	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/">Quick Java</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">Home	</a></li>
				<li class="active"><a href="/tutorials">Tutorials</a></li>
				<li class="active"><a href="/search">Search</a></li>
				<li class="active"><a href="/about">About</a></li>
				<li class="active"><a href="/contact">Contact</a></li>

			</ul>
			<ul class="nav navbar-nav navbar-right">

				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						Account <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
					<li><a href="/messages">Messages</a></li>
					<li><a href="/profile">Profile</a></li>
					<li role="separator" class="divider"></li>
						<li><a href="/tutorialsmanager">Tutorials manager</a></li>
						<li><a href="/newsmanager">News manager</a></li>
						<li><a href="/usersmanager">Users manager</a></li>
						<li><a href="/sendemails">Send emails</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="javascript:$('#logoutForm').submit();">Log out</a></li>
					</ul>
				</div>

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>
	
	<c:url var="logoutlink" value="/logout"/>
	<form id="logoutForm" method="post" action="${logoutlink}">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
	
		
	

	<div class="container">
		<tiles:insertAttribute name="content" />
	</div>


	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="container">
		
		<p class="navbar-text">All rights reserved. Site build by DEADALICE7000. Check qqdeadalice7000.blogspot.com</p>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/js/bootstrap.min.js"></script>



</body>
</html>