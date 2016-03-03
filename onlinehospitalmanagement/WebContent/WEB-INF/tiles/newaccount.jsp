<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
	var password1 = document.getElementById('password');
	var password2 = document.getElementById('confirmPassword');

	var checkPasswordValidity = function() {
		if (password1.value != password2.value) {
			password1.setCustomValidity('Passwords must match.');
		} else {
			password1.setCustomValidity('');
		}
	};

	password1.addEventListener('change', checkPasswordValidity, false);
	password2.addEventListener('change', checkPasswordValidity, false);

	var form = document.getElementById('hospital');
	form.addEventListener('submit', function() {
		checkPasswordValidity();
		if (!this.checkValidity()) {
			event.preventDefault();
			//Implement you own means of displaying error messages to the user here.
			password1.focus();
		}
	}, false);
</script>



<div class="col-md-6 col-md-offset-3">
	<sf:form method="post" class="form-horizontal"
		action="${pageContext.request.contextPath}/createaccount"
		commandName="hospital">
		<fieldset>

			<!-- Form Name -->
			<legend>Create account</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">username</label>
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
			<!-- Password input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="password">password</label>
				<div class="col-md-6">
					<sf:input id="password" path="password" name="password" type="text"
						class="form-control input-md" />
					<sf:errors path="password" cssClass="alert-danger"></sf:errors>


				</div>
			</div>

			<!--Confirm Password input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="confirmpassword">Confirm
					Password</label>
				<div class="col-md-6">
					<input id="confirmPassword" name="confirmPassword" type="text"
						class="form-control input-md" />


				</div>
			</div>




			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="submit"></label>
				<div class="col-md-4">
					<button id="submit" name="submit" class="btn btn-primary">Create
					</button>
				</div>
			</div>

		</fieldset>
	</sf:form>
</div>
