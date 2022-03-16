package prjAnoFulano;
import java.util.Scanner;

public class AnoFulano {
	public static void main (String [] args) {
		
		Scanner in= new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Digite seu nome");
		nome= in.next();
		
		System.out.println("Digite sua idade");
		idade= in.nextInt();
		
		System.out.println(nome+", sua idade é de "+idade+" anos");
		
		
		
		
	}

}
