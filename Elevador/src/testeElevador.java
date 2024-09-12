import java.util.Scanner;

public class testeElevador {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int pEntra=0, pSai=0;
		elevator senac = new elevator(5,10);
		
		while (senac.getAndarAtual()<=senac.getAndarTotal() ) {
			if(senac.getAndarAtual() == 0) {
				System.out.print("Quantas pessoas estão entrando no elevador? ");
				pEntra=tec.nextInt();
				senac.entrar(pEntra);
				System.out.println();
				
			}else if(senac.getAndarAtual()<senac.getAndarTotal() ){
				System.out.print("Quantas pessoas estão saindo do elevador? ");
				pSai=tec.nextInt();
				senac.sair(pSai);
				System.out.print("Quantas pessoas estão entrando no elevador? ");
				pEntra=tec.nextInt();
				senac.entrar(pEntra);
				System.out.println();
			}//if
			senac.subir();
		}//while
		
		while (senac.getAndarAtual()>=0 ) {
			
			if(senac.getAndarAtual()>=senac.getAndarTotal() ) {
				System.out.print("Quantas pessoas estão entrando no elevador? ");
				pEntra=tec.nextInt();
				senac.entrar(pEntra);
				System.out.println();				
			}else if(senac.getAndarAtual()>0 && senac.getAndarAtual()<senac.getAndarTotal()){
				System.out.print("Quantas pessoas estão saindo do elevador? ");
				pSai=tec.nextInt();
				senac.sair(pSai);
				System.out.print("Quantas pessoas estão entrando no elevador? ");
				pEntra=tec.nextInt();
				senac.entrar(pEntra);
				System.out.println();
			}//if
			senac.descer();
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*elevador senac = new elevador(5, 10);
		
		while (senac.getAndarAtual()<=senac.getAndarTotal() ) {
			senac.subir();
			
		}
		
		while (senac.getAndarAtual()>=0 ) {
			senac.descer();
		}*/
		
	}//main
}

