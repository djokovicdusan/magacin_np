package interfaces;

import model.Artikal;

public interface MagacinInterfejs {
	
	public void dodajArtikal(Artikal artikal);
	public void izbaciArtikal(Artikal artikal);
	public Artikal pronadjiArtikal(int sifra);
}