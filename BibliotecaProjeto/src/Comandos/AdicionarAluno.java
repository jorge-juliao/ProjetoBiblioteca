package Comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AlunoDAO;
import models.Aluno;

public class AdicionarAluno implements Logica {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String dataEmTexto = request.getParameter("dataEmTexto");
		String endereco = request.getParameter("endereco");

		Calendar dataFinalNascimento = null;
		

		try {
			Date dataProvisoriaPublicacao = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataFinalNascimento = Calendar.getInstance();
			dataFinalNascimento.setTime(dataProvisoriaPublicacao);

			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setCPF(cpf);
		aluno.setDataNascimento(dataFinalNascimento);
		aluno.setEndereco(endereco);
		
		AlunoDAO dao = new AlunoDAO();
		dao.inserirAluno(aluno);
		
		return "AlunoAdicionado.jsp";
	}
}

