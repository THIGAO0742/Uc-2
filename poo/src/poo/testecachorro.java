package poo;

import java.util.Scanner;

public class testecachorro {

	public static void main(String[] args) {
		cachorro husk = new cachorro();
		cachorro golden = new cachorro(); 
		double peso;
		Scanner tec = new Scanner(System.in);
		husk.lerDados();
		husk.mostrarDados();
		husk.latir();
		System.out.println("Quanto o cachorro emagreceu? ");
		peso=tec.nextDouble();
		husk.cachorroEmagreceu(peso);
		System.out.println("Quanto o cachorro engordou? ");
		peso=tec.nextDouble();
		husk.cachorroEngordou(peso);
		System.out.println(" ");
		golden.lerDados();
		golden.mostrarDados();
		golden.latir();
		System.out.println("Quanto o cachorro engordou? ");
		peso=tec.nextDouble();
		golden.cachorroEngordou(peso);
		System.out.println("Quanto o cachorro emagreceu? ");
		peso=tec.nextDouble();
		golden.cachorroEmagreceu(peso);
		
	}

}
