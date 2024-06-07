package org.lessons.java.inheritance.shop;

// - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

public class Smartphone extends Prodotto{
	private String codiceImei;
	private String memoria;
	
	public Smartphone(String codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceImei = Prodotto.generaCodice();
		this.memoria = 128 + " GB";
	}

	@Override
	public String toString() {
		return "Hai aggiunto questo smartphone in magazzino : " + 
	               super.getCodice() + " - " + 
	               super.getNome() + " - " + 
	               super.getMarca() + " - " + 
	               super.getPrezzo() + "€ - " + 
	               super.getIva() + "% - " + 
	               this.codiceImei + " - " + 
	               this.memoria + " - Prezzo totale : " + 
	    	       calcolaPrezzo() + "€";
	}
	
	public String getCodiceImei() {
		return codiceImei;
	}

	public String getMemoria() {
		return memoria;
	}
	
}
