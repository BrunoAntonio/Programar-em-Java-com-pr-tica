package application;

public class Program {

	public static void main(String[] args) {
		
		int x=10;
		int y=3;
		
		int divisao = x/y;
		int resto = x%y;
		
		System.out.println("Divis�o: "+divisao);
		System.out.println("Resto: "+resto);
		
		System.out.println();
		System.out.println("ATRIBUI��O COMPOSTA");
		x=12;
		System.out.println(x-=4); //subtrac��o
		System.out.println(x*=2); //multiplica��o
		System.out.println(x/=4); //divis�o
		
		System.out.println();
		System.out.println("OPERADORES INCREMENTAIS E DECREMENTAIS");
		x=3;
		System.out.println("resultado: "+ (++x +2)); //pr�-incremental: 
		System.out.println("valor de x: "+ +x);
		x=3;
		//System.out.println("resultado: "+ (x-- +2))
		System.out.println("resultado: "+ (x++ +2));//p�s-incremental: 1 s� e acrescentado ap�s a execu��o
		System.out.println("valor de x: "+ +x);
		
		System.out.println();
		System.out.println("OPERADORES DE COMPARA��O");
		System.out.println("x � igual a y? "+ (x==y));
		System.out.println("x � diferente de y? "+ (x!=y));
		System.out.println("x � maior que y? "+ (x>y));
		System.out.println("x � menor que y? "+ (x<y));
		
		System.out.println();
		System.out.println("OPERADORES L�GICOS");
		System.out.println("resultado usando and: "+(10==3 && 8!=10));
		System.out.println("resultado usando and: "+(10>8 && 3<8));
		System.out.println("resultado usando or: "+(10<8 || 8==10));
		System.out.println("resultado usando or: "+(10>8 || 3<8));
		
		System.out.println();
		System.out.println("OPERADOR TERN�RIO");
		String resultado = (x/y<2 ? "Sim":"N�o");
		System.out.println(resultado);
		
	}

}
