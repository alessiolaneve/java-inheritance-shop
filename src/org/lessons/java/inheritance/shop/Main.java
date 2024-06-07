package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Prodotto prodotto = new Prodotto(null, null, null, 0, 0);
		
		System.out.println("Inserisci il nome del prodotto.");
		String nome = scan.nextLine();
		prodotto.setNome(nome);
		
		System.out.println("Inserisci la marca del prodotto.");
		String marca = scan.nextLine();
		prodotto.setMarca(marca);

		System.out.println("Inserisci il prezzo del prodotto. ###,##");
		Double prezzo = scan.nextDouble();
		prodotto.setPrezzo(prezzo);

		System.out.println("Inserisci l'iva sul prodotto. ##%");
		int iva = scan.nextInt();
		prodotto.setIva(iva);
		
		System.out.println(prodotto.toString());
		
		System.out.println("Che tipo di prodotto è? 1: Cuffie 2: Smartphone 3: Televisore");
		int rispostaProdotto = scan.nextInt();
		scan.nextLine();
		
		switch (rispostaProdotto) {
		case 1: 
			Cuffie cuffie = new Cuffie(Prodotto.getCodice(), nome, marca, prezzo, iva, "Rosse");
			System.out.println(cuffie.toString());
			break;
		
		case 2: 
			Smartphone smartphone = new Smartphone(Prodotto.getCodice(), nome, marca, prezzo, iva);
			System.out.println(smartphone.toString());
			break;
		
		case 3: 
			Televisori televisore = new Televisori(Prodotto.getCodice(), nome, marca, prezzo, iva);
			System.out.println(televisore.toString());
			break;
		
		default:
			System.out.println("Categoria non valida");
		}
	}
}


