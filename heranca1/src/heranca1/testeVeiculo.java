package heranca1;

public class testeVeiculo {

	public static void main(String[] args) {
		
	caminhao scania = new caminhao("OTR 7458", 2015, 6);
	scania.mostrarDados();
	
	onibus mercedes = new onibus("TEL 8725", 2021, 47);
	mercedes.mostrarDados();
	
	micronibus vrtur = new micronibus("YQD 8931", 2021, 23, 2);
	vrtur.mostrarDados();

	}//main
}
