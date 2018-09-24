<%@page import="java.text.SimpleDateFormat"%>
<%@page import="models.Livro"%>
<%@page import="java.util.List"%>
<%@page import="daos.LivroDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de alunos:</h1>

	<table border="2">
		<thead>
			<tr>
				<th>titulo</th>
				<th>autor</th>
				<th>editora</th>
				<th>data de publica��o</th>
				<th>Data de edi��o</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="livro" items="${livros}">
				<tr>
					<td>${livro.titulo}</td>
					<td>${livro.autor}</td>
					<td>${livro.editora}</td>
					<td>${livro.dataDePublicao.time}</td>
					<td>${livro.dataDeEdicao.time}</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>



</body>
</html>