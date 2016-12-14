package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato contato = new Contato();
		contato.setNome("CaelumAltera");
		contato.setEmail("caelumAltera@caelum.com.br");
		contato.setEndereco("Rua Vergueiro 2, Paulista 26 ,Alteracao");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(1);
		
		
		ContatoDao dao2 = new ContatoDao();
		dao2.altera(contato);
		
		
		System.out.println("Contato Alterado!!!");
		
	}

}
