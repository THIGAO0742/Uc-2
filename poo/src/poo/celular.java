package poo;

public class celular extends telefone{
	private double CargaBat;
	private String FormTec;
	
	//getset
	public celular() {
		this.CargaBat = 0.0;
		this.FormTec = "Teclas/Touch";
	
	}	
	
	public void setCargaBat(double carga) {
		this.CargaBat = carga;
	}
	public double getCargaBar() {
		return this.CargaBat;
	}
		
	public void setFormaTec(String tec) {
		this.FormTec = tec;
	}
	public String getFormaTec() {
		return this.FormTec;
	}
		
		
		
		
		
	//metodo	
	
	public void FzerLig() {
		System.out.println("Ligação Zap");
		System.out.println(" ");
	}
	
	public void AtenLig() {
		System.out.println("Fala ai Zezinho");
		System.out.println(" ");

	}
	 public void EnviarSms(String texto) {
		 System.out.println("SMS:"+texto);
			System.out.println(" ");

	 }
	public void EnviarEmail(String destino) {
		System.out.println("Email: \nPara: "+destino);
		System.out.println(" ");

	}

}//class
