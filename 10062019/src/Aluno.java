
public class Aluno extends Pessoa {
	private String rm;
	
	public Aluno (String nome, int id, String rm) {
		super(nome, id);
		this.rm = rm;
		System.out.println("Construiu Aluno!");
	}
	
	
	public String getRm() {
		return rm;
	}


	public void setRm(String rm) {
		this.rm = rm;
	}
	
	@Override //sobreescrever
	public void incluir() {
		String SQL = "insert into aluno (id_aluno, rm) values ('"+super.getId()+"','"+this.getRm()+"')";
		super.incluir();
		System.out.println(SQL);
	}
	
	public Aluno getAluno() {
		return this;
				
	}

	/*@Override
	public void incluir() {
		String SQL = "insert into aluno (id_aluno, rm) values ('1', '456')";
		super.incluir();
		System.out.println(SQL);
	}*/
}
