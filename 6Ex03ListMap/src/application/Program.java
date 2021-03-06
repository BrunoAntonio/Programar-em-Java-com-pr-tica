package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		System.out.println("---ArrayList--------------");

		List<String> cursos = new ArrayList<>();

		cursos.add("PHP");
		cursos.add("PHP");
		cursos.add("Linux");
		cursos.add("Java");

		for (String c : cursos) {
			System.out.println("Curso: " + c);
		}
		System.out.println(cursos.get(0));

		System.out.println("---HashMap--------------");
		/*
		 * HashMap n�o tem ordena��o. Permite duplica��es. R�pida na busca e inser��o de
		 * dados
		 */

		Map<String,String> cursos1= new HashMap<>();
		
		cursos1.put("a","PHP");
		cursos1.put("b","PHP");
		cursos1.put("c","Linux");
		cursos1.put("d","Java");
		
		for (String c : cursos1.values()) {
			System.out.println(c);
		}
		
		System.out.println(cursos1);
		System.out.println(cursos1.get("a"));
		System.out.println(cursos1.containsKey("b"));
		
	}

}
