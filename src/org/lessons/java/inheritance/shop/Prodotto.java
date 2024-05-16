package org.lessons.java.inheritance.shop;

/*
 * 
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che
 gestiscono i vari sotto tipi di prodotto.
 * */


public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	/*
	 * Usate opportunamente i livelli di accesso (public, private),i costruttori,
 	   i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
	 */
	
	// costruttore
		public Prodotto() {
			this.codice = generaCodice();	
		}
		
		public static String generaCodice() {
			
			double random = Math.random() * 100000000;
			return String.valueOf((int)random);
			}

		/*
		 *  - il codice prodotto sia accessibile solo in lettura
	 	 *	- gli altri attributi siano accessibili sia in lettura che in scrittura
		 */
		
		public String getCodice() {
			return codice;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

		public double getIva() {
			return iva;
		}

		public void setIva(double iva) {
			this.iva = iva;
		}

		
		
		
	
}
