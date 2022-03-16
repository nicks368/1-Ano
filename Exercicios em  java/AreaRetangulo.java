package prjAreaRetangulo;
import java.util.Scanner;

public class AreaRetangulo {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		
		double largura, comprimento, area;
		
		System.out.println("Digite o valor da largura");
		largura= in.nextDouble();
		
		System.out.println("Digite o valor do comprimento");
		comprimento= in.nextDouble();
		
		area= largura*comprimento;
		System.out.println("A área de seu retangulo é "+area);
		
	}

}
