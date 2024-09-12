
public class Televisao {

	private String marca;
	private double polegadas;
	private int canalAtual;
	private int volume;
	private int VolumeMax;
	private int VolumeMin;

	// GET|SET|CONTRUTOR

	Televisao() {
	}

	Televisao(String Marca, double Polegadas, int VolMax, int VolMin) {
		this.marca = Marca;
		this.polegadas = Polegadas;
		this.VolumeMax = VolMax;
		this.VolumeMin = VolMin;

	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getMarca() {
		return marca;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public int getVOLUMEMAX() {
		return VolumeMax;
	}

	public int getVOLUMEMIN() {
		return VolumeMin;
	}

	// metodos

	public void AumentaVol(int vol) {
		if (vol <= VolumeMax) {
			this.volume += vol;
			System.out.println("Volume Aumentado para  " + this.volume);
		} else {
			System.out.println("Volume Maximo permitido é " + VolumeMax);
		} // if
	}

	public void DimnuirVol(int vol) {
		int SubVol = this.volume - vol;
		if (vol >= VolumeMin && SubVol >= 0) {
			this.volume -= vol;
			System.out.println("Volume Diminuido para  " + this.volume);
		} else {
			System.out.println("Volume Minimo permitido é " + VolumeMin);
		} // if
	}

	public void MudarCanal(int canal) {
		switch (canal) {
		case 2:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 4:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 5:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 7:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 9:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 11:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 13:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		case 33:
			this.canalAtual = canal;
			System.out.println("Você esta no canal " + this.canalAtual);
			break;
		default:
			System.out.println("Canal Sem sinal!!");
			this.canalAtual = canal;
			break;
		}// Switch
	}

	public void ConsultCanal() {
		System.out.println("O canal atual é " + this.canalAtual);
	}

	public void ConsultVol() {
		System.out.println("O Volume atual é " + this.volume);
	}

}
