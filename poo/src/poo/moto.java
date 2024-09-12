package poo;

import java.util.Scanner;

public class moto {
	private int  velocidade;
	private String  cor;
	private String  marca;
	private static Scanner tec = new Scanner(System.in);
	
	//getset
	public moto() {
		this.marca = "Digite a Marca do veiculo";
		this.cor = "Digite a cor do veiculo";
		this.velocidade = 10;
		
	}
	
	public void setMarca(String Marca) {
		this.marca = Marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setCor(String Cor) {
		this.cor = Cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void setVelocida(int vel) {
		this.velocidade = vel;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	
	//metodo
	public void LerDados() {
		System.out.println("Dados do Veículo");
		System.out.print("Marca: ");
		this.marca =tec.next();
		System.out.print("Cor: ");
		this.cor=tec.next();
		this.velocidade=0;
		System.out.println("Velocidade atual: "+this.velocidade);
		System.out.println(" ");

	}//Ldados
	
	public void MostrarDados() {
		System.out.println("Dados do Veículo (Moto)");
		System.out.println("Marca: "+this.marca);
		System.out.println("Cor: "+this.cor);
		System.out.println("Velocidade atual: "+this.velocidade);
		System.out.println(" ");

	}//Mdados
	
	public void Acelerar() {
		System.out.println("Acelereando...");
		System.out.print("Velocidade atual: ");
		this.velocidade+=tec.nextInt();
		System.out.println(" ");
		
	}//ace
	
	public void Desacelerar() {
		System.out.println("Desacelereando...");
		System.out.print("Velocidade atual: ");
		this.velocidade-=tec.nextInt();
		System.out.println(" ");
	
	}//des
	
	public void Parar() {
		System.out.println("Motos está parando...");
		this.velocidade = 0;
		System.out.println("Moto Parada!!");
		System.out.println(" ");

	}//para
	
	
	
	
	
}//class
