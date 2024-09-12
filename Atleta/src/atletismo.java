import java.util.Scanner;

public class atletismo  extends atleta{
	
	private String categoria;
	private String modalidade;
	private double patrocinio;
	
	atletismo(){}
	
	atletismo(String nome, String sexo,int idade,String modalidade, double patrocin){
		super(nome, sexo, idade);
		this.patrocinio = patrocin;
		this.modalidade = modalidade;
		if(this.idade>=18) {
			this.categoria = "Profissional";
		} else {
			this.categoria = "Amador";
			this.patrocinio = 0;
		}
	}
	
	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public double getPatrocinio() {
		return patrocinio;
	}

	public void setPatrocinio(double patrocinio) {
		this.patrocinio = patrocinio;
	}

	
	public void ExebirDetalhes() {
		System.out.println("Atletismo");
		exebirAlteta();
		System.out.println("Modalidade: "+this.modalidade);
		System.out.println("Categoria: "+this.categoria);
		System.out.println("Salario: "+this.patrocinio);
	}

	@Override
	public void reajuste() {
		Scanner tec = new Scanner(System.in);
		if(this.idade>=18) {
		System.out.println("Patrocinio R$"+this.patrocinio);
		System.out.print("Aumento do valor:");
		this.patrocinio+=tec.nextDouble();
		System.out.println("Patrocinio atual R$"+this.patrocinio);	
		} else {
			System.out.println("Menor de idade");
			System.out.println("Patrocinio R$"+(this.patrocinio=0));
		}//if
	}

}
