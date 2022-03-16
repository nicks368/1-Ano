package prjCelsiusFahrenheit;
import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main (String [] args) {
		Scanner in= new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahrenheit");
		f= in.nextDouble();
		
		c= (f-32)*(5/9);
		System.out.println("A temperatura em graus Celsius é igual á "+c);
		
	}

}
