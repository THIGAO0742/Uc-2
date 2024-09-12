package uc2Final;

public class cargo {

	private String nomeCargo;
	private double salario;

	// get|set|construtor
	cargo() { }

	cargo(String NomeC, double Valor) {
		this.nomeCargo = NomeC;
		this.salario = Valor;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	// metodo

	public void aumentoSalario(double sal) {
		this.salario += sal;
		System.out.println("Aumeto de Salario!!");
		System.out.println();
	}
}
