package application;

public class Program {

	public static void main(String[] args) {
		
		
		String [][] cidades= new String [3][2];
		cidades[0][0]="S�o Paulo";
		cidades[0][1]="Barretos";
		cidades[1][0]="Belo Horizonte";
		cidades[1][1]="Ouro Preto";
		cidades[2][0]="Curitiba";
		cidades[2][1]="Londrina";
		
		for (int i=0 ; i<cidades.length; i++) {
			for (int j=0; j<cidades[i].length;j++) {
				System.out.println(cidades[i][j]);
			}
		}
		System.out.println("--------------------------");
		//outra forma de imprimir
		
		for (String[] cidade : cidades) {
			for (String c: cidade) {
				System.out.println(c);
			}
		}
		
		System.out.println("-----------------------------------------");
		
		
		
		//Matriz de forma simplificada
		String [][] cidades1={{"S�o Paulo"},{"Barretos"},
							{"Belo Horizonte"},{"Ouro Preto"},
							{"Curitiba"},{"Londrina"}};
		
		
		for (int i=0 ; i<cidades1.length; i++) {
			for (int j=0; j<cidades1[i].length;j++) {
				System.out.println(cidades1[i][j]);
			}
		}
		

	}

}
