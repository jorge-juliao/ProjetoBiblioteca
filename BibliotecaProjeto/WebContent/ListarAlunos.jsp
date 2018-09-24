<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<th>matricula</th>
				<th>aluno</th>
				<th>CPF</th>
				<th>data de publicação</th>
				<th>Data de edição</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${aluno.Matricula}</td>
					<td>${aluno.nome}</td>
					<td>${aluno.cpf}</td>
					<td>${aluno.dataDeNascimento.time}</td>
					<td>${aluno.endereco}</td>
				</tr>
			

		</tbody>

	</table>

</body>
</html>