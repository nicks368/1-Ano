package prjListaExercicios;
import java.util.Scanner;

public class Exerc2 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		int numero, antecessor, sucessor;
		
		System.out.println("Escreva o numero desejado");
		numero= in.nextInt();
		
		antecessor= numero-1;
		sucessor= numero+1;
		System.out.println("O antecessor de seu numero é "+ antecessor + " e seu sucessor é "+ sucessor);
		
	}

}
