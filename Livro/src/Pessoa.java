
public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	
	public Pessoa(){}
	
	/*public Pessoa(String nome,int idade, String endereco){
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		
	}*/
	public Pessoa(String nome,int idade, String endereco){
		setNome(nome);
		setIdade(idade);
		setEndereco(endereco);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//metodo
/*	public void mostrarDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.endereco);
	}*/
	public void mostrarDados() {
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.getEndereco());
	}
	
}
