package Comandos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AlunoDAO;
import models.Aluno;

public class ListarAluno implements Logica{

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> alunos = dao.getLista();
		
		request.setAttribute("alunos", alunos);
		
		return "ListarAlunos.jsp";
		
}
}