package Comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.EmprestimoDAO;
import models.Emprestimo;
import models.Livro;
import models.Aluno;

public class EmprestimoLivro implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws java.text.ParseException{

		 String id_livro = req.getParameter("livro_id");
		 String id_aluno = req.getParameter("aluno_id");
		 Long id_aluno = Long.parseLong(req.getParameter("aluno_id"));
		 String dataEmprestimoEmTexto = req.getParameter("dataEmprestimo");
		 String dataDevolucaoEmTexto = req.getParameter("dataDevolucao");

		 Calendar dataEmprestimo = null;
		 Calendar dataDevolucao = null;

		 try{
		 Date dataTextoEmprestimo = new
		 SimpleDateFormat("dd/mm/yyyy").parse(dataEmprestimoEmTexto);
		 dataEmprestimo = Calendar.getInstance();
		 dataEmprestimo.setTime(dataTextoEmprestimo);

		 Date dataTextoDevolucao = new
		 SimpleDateFormat("dd/mm/yyyy").parse(dataDevolucaoEmTexto);
		 dataDevolucao = Calendar.getInstance();
		 dataDevolucao.setTime(dataTextoDevolucao);
		 }catch(ParseException e){
		 System.out.println("erro na conversão da data");
		 }
		 Emprestimo e = new Emprestimo();

		 e.setId_aluno(id_aluno);
		 e.setId_aluno(id_livro);
		 e.setDataInicio(dataEmprestimo);
		 e.setDataDevolucao(dataDevolucao);
		 EmprestimoDAO emprestimoDao = new EmprestimoDAO();
		 Aluno aluno = null;
		 Livro livro = null;
		 emprestimoDao.emprestar(livro,aluno);
		return "LivroFoiAdicionado.jsp";
	}
}
