
public class Smartphone extends ProdutoEletronico {

	private String SistemaOperacional;
	private double Memoriainterna;
	
	
	
	Smartphone(){}
	
	
	Smartphone(String Sistema, double Memoria, String marca,String modelo , double valor){
		this.SistemaOperacional = Sistema;
		this.Memoriainterna = Memoria;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = valor;
	}
	
	
	public String getSistemaOperacional() {
		return SistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		SistemaOperacional = sistemaOperacional;
	}
	public double getMemoriainterna() {
		return Memoriainterna;
	}
	public void setMemoriainterna(double memoriainterna) {
		Memoriainterna = memoriainterna;
	}

	//metodo

	@Override
	public void exebirDetalhes() {
		System.out.println("Smartphone");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Sistema Operacional: "+ this.SistemaOperacional);
		System.out.println("Memoria Interna: "+ this.Memoriainterna+" Gb");
		System.out.println("Preço R$"+this.preco);
	}
}
