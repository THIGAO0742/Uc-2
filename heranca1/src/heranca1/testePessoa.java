package heranca1;

public class testePessoa {

	public static void main(String[] args) {

		pessoaFisica p1 = new pessoaFisica("Zé", "Travessa num sei nº 85", "88.789.458-89");
		p1.mostrarDados();
		
		pessoaFisica p2 = new pessoaFisica("855.789.415-85");
		p2.mostrarDados();
		
		pessoaFisica p3 = new pessoaFisica();
		p3.mostrarDados();
		
	}//main
}
