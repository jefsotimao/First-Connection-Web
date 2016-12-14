package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteDeleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato contato = new Contato();
		contato.setId(1);
		
		
		ContatoDao dao3 = new ContatoDao();
		dao3.remove(contato);
		
		System.out.println("Contato removido");
		
		
		
	}

}
