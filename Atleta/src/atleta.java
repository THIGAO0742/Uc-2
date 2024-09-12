
abstract class atleta {

	protected String name;
	protected String sexo;
	protected  int idade;
	
	atleta(){}
	
	atleta(String name,String sex,int ida ){
		this.name = name;
		this.idade = ida;
		this.sexo = sex;
	}
	
	
	public void exebirAlteta() {
		System.out.println("Nome: "+this.name);
		System.out.println("Idade: "+this.idade);
		System.out.println("Sexo: "+this.sexo);
		
	}
	
	abstract void reajuste();
	
	
}
