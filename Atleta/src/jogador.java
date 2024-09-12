import java.util.Scanner;

public class jogador extends atleta {

	private String time;
	private String posicaoTime;
	private Double salario;
	
	jogador(){}
	
	jogador(String nome,String sexo,int idade,String time, String posicao,double sal){
		super(nome, sexo, idade);
		this.time = time;
		this.posicaoTime =posicao;
		this.salario = sal;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPosicaoTime() {
		return posicaoTime;
	}

	public void setPosicaoTime(String posicaoTime) {
		this.posicaoTime = posicaoTime;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	//metodo
	

	@Override
	public void reajuste() {
	Scanner tec = new Scanner(System.in);
		
		System.out.println("Patrocinio R$"+this.salario);
		System.out.print("Aumento do valor:");
		this.salario+=tec.nextDouble();
		System.out.println("Patrocinio atual R$"+this.salario);		
	}
	
	public void ExebirDetalhes() {
		System.out.println("Jogador");
		exebirAlteta();
		System.out.println("Time: "+this.time);
		System.out.println("Posição do jogador: "+this.posicaoTime);
		System.out.println("Salario: "+this.salario);
	}

}//class
