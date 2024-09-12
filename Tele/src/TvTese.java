
public class TvTese {

	public static void main(String[] args) {

		Televisao Tv = new Televisao("LG", 55, 100, 0);

		Tv.AumentaVol(50);
		Tv.MudarCanal(54);
		Tv.ConsultVol();

		Tv.AumentaVol(500);
		Tv.ConsultVol();

		Tv.DimnuirVol(285);
		Tv.ConsultCanal();
		Tv.ConsultVol();

	}// MAIN
}
