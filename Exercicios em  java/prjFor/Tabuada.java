package prjFor;

public class Tabuada {

	public static void main(String[] args) {
		
		int resultado;
		
		for (int i=1, o=1;i<11 && o<11;o++) {
			
			resultado= i*o;
			System.out.println(i+"x"+o+"="+resultado);
		
			if (o==10) {
				o=0;
				i++;
			}
		
		}
		
    }

}
