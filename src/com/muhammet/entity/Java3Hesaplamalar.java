package com.muhammet.entity;

/**
 * E�er bir s�n�f i�inde sabitler kullan�caksan�z. import i�lemi yapabilir ve 
 * daha kolay kullan�m sa�layabilrisiniz.
 * 
 */
import static com.muhammet.entity.RestApiURLs.*;

public class Java3Hesaplamalar {
	
	//PostMapping("") -> gelen iste�i kar��layan k�s�m
	public void kredi1(double yatirimmiktari, int gunsayisi) {
		//RestApiURLs.VERSION = "v2"; // �al��maz
		//RestApiURLs.BILGE = "www.muhamet.com";
		String URL = BILGE + VERSION + HESAP + "/kredi10";
	}

}
