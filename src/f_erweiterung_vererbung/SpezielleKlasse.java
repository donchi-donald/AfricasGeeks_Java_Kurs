package f_erweiterung_vererbung;

public class SpezielleKlasse extends  AllgemeineKlasse {
	private float x;
	
	@Override
	public void fachMethode() {
		// TODO Auto-generated method stub
		super.fachMethode();
		x = x / 2;
	}
	

}
