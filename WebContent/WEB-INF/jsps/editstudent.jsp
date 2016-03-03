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
<form class="form-horizontal" action="${pageContext.request.contextPath}/doneediting" method='POST'>

<fieldset>

<!-- Form Name -->
<legend></legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="name">name</label>  
  <div class="col-md-4">
  <input id="name" name="name" type="text" placeholder="${student.name}" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="reg_no">reg_no</label>  
  <div class="col-md-4">
  <input id="reg_no" name="reg_no" type="text" placeholder="${student.reg_no}" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="cgpa">cgpa</label>  
  <div class="col-md-4">
  <input id="cgpa" name="cgpa" type="text" placeholder="${student.cgpa}" class="form-control input-md">
    
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Button</button>
    <input type="hidden" name="id" value="${student.id}">
  </div>
</div>

</fieldset>
</form>









</body>
</html>