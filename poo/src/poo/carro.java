package poo;

public class carro {
		
	private double altura;
	private double largura;
	private double velMax;
	private String cor;
	
	//construtor get set
	public carro() {
		this.altura = 0.0;
		this.largura =0.0;
		this.velMax = 0.0;
		this.cor = "Digite a cor";
	}
	
	public void setAltura(double alt) {
		this.altura = alt;
	}
	public double getAltura() {
		return this.altura;
	}
	
	public void setLargura(double larg) {
		this.largura = larg;
	}
	public double getLargura() {
		return this.largura;
	}
	
	public void setVelMax(double vel) {
		this.velMax = vel;
	}
	public double getVelMax() {
		return this.velMax;
	}
	
	public void setCor(String pint) {
		this.cor = pint;
	}
	public String getCor() {
		return this.cor;
	}
	
	
	//metodo
		public void AndarFrente() {
			System.out.println("Andar para Frente");
		}
		public void AndarTras() {
			System.out.println("Andar para Trás");
		}
		public void Parar() {
			System.out.println("Parar");
		}
		public void Buzina() {
			System.out.println("Buzinar");
		}


}//class
