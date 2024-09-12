
public class elevator {

		private int andarTotal;
		private int andarAtual;
		private int capacidadeMax;
		private int quantAtual;
		
		//GET|SET|CONSTRUTOR
		
		public elevator() {}
		
		elevator(int andarTotal,int capcidadeMax){
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
		
		
		public void entrar(int pessoas) {
			if(this.quantAtual<this.capacidadeMax) {
			this.quantAtual+=pessoas;
			}else {
				this.quantAtual = this.capacidadeMax;
			}// if
			if(this.quantAtual>=this.capacidadeMax) {
				System.out.println("Capacidade Maxima atiginda!!");
				this.quantAtual = this.capacidadeMax;
				ConsultaOcupacao();
			}else {
				ConsultaOcupacao();				
			}//if
		}
		
		public void sair(int pessoas) {
			if(this.quantAtual>0) {
				this.quantAtual-=pessoas;
			}else {
				this.quantAtual = 0;
			}//if
			if(this.quantAtual<=0 ) {
				System.out.println("elevador vazio!!");
				this.quantAtual = 0;
				ConsultaOcupacao();
			}else {
				ConsultaOcupacao();
			}//if		

		}
		
		public void subir(){
			
			if(this.andarAtual == 0) {
				System.out.println("Terreo");
				System.out.println("Elevador Subindo");
				System.out.println();
				this.andarAtual++;
				
			}else if(this.andarAtual<this.andarTotal) {
				ConsultaAndar();
				System.out.println("Elevador Subindo");
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
				System.out.println();
				this.andarAtual--;
				
			}else if(this.andarAtual>0 && this.andarAtual < this.andarTotal) {
				ConsultaAndar();
				System.out.println("Elevador Descendo");
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


