package org.lessons.java.inheritance.shop;

import java.util.Random;

//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

public class Televisori extends Prodotto {
	
	private String dimensione;
	private boolean smart;
	
	public Televisori(String codice, String nome, String marca, double prezzo, int iva) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensione = randomDimensione() + " pollici";
		this.smart = true;
	}
	
	@Override
	public String toString() {
		return "Hai aggiunto questo televisore in magazzino : " + 
	               super.getCodice() + " - " + 
	               super.getNome() + " - " + 
	               super.getMarca() + " - " + 
	               super.getPrezzo() + "€ - " + 
	               super.getIva() + "% - " + 
	               this.dimensione + " - Smart :" + 
	               this.smart + " - Prezzo totale : " + 
	               calcolaPrezzo() + "€";
	}
	
	public int randomDimensione() {
		
		 // Genera un numero casuale tra 0 e 2
        int dimensione = new Random().nextInt(3); 
        
        if (dimensione == 0) {
        	
            return 40;
            
        } else if (dimensione == 1) {
        	
            return 42;
            
        } else {
        	
            return 46;
            
        }
    }

	public String getDimensione() {
		return dimensione;
	}	
	
	public boolean getSmart() {
		return smart;
	}	
}
