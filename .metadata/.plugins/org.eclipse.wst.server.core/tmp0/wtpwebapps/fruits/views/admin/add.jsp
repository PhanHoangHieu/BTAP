<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/css/add.css' />">
</head>
<body>
	<div class="col-md-4 col-md-offset-4" id="login">
		<section id="inner-wrapper" class="login">
			<article>
				<form action="<c:url value="/addUser"/>" method="post">
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user">
							</i></span> <input type="text" name="fullname" class="form-control"
								placeholder="FullName">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-envelope">
							</i></span> <input type="email" name="email" class="form-control"
								placeholder="Email Address">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-envelope">
							</i></span> <input type="text" name="username" class="form-control"
								placeholder="UserName">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-key">
							</i></span> <input type="password" name="password" class="form-control"
								placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-key">
							</i></span> <input type="password" name="passwordConfirm"
								class="form-control" placeholder="Confirm Password">
						</div>
					</div>

					<div class="form-group">
						<div class="input-group">
							<select class="browser-default custom-select" name ="role">
								<option value="1">Administrator</option>
								<option value="0">User</option>
								<option value="2">Guest</option>
							</select>
						</div>
					</div>
					<input type="submit" value="Add" name="add">
				</form>
			</article>
		</section>
	</div>
</body>
</html>
