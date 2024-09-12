
abstract class ProdutoEletronico {

	protected String marca;
	protected String modelo;  
	protected double preco;
	
	ProdutoEletronico() {}
	
	ProdutoEletronico(String marca, String modelo, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public abstract void exebirDetalhes();
		
}//class
