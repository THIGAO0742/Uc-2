package uc2Final;

public class teste {

	public static void main(String[] args) {

		cargo funci = new cargo("Lixeiro", 1420.71);
		funcionario joao = new funcionario("Jõao", 25, funci);
		
		joao.setMatricula("879/1559.58");
		joao.mostrarDados();
		funci.aumentoSalario(157.8);
		joao.mostrarDados();
	}

}
