<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Administradores</title>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
</head>
<body>

	<br>
	<br>
	<center>
		<h3>LISTA DE ADMINISTRADORES</h3>
	</center>
	<br>
	<br> ${mensagem}
	<h1>Filtro</h1>
	<hr>
	<br>
	<br>
	<form action="#" onclick="">
		Nome <input type="text" name="buscaNomeId" id="buscaNomeId" /> <input type="button"
			name="buscarNome" id="buscarNome" value="buscar" />
	</form>
	<br>
	<br>
	<center>
		<table border="1" width="100%" bordercolor="black">
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Email</td>
				<td>GitHub</td>
				<td>Skype</td>
				<td>Trello</td>
				<td>Disponibilidade</td>
				<td>Ações</td>
			</tr>
			<c:forEach items="${listaAdministradores}" var="administradoresList">
				<tr>
					<td>${administradoresList.id}</td>
					<td>${administradoresList.nome}</td>
					<td>${administradoresList.email}</td>
					<td>${administradoresList.github}</td>
					<td>${administradoresList.skype}</td>
					<td>${administradoresList.trello}</td>
					<td>${administradoresList.disponibilidade}</td>
					<td><a
						href="<c:url value='/administrador/editar?id=${administradoresList.id}'/>" />Editar</td>
					<td><a href="<c:url value='/administrador/remove?id=${administradoresList.id}'/>" />Excluir</td>
				</tr>
			</c:forEach>

		</table>
		<br> <br>
		</form>
</body>

<script type="text/javascript">

	function excluir(){
		 if (confirm("Você realmente deseja excluir o usuário" )) {
			 } 
	}

    $('#buscarNome').click(function(){
    	$.post("retornaAdministrador",{id:$("#buscaNomeId").val()},
           function(data) {
	    		alert("NOME:   "+data.nome+"\n"+
	    			  "TRELLO:   "+data.trello+"\n"+
	    			  "GITHUB:   "+data.github+"\n"+
	    			  "OBJETIVO:   "+data.objetivo+"\n"+
	    			  "EMAIL:   "+data.email+"\n"+
	    			  "SKYPE:   "+data.skype+"\n"+
	    			  "DISPONIBILIDADE:   "+data.disponibilidade
	    			  );
           });
    });
	
</script>

</html>