package prjFor;

public class Array {

	public static void main(String[] args) {
		int[] primos = new int[6];
			primos[0] = 2;
			primos[1] = 3;
			primos[2] = 5;
			primos[3] = 7;
			primos[4] = 11;
			primos[5] = 13;
			
			for (int i=0, o=1; o<201 && i<6; o++) {
				primos [i] = i;
				
				if (o%i != 0) {
					System.out.println(o+ " é primo");
				}else
					System.out.println(o);
			}

	}

}
