<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
/* Estilo de erro dos campos */
.error {
	color: #ff0000;
	font-style: italic;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de novo Administrador</title>
</head>
<body>
	<center>
		<h3>Cadastro de novo Administrador</h3>
	</center>
	</p>
	<hr>
	<br>

	<center>Todos os campos são obrigatórios</center>	

		<br>
	<table width="1040" height="247" border="0">
		<form action="<c:url value='/administrador/adiciona'/>" method="POST" >
		<tr>
			<td width="165"><label for="nome">Nome Completo</label></td>
			<td width="355"><input type="text" name="administradorModel.nome" id="administradorModel.nome" /></td>
		</tr>
		<tr>
			<td><label for="email">Email </label></td>
			<td width="257"><input type="text" name="administradorModel.email" /></td>
		</tr>
		<tr>
			<td><label for="trello">Trello </label></td>
			<td><input type="text" name="administradorModel.trello" id="administradorModel.trello" /></td>

			<td><label for="skype">Skype </label></td>
			<td><input type="text" name="administradorModel.skype" id="administradorModel.skype"/></td>
		</tr>
		<tr>
			<td><label for="github">GitHub </label></td>
			<td><input type="text" name="administradorModel.github" id="administradorModel.github" /></td>

			<td><label for="disponibilidade">Disponibilidade </label></td>
			<td><input type="text" name="administradorModel.disponibilidade" id="administradorModel.disponibilidade" /></td>
		</tr>
		<tr>
			<td><label for="objetivo">Objetivo </label></td>
			<td><textarea name="administradorModel.objetivo" cols="50" rows="5" id="administradorModel.objetivo"></textarea></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="Adicionar"></td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>

		</tr>

	</table>
	</form>
</body>
</html>