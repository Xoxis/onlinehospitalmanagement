<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Account</title>

<link
	href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css"
	
	rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="col-md-6 col-md-offset-3">
		<sf:form method="post" class="form-horizontal"
			action="${pageContext.request.contextPath}/createaccount"
			commandName="user">
			<fieldset>

				<!-- Form Name -->
				<legend>Notice</legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="textinput">name</label>
					<div class="col-md-6">
						<sf:input id="username" path="username" name="username" type="text"
							placeholder="entername" class="form-control input-md" />

						<sf:errors path="username" cssClass="alert-danger"></sf:errors>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="email">email</label>
					<div class="col-md-6">
						<sf:input id="email" path="email" name="email" type="text"
							placeholder="enter valid email" class="form-control input-md" />

						<sf:errors path="email" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				
								<!-- Password  input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="password">password</label>
					<div class="col-md-6">
						<sf:input id="password" path="email" name="email" type="text"
							 class="form-control input-md" />
					</div>
				</div>
				
									<!--Confirm Password  input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="confirmpassword">confirmpassword</label>
					<div class="col-md-6">
						<input id="confirmpassword"  name="confirmpassword" type="text"
							 class="form-control input-md" />
					</div>
				</div>

				
				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
						<button id="submit" name="submit" class="btn btn-primary">Create
							User</button>
					</div>
				</div>

			</fieldset>
		</sf:form>
	</div>

</body>
</html>