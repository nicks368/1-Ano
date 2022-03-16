package prjFor;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);

		int ano, idade = 0, maior=0, menor=1000000;
		
		for (int i=1; i<11; i++) {
			
			System.out.println("Em qual ano você nasceu?");
			ano= in.nextInt();
			
			idade= 2020-ano;
			
			if (idade<menor) {
				menor=idade;
				
			}else maior=idade;
				
			System.out.println("Sua idade é de " +idade+ " anos");
		}
		System.out.println("O mais velho tem " +maior+ " anos");
		System.out.println("O mais novo tem " +menor+ " anos");
	}

}
