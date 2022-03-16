package prjListaExercicios;
import java.util.Scanner;

public class Exerc4 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		double valor, ipva;
		
		System.out.println("Digite o valor de seu veículo");
		valor= in.nextDouble();
		
		ipva= (valor*4)/100;
		System.out.println("O valor de seu IPVA é igual á "+ ipva);
	}

}
