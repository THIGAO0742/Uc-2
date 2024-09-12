package heranca1;

abstract class veiculo {
	private String placa;
	private int ano;
	
	//get|set|construtor
	veiculo(){}
	
	veiculo(String Placa, int Ano){
		this.placa = Placa;
		this.ano = Ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}//class
