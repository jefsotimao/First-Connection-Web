package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {

	private Connection connection;
	
	
	public FuncionarioDao(){
		this.connection = new ConnectionFactory().getConnection();
	}

	
	//fazendo um insert
	public void adiciona (Funcionario funcionario){
		String sql = "insert into funcionario (nome, usuario, senha) values (?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,funcionario.getNome());
			stmt.setString(2,funcionario.getUsuario());
			stmt.setString(3,funcionario.getSenha());
			
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
				
	}
	
	
	// fazendo um select 
	public  List<Funcionario> getLista(){
		
		try{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		PreparedStatement stmt = connection.prepareStatement("select * from funcionario");
		ResultSet rs = stmt.executeQuery();
		
		
		while(rs.next()){
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(rs.getString("nome"));
			funcionario.setUsuario(rs.getString("usuario"));
			funcionario.setSenha(rs.getString("senha"));
			
			funcionarios.add(funcionario);
		}
		rs.close();
		stmt.close();
		return funcionarios;
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
				
	}
	
	//fazendo alteracao
	public void altera(Funcionario funcionario){
		String sql = "update funcionario set nome?, usuario=?, senha=? where id=?";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			stmt.setLong(4,funcionario.getId());
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
	//fazendo remocao
	public void remover(Funcionario funcionario){
		try{
			PreparedStatement stmt = connection.prepareStatement("delete from funcionario where id=?");
			stmt.setLong(1, funcionario.getId());
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
		
	}
}
