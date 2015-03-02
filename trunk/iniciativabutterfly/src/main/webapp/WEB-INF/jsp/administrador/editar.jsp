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
<title>Editar usuario</title>
</head>
<body>
	<center>
		<h3>Editar administrador cadastrado</h3>
	</center>
	</p>
	<hr>
	<br>

	<center>Todos os campos são obrigatórios</center>

	<br>
	<table width="1040" height="247" border="0">
		<form action="<c:url value='/administrador/atualiza'/>" method="POST">
			<tr>
				<td width="165"><label for="nome">Código do Administrador</label></td>
				<td width="355"><input type="text" readonly="readonly"
					name="administradorModel.id" id="administradorModel.id" value="${administradorAlteracao.id}" />
					</td>
			</tr>
			<tr>
				<td width="165"><label for="nome">Nome Completo</label></td>
				<td width="355"><input type="text"
					name="administradorModel.nome" id="administradorModel.nome" value="${administradorAlteracao.nome}" />
					</td>
			</tr>
			<tr>
				<td><label for="email">Email </label></td>
				<td width="257"><input type="text"
					name="administradorModel.email" value="${administradorAlteracao.email}"/></td>
			</tr>
			<tr>
				<td><label for="trello">Trello </label></td>
				<td><input type="text" name="administradorModel.trello"
					id="administradorModel.trello" value="${administradorAlteracao.trello}"/></td>

				<td><label for="skype">Skype </label></td>
				<td><input type="text" name="administradorModel.skype"
					id="administradorModel.skype" value="${administradorAlteracao.skype}"/></td>
			</tr>
			<tr>
				<td><label for="github">GitHub </label></td>
				<td><input type="text" name="administradorModel.github"
					id="administradorModel.github" value="${administradorAlteracao.github}" /></td>

				<td><label for="disponibilidade">Disponibilidade </label></td>
				<td><input type="text"
					name="administradorModel.disponibilidade"
					id="administradorModel.disponibilidade"  value="${administradorAlteracao.disponibilidade}"/></td>
			</tr>
			<tr>
				<td><label for="objetivo">Objetivo </label></td>
				<td><textarea name="administradorModel.objetivo" cols="50"
						rows="5" id="administradorModel.objetivo" >${administradorAlteracao.objetivo}</textarea>
						</td>
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
				<td><input type="submit" name="submit" value="Atualizar"></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>

			</tr>
	</table>
	</form>
</body>
</html>