package prjListaExercicios;
import java.util.Scanner;

public class Exerc3 {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		
		double metro, quilometro;
		
		System.out.println("Digite a quantidade em metros");
		metro= in.nextDouble();
		
		quilometro= metro/1000;
		System.out.println("Seu valor em quilometros é de "+ quilometro);
		
	}

}
