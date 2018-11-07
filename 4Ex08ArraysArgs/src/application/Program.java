package application;

public class Program {
	public static void main(String[] args) {
		
		int tamanho=10;
		
		if(args.length!=0) {
			tamanho=Integer.parseInt(args[0]);
		}
		

	int[] numeros=new int[tamanho];
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=i*2;
			System.out.println(numeros[i]);
		}

	}
	//usar no cmd
}
