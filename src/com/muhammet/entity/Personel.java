package com.muhammet.entity;

/**
 * final -> e�er birs�n�f�n ba��na gelirse s�n�f�n de�imezli�ini garanti eder.
 * final miras al�nabilirli�i iptal eder. final bir s�n�f miras al�namaz.
 * �NEML� -> bir s�n�f� final yaparsan�z, t�m methodlar� final olur.
 * @author MuhammetAli
 *
 */
public final class Personel {
	
	public String ad;
	public String soyad;
	
	/**
	 * Bir method olabilen en iyi konumda
	 * kodlamada ise daha iyisi yaz�lamaz
	 * deniliyor ise final ile kitlenir.
	 * final -> miras alan child larda
	 * methodun override edilemezli�ini 
	 * garanti eder.
	 */
	public final void isimDegistir() {
		ad = ad.toUpperCase();
	}
	
	public void Ornek() {
		System.out.println("pi....: "+ Math.PI);
		String ifade = "";
	}

}
