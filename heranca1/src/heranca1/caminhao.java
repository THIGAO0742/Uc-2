package heranca1;

public class caminhao extends veiculo {

	private int eixos;
	
	//get|set|construtor
	
	public caminhao(String Placa, int Ano, int Eixos) {
		super(Placa, Ano);
		this.eixos = Eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	// metodo
	
	public void mostrarDados() {
		System.out.println(" ");
		System.out.println("Caminhão");
		System.out.println("Placa: "+this.getPlaca());
		System.out.println("Ano de Fabricação: "+this.getAno());
		System.out.println("Eixos: "+this.eixos);

	}

}//class
