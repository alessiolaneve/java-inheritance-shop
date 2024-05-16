package org.lessons.java.inheritance.shop;

import java.util.Random;

//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

public class Televisori extends Prodotto {
	
	private String dimensione;
	private boolean smart;
	
	public Televisori() {
		
		this.dimensione = randomDimensione() + " pollici";
		this.smart = true;
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
