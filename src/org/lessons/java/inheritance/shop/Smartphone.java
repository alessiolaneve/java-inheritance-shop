package org.lessons.java.inheritance.shop;

// - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

public class Smartphone extends Prodotto{
	private String codiceImei;
	private String memoria;
	
	public Smartphone(String codiceImei, String memoria) {
		this.codiceImei = Prodotto.generaCodice();
		this.memoria = 128 + " GB";
	}

	public String getCodiceImei() {
		return codiceImei;
	}

	public String getMemoria() {
		return memoria;
	}
	
	
}
