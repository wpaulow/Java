package br.com.etec;

public class Testa {
	public static void main (String args []) {
		Pessoa.alterar();
		Pessoa p = new Pessoa ("Jos�");
		p.incluir();
		p.setNome("Paulo");
		p.incluir();
	}
}
