package prjListaExercicios;
import java.util.Scanner;

public class Exerc5 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		double valor, desconto1, desconto2, valorF ;
		
		System.out.println("digite o valor do produto");
		valor= in.nextDouble();
		
		System.out.println("digite o valor do desconto");
		desconto1= in.nextDouble();
		
		desconto2= (valor*desconto1)/100;
		valorF= valor-desconto2;
		System.out.println("seu valor com desconto é de "+ valorF);
		
		
	}

}
