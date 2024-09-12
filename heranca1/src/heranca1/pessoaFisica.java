package heranca1;

public class pessoaFisica extends pessoa {
	private String cpf;
	
	//getset construtuor
	
	pessoaFisica(){}
	
	pessoaFisica(String Cpf){
		super(); //chamada do construtor básico da classe mae
		this.cpf = Cpf;
	}
	
	pessoaFisica(String nomePf, String endPf, String Cpf){
		super(nomePf,endPf); //chamando construtor com paramentro da classe mae
		this.cpf = Cpf;
	}
	
	//metodo
	
	public void mostrarDados() {
		super.mostraDados(); // chamando metedo da classe mae
		System.out.println("CPF: "+cpf);
	}
	
}//class
