package application;

public class Program {

	public static void main(String[] args) {
		
		int x=10;
		int y=3;
		
		int divisao = x/y;
		int resto = x%y;
		
		System.out.println("Divisão: "+divisao);
		System.out.println("Resto: "+resto);
		
		System.out.println();
		System.out.println("ATRIBUIÇÃO COMPOSTA");
		x=12;
		System.out.println(x-=4); //subtracção
		System.out.println(x*=2); //multiplicação
		System.out.println(x/=4); //divisão
		
		System.out.println();
		System.out.println("OPERADORES INCREMENTAIS E DECREMENTAIS");
		x=3;
		System.out.println("resultado: "+ (++x +2)); //pré-incremental: 
		System.out.println("valor de x: "+ +x);
		x=3;
		//System.out.println("resultado: "+ (x-- +2))
		System.out.println("resultado: "+ (x++ +2));//pós-incremental: 1 só e acrescentado após a execução
		System.out.println("valor de x: "+ +x);
		
		System.out.println();
		System.out.println("OPERADORES DE COMPARAÇÃO");
		System.out.println("x é igual a y? "+ (x==y));
		System.out.println("x é diferente de y? "+ (x!=y));
		System.out.println("x é maior que y? "+ (x>y));
		System.out.println("x é menor que y? "+ (x<y));
		
		System.out.println();
		System.out.println("OPERADORES LÓGICOS");
		System.out.println("resultado usando and: "+(10==3 && 8!=10));
		System.out.println("resultado usando and: "+(10>8 && 3<8));
		System.out.println("resultado usando or: "+(10<8 || 8==10));
		System.out.println("resultado usando or: "+(10>8 || 3<8));
		
		System.out.println();
		System.out.println("OPERADOR TERNÁRIO");
		String resultado = (x/y<2 ? "Sim":"Não");
		System.out.println(resultado);
		
	}

}
