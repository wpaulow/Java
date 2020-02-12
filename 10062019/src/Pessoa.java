
public class Pessoa {
	
	private int id;
	private String nome;
	
	public Pessoa (String nome, int id) {
		this.id = id;
		this.nome = nome;
		System.out.println("Construiu Pessoa!");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public void incluir () {
		String SQL = "insert into pessoa (id, nome, rg) values ('1', 'Paulo', '123')";
		System.out.println(SQL);
	}*/
	
	public void incluir() {
		String SQL = "insert into pessoa (id, nome) values ('"+this.id+"', '"+this.nome+"')";
		System.out.println(SQL);
	}
	
}


