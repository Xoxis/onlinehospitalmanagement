<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<script type="text/javascript">
      $(document).ready(function() {
    	  document.f.j_username.focus();
      });
</script>
	<div class="col-md-6 col-md-offset-3">


		<form class="form-horizontal" action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>
			<fieldset>

				<!-- Form Name -->
				<legend>'f'</legend>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="j_username">username</label>
					<div class="col-md-4">
						<input id="j_username" name="j_username" type="text" placeholder=""
							class="form-control input-md">

					</div>
				</div>

				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="j_password">password</label>
					<div class="col-md-4">
						<input id="j_password" name="j_password" type="password"
							placeholder="" class="form-control input-md">

					</div>
					<div class ="alert-danger">
					<c:if test="${param.error !=null}">
					         Incorrect Username or Password
					         </c:if>
					
					
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
						<button id="submit" name="submit" class="btn btn-primary" value="login">login</button>
					</div>
				</div>

			</fieldset>
		</form>
		
		<p> <a href="${pageContext.request.contextPath}/newaccount">Create New Account</a></p>

	</div>



