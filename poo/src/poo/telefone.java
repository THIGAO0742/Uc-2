package poo;

public class telefone {
	private double altura ;
	private double largura;
	private String Cor;
	
	//get set
	public telefone() {
		this.altura = 0.0;
		this.largura = 0.0;
		this.Cor = "Preto";
	}
	
	public void setAltura(double alt) {
		this.altura = alt;
	}
	public double getAltura() {
		return this.altura;
	}
	
	public void setLargura(double lar) {
		this.largura = lar;
	}
	public double getLargura() {
		return this.largura;
	}
	
	public void setCor(String cor) {
		this.Cor = cor;
	}
	public String getCor() {
		return this.Cor;
	}
	//metodo
	public void FzerLig() {
		System.out.println("Ligação Discada");
		System.out.println(" ");

	}
	
	public void AtenLig() {
		System.out.println("Alô, quem fala?");
		System.out.println(" ");

	}
	
}
