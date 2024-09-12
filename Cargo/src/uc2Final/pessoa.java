package uc2Final;

public class pessoa {

	private String nomePessoa;
	private int idadePessoa;

	pessoa() { } 

	public pessoa(String nomeP, int idadeP) {
		this.nomePessoa = nomeP;
		this.idadePessoa = idadeP;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

}// class
