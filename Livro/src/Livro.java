
public class Livro {
	private String nomeLivro;
	private int nPag;
	private String autor;
	
	public Livro(){}
	
	/*public Livro(String nmlivro, int pag, String autor){
		this.nomeLivro =nmlivro;
		this.nPag = pag;
		this.autor= autor;
	}*/
	public Livro(String nmlivro, int pag, String autor){
		setNomeLivro(nmlivro);
		setnPag(pag);
		setAutor(autor);	
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public int getnPag() {
		return nPag;
	}

	public void setnPag(int nPag) {
		this.nPag = nPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	//metodo
	
	/*public void mostrarDados() {
		System.out.println(this.autor);
		System.out.println(this.nomeLivro);
		System.out.println(this.nPag);
	}*/
	public void mostrarDados() {
		System.out.println(this.getAutor());
		System.out.println(this.getNomeLivro());
		System.out.println(this.getnPag());
	}
	
	
}
