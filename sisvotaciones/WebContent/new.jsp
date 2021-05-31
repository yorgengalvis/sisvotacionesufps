<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SISUFPS | NEW VOTANTE</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"  style="background-color:tomato">
			<div>
				<a href="#" style="display:flex;" class="navbar-brand">
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Logo_de_UFPS.svg/220px-Logo_de_UFPS.svg.png" width="60px" heigth="60px">
					<h2 style=" font-size:1em;">Votaciones 2021</h2>
				</a>
			</div>
		</nav>
	</header>
	<br>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='messege'>{{messege}}</div> -->
		<div class="container">
			<h3 class="text-center">Nuevo votante</h3>
			<hr>
			<div class="container text-left">
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Agregar Nuevo Votante</a>
			</div>
			<br>
			<div class="table-responsive">
			<table class="table table-bordered">
				<thead >
					<tr>
						<th>ID</th>
						<th>Nombre</th>
						<th>Email</th>
						<th>Documento</th>
						<th>Tipo Documento</th>
						<th>¿Tiene voto?</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							2
						</td>
						<td>
							Yorgen GAlvis
						</td>
						<td>
							yorgeneliecergr@ufps.edu.co	
						</td>
						<td>
							1010149889
						</td>
						<td>
						Cedula Ciudadania
						</td>
						<td>
						No</td>
						<td><a href="edit?id=1' />">Editar</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="delete?id=<c:out value='${usuario.id}'/>">Eliminar</a></td>
						</tr>					
				</tbody> 
			</table></div>
		</div>
	</div>	
</body>
</html>