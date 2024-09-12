
public class Teste {

	public static void main(String[] args) {
		Livro p1 = new Livro();
		p1.mostrarDados();
		System.out.println("/////////////////////////////");

		Pessoa l1 = new Pessoa();
		l1.mostrarDados();
		System.out.println("/////////////////////////////");

		Emprestimo b1 = new Emprestimo();
		b1.mostrarDados();
		System.out.println("/////////////////////////////");

		Pessoa pp1 = new Pessoa("Joana", 47, "paralela");
		Livro ll1 = new Livro("DIDIN", 10, "jOSE");
		Emprestimo bibli = new Emprestimo(pp1, "07/08/2024", ll1);
	
		bibli.mostrarDados();//erro
		System.out.println("/////////////////////////////");
				
	
	}//MAIN
}
