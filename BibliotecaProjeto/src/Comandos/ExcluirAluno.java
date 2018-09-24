package Comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AlunoDAO;
import models.Aluno;

public class ExcluirAluno {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
			long id = Long.parseLong(req.getParameter("id"));
			Aluno aluno = new Aluno();
			aluno.setId(id);
			AlunoDAO dao = new AlunoDAO();
			dao.remover(aluno);
			System.out.println("Excluindo contato... ");
			return "lista-contatos.jsp";
			}
}
