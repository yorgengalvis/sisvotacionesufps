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
				<a href="<%=request.getContextPath()%>/" style="display:flex;" class="navbar-brand">
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Logo_de_UFPS.svg/220px-Logo_de_UFPS.svg.png" width="60px" heigth="60px">
					<h2 style=" font-size:1em;">Votaciones 2021</h2>
				</a>
			</div>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
                <div class="card">
                    <div class="card-body">

                        <c:if test="${user != null}">
                            <form action="editar" method="post">
                        </c:if>
                        <c:if test="${user == null}">
                            <form action="insertar" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${user != null}">
                                    Edit User
                                </c:if>
                                <c:if test="${user == null}">
                                   Añadir nuevo votante
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${user != null}">
                            <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Seleccione el estamento:</label>
                            <select class="form-control" aria-label="Default select example">
							  <option selected>Seleccione el estamento</option>
							  <option value="1">One</option>
							  <option value="2">Two</option>
							  <option value="3">Three</option>
							</select>
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Tipo de documento:</label>
                            <select class="form-control" aria-label="Default select example">
								  <option selected>Seleccione el tipo de documento</option>
								  <option value="1">Cedula Ciudadania</option>
								  <option value="2">Two</option>
								  <option value="3">Three</option>
								</select>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Documento</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Nombre</label> <input type="text" value="<c:out value='${user.pais}' />" class="form-control" name="pais">
                        </fieldset>
                         <fieldset class="form-group">
                            <label>Email</label> <input type="text" value="<c:out value='${user.pais}' />" class="form-control" name="pais">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Proceso electoral</label>
                            <select class="form-control" aria-label="Default select example">
								  <option selected>Seleccione el tipo de documento</option>
								  <option value="1">Cedula Ciudadania</option>
								  <option value="2">Two</option>
								  <option value="3">Three</option>
								</select>
                        </fieldset>
	
						<c:if test="${user != null}">
                                   <button type="submit" class="w-100 btn btn-warning">Actualizar votante</button>
                                </c:if>
                                <c:if test="${user == null}">
                                  <button type="submit" class="w-100 btn btn-success">Añadir nuevo votante</button>
                        </c:if>
                        
                        </form>
                    </div>
                </div>
            </div>
</body>
</html>