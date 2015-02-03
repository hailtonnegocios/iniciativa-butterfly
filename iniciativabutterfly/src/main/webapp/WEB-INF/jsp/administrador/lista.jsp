<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Administradores</title>
</head>
<body>

<br><br>
	<center><h3>LISTA DE ADMINISTRADORES</h3></center>
	<br>
	<hr>
	<br>
	<center>
		<table border="0">
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Email</td>
				<td>GitHub</td>
				<td>Skype</td>
				<td>Trello</td>
				<td>Disponibilidade</td>
			</tr>
			<c:forEach items="${listaAdministradores}" var="administradoresList">
			<tr>
				<td>${administradiresList.id}</td>
				<td>${administradoresList.nome}</td>
				<td>${administradoresList.email}</td>
				<td>${administradoresList.github}</td>
				<td>${administradoresList.skype}</td>
				<td>${administradoresList.trello}</td>
				<td>${administradoresList.disponibilidade}</td>
			</tr>
			</c:forEach>
		
		</table>
		<br>
		<br>
<form action="<c:url value='/administrador/buscaPorID'/>" method="post">
	Busca por ID<input type="text" id="buscaPorId"/>
				<input type="submit" value="buscar">
</form>
</body>
</html>