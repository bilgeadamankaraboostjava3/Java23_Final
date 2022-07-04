package com.muhammet.entity;

/**
 * final -> eðer birsýnýfýn baþýna gelirse sýnýfýn deðimezliðini garanti eder.
 * final miras alýnabilirliði iptal eder. final bir sýnýf miras alýnamaz.
 * ÖNEMLÝ -> bir sýnýfý final yaparsanýz, tüm methodlarý final olur.
 * @author MuhammetAli
 *
 */
public final class Personel {
	
	public String ad;
	public String soyad;
	
	/**
	 * Bir method olabilen en iyi konumda
	 * kodlamada ise daha iyisi yazýlamaz
	 * deniliyor ise final ile kitlenir.
	 * final -> miras alan child larda
	 * methodun override edilemezliðini 
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
