package heranca1;

public class micronibus extends onibus{
	private int nPortas;
	
//get|set|construtor
	
	public micronibus(String Placa,int anos,int assentos, int NPortas) {
		super(Placa, anos, assentos);
		this.nPortas = NPortas;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}
	
	//metodos
	
	public void mostrarDados() {
		System.out.println(" ");
		System.out.println("MicroOnibus");
		System.out.println("Placa: "+this.getPlaca());
		System.out.println("Ano de Fabricação: "+this.getAno());
		System.out.println("Assentos: "+this.getAssentos());
		System.out.println("Num. de Portas: "+this.nPortas);
	}
		
}//class
