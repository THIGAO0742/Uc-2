
public class testeAtleta {

	public static void main(String[] args) {
		natacao olim = new natacao("João", "Masculino", 18, "Borboleta", 500);
		olim.ExebirDetalhes();
		olim.reajuste();
		System.out.println();
		olim.ExebirDetalhes();		
		System.out.println();
		jogador champeons = new jogador("Ney", "Masculino", 32, "Bayer", "Meio campista", 5000.89);
		champeons.ExebirDetalhes();
		champeons.reajuste();
		System.out.println();
		champeons.ExebirDetalhes();
		System.out.println();
		atletismo corrida = new atletismo("Thiago", "Masculino", 10, "400M", 5000);
		corrida.ExebirDetalhes();
		corrida.reajuste();
		System.out.println();
		corrida.ExebirDetalhes();

	}

}
