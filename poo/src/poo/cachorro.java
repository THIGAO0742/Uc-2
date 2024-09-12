package poo;

import java.util.Scanner;

public class cachorro{
	private static Scanner tec = new Scanner(System.in);
	private String nome;
	private String cor;
	private Double peso;
	private Double altura;
	
	public cachorro() {
		this.nome = "Digite o nome";
		this.cor = "Digite a cor";
		this.peso = 0.0;
		this.altura = 0.0;

	}

	
	public void setnome(String Nome) {
		this.nome = nome;	
	}
	
	public String getnome() {
		return this.nome;
	}
	
	public void setcor(String Cor) {
		this.cor = Cor;	
	}
	
	public String getcor() {
		return this.cor;
	}
	
	public void setpeso(double Peso) {
		this.peso = Peso;	
	}
	
	public double getpeso() {
		return this.peso;
	}
	
	public void setaltura(double Alt) {
		this.altura = Alt;	
	}
	
	public double getaltura() {
		return this.altura;
	}
	
	
	public void latir() {
		System.out.println(this.nome+": Au Au!!");
		System.out.println(" ");
	}
	
	public void lerDados() {
		System.out.print("Nome do cachorro:");
		this.nome=tec.next();
		System.out.print("Cor do cachorro:");
		this.cor=tec.next();
		System.out.print("Peso do cachorro:");
		this.peso=tec.nextDouble();
		System.out.print("Altura do cachorro:");
		this.altura=tec.nextDouble();
		System.out.println(" ");
	}
	
	public void mostrarDados() {
		System.out.println("Nome: "+this.nome);	
		System.out.println("Cor: "+this.cor);	
		System.out.println("Peso: "+this.peso+"Kg");	
		System.out.println("Altura: "+this.altura+"Cm");
		System.out.println(" ");
	}
	
	/*public void cachorroEmagreceu() {
		System.out.println("Nome do cachorro: "+this.nome);
		System.out.println("Peso do cachorro: "+this.peso+"Kg");
		System.out.print("Quantos quilos o cachorro perdeu:");
		this.peso-=tec.nextDouble();
		System.out.println("Peso do cachorro atual : "+this.peso+"Kg");
		System.out.println(" ");

	}*/
	
	public void cachorroEmagreceu(double kg) {
	   this.peso-=kg;
	   System.out.println("Peso do cachorro atual : "+peso+"Kg");

	  }
	  
	 
	
	/*public void cachorroEngordou() {
		System.out.println("Nome do cachorro: "+this.nome);
		System.out.println("Peso do cachorro: "+this.peso+"Kg");
		System.out.print("Quantos quilos o cachorro ganhou:");
		this.peso+=tec.nextDouble();
		System.out.println("Peso do cachorro atual : "+peso+"Kg");
		System.out.println(" ");
		
	}*/
	
	public void cachorroEngordou(double kg) {
	   this.peso+=kg;
	  System.out.println("Peso do cachorro atual : "+peso+"Kg");

	  }
	 
	
	
	
	
	
	
	
}
