
public class Emprestimo {

	private String data;
	private Livro livro;
	private Pessoa pessoa;

	Emprestimo (){
		this.livro = new Livro();
		this.pessoa = new Pessoa();
	}
	
	Emprestimo(Pessoa pessoa, String data, Livro livro) {
        this.pessoa = pessoa;
        this.data = data;
        this.livro = livro;
    }
	
	
	/*erro abaixo na versao 
	
	Emprestimo (Pessoa pessoa, String data, Livro livro){
		 pessoa = new Pessoa(pessoa.getNome(), pessoa.getIdade(), pessoa.getEndereco());
		 livro  = new Livro(livro.getNomeLivro(), livro.getnPag(), livro.getAutor());
		this.data =data;
	
	}
	*/

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Livro getLivro() {
		return livro;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	
	// metodo
	
	 public void mostrarDados() {
		System.out.println("Data de emprestimo: "+getData());
		System.out.println("Livro: "+getLivro().getNomeLivro());
		System.out.println("N° de Pag: "+getLivro().getnPag());
		System.out.println("Autor: "+getLivro().getAutor());
		System.out.println("Pessoa: "+getPessoa().getNome());
		System.out.println("Idade: "+getPessoa().getIdade());
		System.out.println("Endereço: "+getPessoa().getEndereco());
	}

	// ou

	/*public void mostrarDados() {
		this.livro.mostrarDados();
		System.out.println("Emprestado á...");
		this.pessoa.mostrarDados();
		System.out.println("Data de emprestimo: "+getData());
	}*/
	 
	
	
}
