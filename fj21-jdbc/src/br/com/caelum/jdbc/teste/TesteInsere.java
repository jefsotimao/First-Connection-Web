package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//chamando um contato e gravando seus dados
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("Rua Vergueiro 3185 , Paraiso");
		contato.setDataNascimento(Calendar.getInstance());
		
		//chamando e gravando na conexao ContatoDao
		ContatoDao dao = new ContatoDao();
		//metodo de adicionar os contatos 
		dao.adiciona(contato);
		
		System.out.println("Contato Gravado!");
		
		
	}

}
