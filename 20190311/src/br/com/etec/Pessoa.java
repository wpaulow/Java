package br.com.etec;

public class Pessoa {
	private String nome;
	
	public Pessoa (String nome) {
		this.nome=nome;
		System.out.println("Construiu");
	}
	public static void alterar() {
		System.out.println("alterou");
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	public void incluir () {
		System.out.println("incluiu "+this.nome);
	}
}
