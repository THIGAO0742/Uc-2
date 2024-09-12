package poo;

public class testeTel {

	public static void main(String[] args) {

		telefone telebahia = new telefone();
		celular maxtiel = new celular();
		
		telebahia.AtenLig();
		telebahia.FzerLig();
		//telebahia.Cor = "preto";
		
		
		//maxtiel.Cor ="Azul";
		maxtiel.FzerLig();
		maxtiel.AtenLig();
		maxtiel.EnviarSms("Texto SMS");
		maxtiel.EnviarEmail("thiago@senac.com");
	}

}
