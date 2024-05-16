package org.lessons.java.inheritance.shop;


// - Cuffie, caratterizzate dal colore e se sono wireless o cablate


public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;

	public Cuffie(String colore) {
		this.colore = colore;
		this.wireless = true;
	}

	public String getColore() {
		return colore;
	}

	public boolean isWireless() {
		return wireless;
	}
}
