package com.muhammet.entity;

/**
 * Eðer bir sýnýf içinde sabitler kullanýcaksanýz. import iþlemi yapabilir ve 
 * daha kolay kullaným saðlayabilrisiniz.
 * 
 */
import static com.muhammet.entity.RestApiURLs.*;

public class Java3Hesaplamalar {
	
	//PostMapping("") -> gelen isteði karþýlayan kýsým
	public void kredi1(double yatirimmiktari, int gunsayisi) {
		//RestApiURLs.VERSION = "v2"; // çalýþmaz
		//RestApiURLs.BILGE = "www.muhamet.com";
		String URL = BILGE + VERSION + HESAP + "/kredi10";
	}

}
