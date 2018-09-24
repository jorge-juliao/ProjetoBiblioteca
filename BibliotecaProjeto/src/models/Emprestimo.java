package models;

import java.util.Calendar;

public class Emprestimo {

	private long id;
	private long id_aluno;
	private long id_livro;
	private Calendar dataInicio;
	private Calendar dataDevolucao;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(long id_aluno) {
		this.id_aluno = id_aluno;
	}
	public long getId_livro() {
		return id_livro;
	}
	public void setId_livro(long id_livro) {
		this.id_livro = id_livro;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
}
