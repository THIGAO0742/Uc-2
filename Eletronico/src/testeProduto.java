import java.util.Scanner;

public class testeProduto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String tecla;
		double val;
		
		Smartphone celular = new Smartphone("Android", 120, "Xiomi", "Poco f5", 2000.99);
		Televisor Tv = new Televisor("DCI", 55, "LG", "Smart", 20000);
		
		Tv.exebirDetalhes();
		System.out.println();
		celular.exebirDetalhes();
		System.out.println();
		
		Smartphone cel = new Smartphone();
		System.out.print("Qual o Sistema Operacional do celular ?");
		tecla=tec.next();
		cel.setSistemaOperacional(tecla);
		System.out.println();
		
		System.out.print("Tamanho da memoria interna:");
		val=tec.nextDouble();
		cel.setMemoriainterna(val);
		System.out.println();
		
		System.out.print("Marca do celular:");
		tecla=tec.next();
		cel.marca = tecla;
		System.out.println();

		System.out.print("Modelo do celular: ");
		tecla=tec.next();
		cel.modelo=tecla;
		System.out.println();
		
		System.out.print("Preço R$");
		val=tec.nextDouble();
		cel.preco = val;
		System.out.println();

		cel.exebirDetalhes();
	
	}//main
}
