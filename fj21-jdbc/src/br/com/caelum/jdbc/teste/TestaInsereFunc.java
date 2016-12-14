package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jeferson");
		funcionario.setUsuario("jeff");
		funcionario.setSenha("123456");
		
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);
		dao.getLista();
		
		System.out.println("Funcionario Gravado");
		
		
		
	}

}
