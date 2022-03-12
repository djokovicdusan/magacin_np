package model;

import java.util.LinkedList;

import interfaces.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{
	public LinkedList<Artikal> artikli= new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		System.out.println("Nova implementacija Duleta Djokovica");
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

	

}