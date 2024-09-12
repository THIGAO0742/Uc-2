package heranca1;

public class pessoa {

	private String nome;
	private String endereco;

	//get|set|construt
	public pessoa(){}
	
	public pessoa(String nomeP, String end) {
		this.nome = nomeP;
		this.endereco = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String end) {
		endereco = end;
	}
	
	//metodo
	
	public void mostraDados() {
		System.out.println("");
		System.out.println("Nome: "+this.nome);
		System.out.println("Endereço: "+this.endereco);
		
	}
	
	
	
	
	
	
	
	
	
}
