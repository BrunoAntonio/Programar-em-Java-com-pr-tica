package application;

import entities.Programador;
import entities.Endereco;

public class Program {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco("Porto", 2,"Sé");
		Programador p1 = new Programador("Antonio", 35,800,e1,"Java");
		Programador p2 = new Programador("Bruno",30,1000,new Endereco("Porto",5,"Foz"),"c++");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.trabalhar();
		
	}

}
