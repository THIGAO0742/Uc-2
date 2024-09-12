import java.util.Scanner;

public class natacao extends atleta {
	private String tipoDeNado;
	private double patrocinio;
	
	
	natacao(){
		super();
	}
	natacao(String nome, String sexo,int idade,String nado,double patroci){
		super(nome, sexo, idade);
		this.tipoDeNado = nado;
		this.patrocinio =  patroci;	
	}

	public String getTipoDeNado() {
		return tipoDeNado;
	}
	public void setTipoDeNado(String tipoDeNado) {
		this.tipoDeNado = tipoDeNado;
	}
	public double getPatrocinio() {
		return patrocinio;
	}
	public void setPatrocinio(double patrocinio) {
		this.patrocinio = patrocinio;
	}
	
	@Override
	public void reajuste() {
		Scanner tec = new Scanner(System.in);
		double porcetagem;
		System.out.println("Patrocinio R$"+this.patrocinio);
		System.out.print("Reajuste percentual sobre o patrocinio:");
		porcetagem=tec.nextDouble();
		this.patrocinio = this.patrocinio + ((porcetagem/100) + this.patrocinio);
		System.out.println("Patrocinio atual R$"+this.patrocinio);
	}
	
	public void ExebirDetalhes() {
		System.out.println("Natação");
		exebirAlteta();
		System.out.println("Tipo de nado: "+this.tipoDeNado);
		System.out.println("Patrocinio: "+this.patrocinio);
	}
	
}//clas
