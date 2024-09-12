package poo;

import java.util.Scanner;

public class conta {
	public static Scanner tec = new Scanner(System.in);
	private String titular;
	private String nConta;
	private String agencia;
	private double saldo;
	private String dataAbert;

	// getset construtor

	public conta() {
	}

	public conta(String nome, String Nconta) {
		this.saldo = 0;
		this.agencia = "001-01";
		this.nConta = Nconta;
		this.titular = nome;
	}

	public void setTitular(String tit) {
		this.titular = tit;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setNConta(String n) {
		this.nConta = n;
	}

	public String getNConta() {
		return this.nConta;
	}

	public void setAgencia(String a) {
		this.agencia = a;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setDatAbert(String data) {
		this.dataAbert = data;
	}

	public String getDarAber() {
		return this.dataAbert;
	}

	public void setSaldo(double Sal) {
		this.saldo = Sal;
	}

	public double getSaldo() {
		return this.saldo;
	}

	// metodos

	public void mostrarDados() {
		System.out.println("Titular: " + this.titular);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("N. Conta: " + this.nConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data de Abertura: " + this.dataAbert);
	}// msotrar dados

	public void lerDados() {
		System.out.print("Titular: ");
		this.titular = tec.next();
		System.out.print("Agencia: ");
		this.agencia = tec.next();
		System.out.print("N. Conta: ");
		this.nConta = tec.next();
		System.out.print("Saldo: ");
		this.saldo = tec.nextInt();
		System.out.print("Data de Abertura: ");
		this.dataAbert = tec.next();
	}// lerdados

	public void sacar() {
		double saque = 0;
		System.out.println("** Saque **");
		System.out.print("Valor do Saque R$");
		saque = tec.nextDouble();
		if (saque <= this.saldo && saque >= 0) {
			this.saldo -= saque;
			System.out.println("Saque Realizado!!");
		} else {
			System.out.println("Valor do Saldo Insuficiente!!");
		}
	}// saque

	public void deposito() {
		double dep = 0;
		System.out.println("** Depósito **");
		System.out.print("Valor a ser Depositado R$");
		dep = tec.nextDouble();
		if (saldo >= 0) {
			this.saldo += dep;
			System.out.println("Valor Depositado R$" + dep);
			System.out.println("Saldo Atual R$" + this.saldo);
		} else {
			System.out.println("Não foi possivel realizar o depósito");
		}
	}// dep

	public void calcularRend() {
		final double REND = 0.005;
		double rendMensal = this.saldo * REND;
		System.out.println("Seu Rendimento mensal é R$" + rendMensal);
		this.saldo += rendMensal;
		System.out.println("O Seu saldo agora é de " + this.saldo);
	}

}// class
