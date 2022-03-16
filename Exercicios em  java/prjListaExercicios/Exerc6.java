package prjListaExercicios;
import java.util.Scanner;

public class Exerc6 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		double emprestimo, prestacao1, juros, prestacao2, total;
		int meses;
		
		System.out.println("Digite o valor que você deseja");
		emprestimo= in.nextDouble();
		
		System.out.println("Digite a quantidade de meses em que você deseja pagar");
		meses= in.nextInt();
		
		prestacao1= emprestimo/meses;
		juros= (2.5/100)*prestacao1;
		prestacao2= prestacao1+juros;
		total= prestacao2*meses;
		
		System.out.println("O valor de suas prestações será de "+prestacao2+ " e o valor total que será pago é de "+ total);
		
	}

}
	