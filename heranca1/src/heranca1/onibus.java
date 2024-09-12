package heranca1;

public class onibus extends veiculo{

	private int assentos;
	
	//get|set|construtor 
	
	onibus(String Placa, int Ano, int Assentos ) {
		super(Placa, Ano);
		this.assentos = Assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	//metodo 
	
	public void mostrarDados() {
		System.out.println(" ");
		System.out.println("Ônibus");
		System.out.println("Placa: "+this.getPlaca());
		System.out.println("Ano de Fabricação: "+this.getAno());
		System.out.println("Assentos: "+this.assentos);
	}
	
}// class
