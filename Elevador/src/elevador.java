import java.util.Scanner;

public class elevador {
	public static Scanner tec = new Scanner(System.in);
	private int andarTotal;
	private int andarAtual;
	private int capacidadeMax;
	private int quantAtual;
	
	//GET|SET|CONSTRUTOR
	
	elevador(){}
	
	elevador(int andarTotal,int capcidadeMax){
		this.andarTotal = andarTotal;
		this.capacidadeMax = capcidadeMax;
		
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getQuantAtual() {
		return quantAtual;
	}

	public void setQuantAtual(int quantAtual) {
		this.quantAtual = quantAtual;
	}

	public int getAndarTotal() {
		return andarTotal;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	
	// METODO
	
	public void QuantAtual() {
		System.out.println("No elevador há "+this.quantAtual);
	}
	
	
	public void entrar() {
		if(this.quantAtual<=this.capacidadeMax) {
		System.out.print("Quantas pessoas estão entrando? ");
		this.quantAtual+=tec.nextInt();
		}else {
			System.out.println("Capacidade Maxima atiginda!!");
			this.quantAtual= this.capacidadeMax;
		}// if
	}
	
	public void sair() {
		if(this.quantAtual>=0) {
			System.out.print("Quantas pessoas estão Saindo? ");
			this.quantAtual-=tec.nextInt();
		}else {
			System.out.println("elevador vazio!!");
			this.quantAtual = 0;
			System.out.println();
		}//if
	}
	
	public void subir(){
		
		if(this.andarAtual == 0) {
			System.out.println("Terreo");
			System.out.println("Elevador Subindo");
			entrar();	
			System.out.println();
			this.andarAtual++;
			
		}else if(this.andarAtual<this.andarTotal) {
			ConsultaAndar();
			System.out.println("Elevador Subindo");
			sair();
			entrar();
			System.out.println();
			this.andarAtual++;
			System.out.println();
			
		}else if (this.andarAtual==this.andarTotal) {
			ConsultaAndar();
			System.out.println("Ultimo andar...");
			this.quantAtual = 0;
			this.andarAtual++;
		}//if
	}
	
	public void descer(){
		if(this.andarAtual >= this.andarTotal ){
			this.andarAtual--;
			ConsultaAndar();
			System.out.println("Elevador Descendo");
			entrar();
			System.out.println();
			this.andarAtual--;
			
		}else if(this.andarAtual>0 && this.andarAtual < this.andarTotal) {
			ConsultaAndar();
			System.out.println("Elevador Descendo");
			sair();
			entrar();
			this.andarAtual--;
			System.out.println();
		}else if (this.andarAtual==0) {
			System.out.println("Você chegou ao Terreo");
			this.quantAtual = 0;
			this.andarAtual--;
		}//if
	}
	
	public void ConsultaOcupacao() {
		System.out.println("No elevador há "+this.quantAtual + " pessoas");
		System.out.println();
	}
	
	public void ConsultaAndar() {
		System.out.println("O ELEVADOR ESTA NO "+this.andarAtual+ "º ANDAR");
		System.out.println();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class 
