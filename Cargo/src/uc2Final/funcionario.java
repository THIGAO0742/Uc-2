package uc2Final;

public class funcionario extends pessoa {

	private String matricula;
	private cargo Cargo;

	funcionario() {
		super();
		Cargo = new cargo();
		}

	funcionario(String nome, int idade, cargo Cargo) {
		super(nome, idade);
		cargo cargo2 =  new cargo(Cargo.getNomeCargo(), Cargo.getSalario());
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCargo(cargo cargo) {
		this.Cargo = cargo;
	}

	public cargo getCargo() {
		return Cargo;
	}

	public void mostrarDados() {
		System.out.println("");
		System.out.println("cargo: " + getCargo().getNomeCargo());
		System.out.println("Matricula: " + this.matricula);
		System.out.println("nome: " + getNomePessoa());
		System.out.println("idade: " + getIdadePessoa());
		System.out.println("Salario: " + getCargo().getSalario());
		System.out.println("");

	}
}// class
