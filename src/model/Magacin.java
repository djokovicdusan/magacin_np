package model;

import java.util.LinkedList;

import interfaces.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{
	public LinkedList<Artikal> artikli= new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal !=null)
			artikli.add(artikal);
		artikli.add(artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {

		for(Artikal a: artikli)
			if (a.getSifra()==artikal.getSifra()) {
				a.setKolicina(artikal.getKolicina()-1);
			}
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		for(Artikal a: artikli) 
			if (a.getSifra()==sifra) {
				return a;
			}
		return null;
		
	}
}