package poo;

public class casa {

	private String endereco;
	private String cidade;
	private int quantQuar;
	private	int quantBanh; 
	private int quantSal;
	private double areaContr;
	
	public casa() {
		this.cidade = "Salvador";
		this.quantBanh = 1;
		this.quantQuar = 1;
		this.quantSal = 1;
	}
	
	public casa(String end) {
		this.endereco = end;
	}
	
	public void setEndereco(String Ender) {
		this.endereco = Ender;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setcidade(String city) {
		this.cidade = city;
	}
	
	public String getcidade() {
		return this.cidade;
	}
	
	
	public void setquantBanh(int banheiro) {
		this.quantBanh = banheiro;
	}
	
	public double getquantBanh() {
		return this.quantBanh;
	}
	
	public void setquantSal(int sala) {
		this.quantSal = sala;
	}
	
	public double getquantSal() {
		return this.quantSal;
	}
	
	public void setquantQuar(int quartos) {
		this.quantQuar = quartos;
	}
	
	public double getquantQuar() {
		return this.quantQuar;
	}
	
	public void setAreaConstru(double Area) {
		this.areaContr = Area;
	}
	
	public double getAreaConstru() {
		return this.areaContr;
	}
	
	
	
	public void MostraCasa() {
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("Quant. Quartos: "+this.quantQuar);
		System.out.println("Quant. de Banheiros: "+this.quantBanh);
		System.out.println("Quant. de Salas: "+this.quantSal);
		System.out.println("Área Contruida: "+this.areaContr);
	}
	
	
	
	
	
	
	
	
}
