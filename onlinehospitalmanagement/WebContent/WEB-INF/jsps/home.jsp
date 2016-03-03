<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Database Assignment</title>
</head>
<body>


	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of users</h2>
			</caption>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Contact</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${patient}" var="patient">
				<tr>

					<td><c:out value="${patient.first_name}" /></td>
					<td><c:out value="${patient.last_name}" /></td>
					<td><c:out value="${patient.contact_no}" /></td>
					<td><c:out value="${patient.address}" /></td>
										<td>
						<form class="form-horizontal" action="${pageContext.request.contextPath}/deletestudent" method='POST' >
							<fieldset>

								<!-- Form Name -->
								<legend>deletestudent</legend>
								

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="singlebutton"></label>
									<div class="col-md-4">
										<button id="singlebutton" name="singlebutton"
											class="btn btn-primary">Delete</button>
											<input type="hidden" name="name" value="${student.name}">
									</div>
								</div>

							</fieldset>
						</form>

					</td>
				</tr>
			</c:forEach>
		</table>
	</div>



</body>
</html>