package prjListaExercicios;
import java.util.Scanner;

public class Exerc6 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		double emprestimo, prestacao1, juros, prestacao2, total;
		int meses;
		
		System.out.println("Digite o valor que voc� deseja");
		emprestimo= in.nextDouble();
		
		System.out.println("Digite a quantidade de meses em que voc� deseja pagar");
		meses= in.nextInt();
		
		prestacao1= emprestimo/meses;
		juros= (2.5/100)*prestacao1;
		prestacao2= prestacao1+juros;
		total= prestacao2*meses;
		
		System.out.println("O valor de suas presta��es ser� de "+prestacao2+ " e o valor total que ser� pago � de "+ total);
		
	}

}
	