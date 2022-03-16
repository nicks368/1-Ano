package prjListaExercicios;
import java.util.Scanner;

public class Exerc1 {
	public static void main (String [] args) {
		Scanner in= new Scanner(System.in);
		
		int n1, n2, n3, resultado;
		
		System.out.println("Digite o primeiro valor");
		n1= in.nextInt();
		
		System.out.println("Digite o segundo valor");
		n2= in.nextInt();
		
		System.out.println("digite o terceiro valor");
		n3= in.nextInt();
		
		resultado= (n1*n1) + (n2*n2) + (n3*n3);
		System.out.println("este é seu resultado"+resultado);
	}

}
