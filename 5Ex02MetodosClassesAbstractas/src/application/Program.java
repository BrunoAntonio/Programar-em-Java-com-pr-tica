package application;

import entities.Motorista;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
		
		Secretaria s1 = new Secretaria("Joana", 30, false, "Porto", "91", 600, 4040, true);
		Motorista m1 = new Motorista("Antonio", 35, true, "Porto", "92", 800, 1010, 5);
		//Funcionario f1 = new Funcionario();
		
		
		Secretaria s2 = new Secretaria();
		
		s2.setNome("Sara");
		s2.setSalario(650);
		s2.reajustarSalario();
		m1.reajustarSalario();
		
		System.out.println("Nome: "+s1.getNome()+", Salario: "+s1.getSalario());
		System.out.println("Nome: "+m1.getNome()+", Salario: "+m1.getSalario());
		System.out.println("Nome: "+s2.getNome()+", Salario: "+s2.getSalario());
		System.out.println();
		System.out.println(m1.toString());
	}

}
