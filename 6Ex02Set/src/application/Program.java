package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("---TreeSet--------------");
		/* TreeSet tem ordenação por ordem ascendente de
		 * inseção. Não permite duplicações
		 */
		
		Set<String> cursos = new TreeSet<>();
		
		cursos.add("PHP");
		cursos.add("PHP");
		cursos.add("Linux");
		cursos.add("Java");
		
		for(String c:cursos) {
			System.out.println("Curso: "+c);
		}
		
		System.out.println("---TreeSet--------------");
		/* TreeSet não tem ordenação  
		 * Não permite duplicações
		 */
		
		Set<String> cursos1 = new HashSet<>();
		
		cursos1.add("PHP");
		cursos1.add("PHP");
		cursos1.add("Linux");
		cursos1.add("Java");
		
		for(String c:cursos1) {
			System.out.println("Curso: "+c);
		}
		
		
		
	}

}
