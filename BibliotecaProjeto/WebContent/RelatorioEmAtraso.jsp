<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label>Alunos com empr�stimo em atraso </label>
	<table border="2">
		<thead>
			<tr>
				<th>matricula</th>
				<th>aluno</th>
				<th>CPF</th>
				<th>data de publica��o</th>
				<th>Data de edi��o</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${emprestimo.id}</td>
					<td>${emprestimo.id_aluno}</td>
					<td>${emprestimo.id_livro}</td>
					<td>${aluno.data.time}</td>
					<td>${aluno.endereco}</td>
				</tr>
			

		</tbody>
	</table>
</body>
</html>