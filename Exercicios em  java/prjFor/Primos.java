package prjFor;

import java.util.Scanner;

public class Primos {
	
	public static void main(String[] args) {
		
		for (int i=1;i<201;i++) {
		
			if (i==2 || i==3 || i==5 || i==7 || i==11) {
				System.out.println(i+ " é primo");	
				
			}else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0 && i!=1) {
				System.out.println(i+ " é primo");	
				
			}else 
			System.out.println(i);
		}
	}	
}			
			
		


