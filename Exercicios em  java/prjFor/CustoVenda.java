package prjFor;
import java.util.Scanner;

public class CustoVenda {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		
		double custo, venda, lucro;
		String resposta;
		
		do {
			System.out.println("Qual o valor do custo?");
			custo= in.nextDouble();
			
			System.out.println("Qual o valor da venda?");
			venda= in.nextDouble();
			
			lucro=venda-custo;
			
			System.out.println("Seu lucro é de "+lucro+" reais");
			
			System.out.println("Deseja calcular o lucro de mais algum produto? [SIM/NAO]");
			resposta=in.next();
			
		}while (resposta.equalsIgnoreCase("SIM"));
		System.out.println("Programa finalizado");

	}

}
