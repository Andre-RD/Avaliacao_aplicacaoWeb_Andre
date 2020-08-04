<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="com.treinamento.moduloweb.Modulo"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Lista de Modulos</title>
</head>
<body>
	<br>

	<h2 style="text-align:center">Lista de Modulos</h2>
	
	<br>
	<table class="table table-striped" width="50%">
	<thead class="thead-dark">
		<tr>
			<th>
				NOME
			</th>
			<th>
				INSTRUTOR TITULAR
			</th>
			<th>
				INSTRUTOR AUXILIAR
			</th>
			<th>
				DATA INICIO
			</th>
		</tr>
	</thead>
		<c:forEach var="modulo1" items="${modulos}">
				<tr>
					<td><c:out value="${modulo1.nome}"></c:out>  </td>
					<td><c:out value="${modulo1.instrutorTitular}"></c:out>  </td>
					<td><c:out value="${modulo1.instrutorAuxiliar}"></c:out>  </td>
					<td><fmt:formatDate value="${modulo1.dataInicio}" pattern="dd/MM/yyyy"/> </td>
				</tr>
		</c:forEach>
	</table>
	
</body>
</html>