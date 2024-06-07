package org.lessons.java.inheritance.shop;

/*
 * 
Lo shop gestisce diversi tipi di prodotto:
- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che
 gestiscono i vari sotto tipi di prodotto.
 * */


public class Prodotto {
	private static String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	
	/*
	 * Usate opportunamente i livelli di accesso (public, private),i costruttori,
 	   i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
	 */
	
	// costruttore
		public Prodotto(String codice, String nome, String marca, double prezzo, int iva) {
			Prodotto.codice = generaCodice();	
			this.nome = nome;
			this.marca = marca;
			this.prezzo = prezzo;
			this.iva = iva;
		}
		
		public static String generaCodice() {
			
			double random = Math.random() * 100000000;
			return String.valueOf((int)random);
			}
		
		public Double calcolaPrezzo() {
			Double prezzoIva = prezzo * iva / 100;
			return prezzo + prezzoIva;
			}
		
		public String toString() {
			return codice + " - " + 
					nome + " - " + 
					marca + " - " + 
					prezzo + "€ - " + 
					iva + "% - " + 
					calcolaPrezzo() + "€";
		}
		/*
		 *  - il codice prodotto sia accessibile solo in lettura
	 	 *	- gli altri attributi siano accessibili sia in lettura che in scrittura
		 */
		
		public static String getCodice() {
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

		public void setIva(int iva) {
			this.iva = iva;
		}

		
		
		
	
}
