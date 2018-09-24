package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import models.Aluno;
import models.Emprestimo;
import models.Livro;


public class EmprestimoDAO {
	Emprestimo emprestimo = new Emprestimo();

	private Connection connection;

	public EmprestimoDAO() {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean emprestar(Livro livro, Aluno aluno) {
		try {
			
			String sql = "insert into emprestimo (alunoEmprestimo, livroEmprestimo, dataInicio, dataDevolucao) VALUES (?,?,?,null);";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getCPF());
			stmt.setDate(4, new java.sql.Date(aluno.getDataNascimento().getTimeInMillis()));
			stmt.setString(5, aluno.getEndereco());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	public void excluiEmprestimo(Emprestimo emprestimo) {
		String sql = "DELETE from emprestimo WHERE id=?";
		Livro livro = new Livro();
		try {
			livro.setStatusLivro(false);
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, emprestimo.getId());
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Emprestimo> listaEmprestimo() {
		try {
			List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from Emprestimos");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				Emprestimo emprestimo = new Emprestimo();
				
				emprestimo.setId(rs.getLong("id_emprestimo"));
				
				
				Calendar dataEmprestimo = Calendar.getInstance();
				dataEmprestimo.setTime(rs.getDate("dataEmprestimo"));
				
				
				emprestimos.add(emprestimo);
			}
			rs.close();
			stmt.close();
			
			return emprestimos;
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//public boolean Relatorio(){
	//try {
	//	List<Emprestimo> emprestimosA = this.listaEmprestimo();
	//	PreparedStatement stmt = this.connection.prepareStatement("select * from emprestimo WHERE dataDevolucao== null");
	//	ResultSet rs = stmt.executeQuery();
		//while(rs.next()) {
		//	emprestimosA = rs.next();
		//	return true;
	//}
	
	//}catch(SQLException e) {
	//	System.out.println(e);
	//}
	
//	return false;
	
	
	
	
//	}
		
}