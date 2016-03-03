<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<table border="1" cellpadding="6">
			<caption>
				<h2>List of Students</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>RegNo</th>
				<th>CGPA</th>
				<th>Delete</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${students}" var="student">
				<tr>

                    <td><c:out value="${student.id}" /></td>
					<td><c:out value="${student.name}" /></td>
					<td><c:out value="${student.reg_no}" /></td>
					<td><c:out value="${student.cgpa}" /></td>
					<td>
						<form class="form-horizontal"
							action="${pageContext.request.contextPath}/deletestudent"
							method='POST'>
							<fieldset>

								<!-- Form Name -->
								


								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="singlebutton"></label>
									<div class="col-md-4">
										<button id="singlebutton" name="singlebutton"
											class="btn btn-primary">Delete</button>
										<input type="hidden" name="id" value="${student.id}">
									</div>
								</div>

							</fieldset>
						</form>

					</td>
										<td>
						<form class="form-horizontal"
							action="${pageContext.request.contextPath}/editstudent"
							method='POST'>
							<fieldset>

								<!-- Form Name -->
								


								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="singlebutton"></label>
									<div class="col-md-4">
										<button id="singlebutton" name="singlebutton"
											class="btn btn-primary">Edit</button>
										<input type="hidden" name="id" value="${student.id}">
										<input type="hidden" name="name" value="${student.name}">
										<input type="hidden" name="reg_no" value="${student.reg_no}">
										<input type="hidden" name="cgpa" value="${student.cgpa}">
									</div>
								</div>

							</fieldset>
						</form>

					</td>


				</tr>
			</c:forEach>
		</table>
		<p>
		<a href="${pageContext.request.contextPath}/newstudent">Add new student </a>
	<p>
	</div>


</body>
</html>