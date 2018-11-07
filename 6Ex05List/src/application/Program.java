package application;

import java.util.ArrayList;
import java.util.List;

import entities.Funcionario;
import entities.Motorista;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> funcionario = new ArrayList<>();

		Secretaria s1 = new Secretaria("Joana", 30, false, "Porto", "91", 600, 4040, true);
		Motorista m1 = new Motorista("Antonio", 35, true, "Porto", "92", 800, 1010, 5);

		Secretaria s2 = new Secretaria("Sara", 29, false, "Gaia", "91", 700, 3030, true);
		Motorista m2 = new Motorista("Roberto", 45, true, "Gaia", "92", 900, 1020, 15);

		funcionario.add(s1);
		funcionario.add(s2);
		funcionario.add(m1);
		funcionario.add(m2);

		for (Funcionario f : funcionario) {
			System.out.println(f);
		}
		
		
		System.out.println("---------------------------------");
		funcionario.removeIf(p->p.getSalario()<=700);
		
		for (Funcionario f : funcionario) {
			System.out.println(f);
		}

	}

}
