package prjTomadaDecisao;
import java.util.Scanner;

public class TomadaDecisao {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		
		double n1, n2, n3, n4, m;
		
		System.out.println("Digite a primeira nota");
		n1= in.nextDouble();
		
		System.out.println("Digite a segunda nota");
		n2= in.nextDouble();
		
		System.out.println("Digite a terceira nota");
		n3= in.nextDouble();
		
		System.out.println("Digite a quarta nota");
		n4= in.nextDouble();
		
		m= (n1+n2+n3+n4)/4;
		System.out.println("A m�dia � "+m);
		
		if (m<4) {
			System.out.println("Voc� est� reprovado!");
		} else if (m<6) {
			System.out.println("Voc� est� de recupera��o!");
		}else {
			System.out.println("Voc� est� aprovado!");
		}
		
	}

}