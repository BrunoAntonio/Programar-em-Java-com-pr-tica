package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("---TreeSet--------------");
		/* TreeSet tem ordena��o por ordem ascendente de
		 * inse��o. N�o permite duplica��es
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
		/* TreeSet n�o tem ordena��o  
		 * N�o permite duplica��es
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
