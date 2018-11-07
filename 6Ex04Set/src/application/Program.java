package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		
		String [] frutas= {"morango", "ma�a", "uva", "banana", "pera", "goiaba", "amora"};
		String[] frutas2= {"ma�a", "lim�o", "graviola", "banana", "mam�o", "goiaba"};
		
		Set<String>listaFrutas=new HashSet<>(Arrays.asList(frutas));
		
		Set<String>listaFrutas2=new HashSet<>(Arrays.asList(frutas2));

		for(String f: listaFrutas) {
			System.out.print(f.toUpperCase()+ " " );
		}
		System.out.println();
		System.out.println("Total de Frutas: "+listaFrutas.size());
		
		for(String f: listaFrutas2) {
			System.out.print(f.toUpperCase()+ " " );
		}
		System.out.println();
		System.out.println("Total de Frutas: "+listaFrutas2.size());
		
		Set<String>listaFrutas3=new HashSet<>(listaFrutas);
		listaFrutas3.addAll(listaFrutas2);
		
		for(String f: listaFrutas3) {
			System.out.print(f.toUpperCase()+ " " );
		}
		System.out.println();
		System.out.println("Total de Frutas: "+listaFrutas3.size());
		
	}

}