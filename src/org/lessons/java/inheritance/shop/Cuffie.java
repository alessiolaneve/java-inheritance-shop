package org.lessons.java.inheritance.shop;


// - Cuffie, caratterizzate dal colore e se sono wireless o cablate


public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;

	public Cuffie(String codice, String nome, String marca, double prezzo, int iva,String colore) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = true;
	}

	@Override
	public String toString() {
		return "Hai aggiunto queste cuffie in magazzino : " + 
	               super.getCodice() + " - " + 
	               super.getNome() + " - " + 
	               super.getMarca() + " - " + 
	               super.getPrezzo() + "€ - " + 
	               super.getIva() + "% - " + 
	               this.colore + " - Wireless : " + 
	               this.wireless + " - Prezzo totale : " + 
	               calcolaPrezzo() + "€";
	}
	
	public String getColore() {
		return colore;
	}

	public boolean isWireless() {
		return wireless;
	}
}
