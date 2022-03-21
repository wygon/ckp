package swygonski2;

import java.util.Scanner;

public class zadanie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		
		System.out.println("Podaj mase obiektu!: ");
		double masa = wpisz.nextDouble();
		
		masa = masa * 9.8;
		
		if (masa > 1000) {
			
			System.out.println("Obiekt jest, za ciezki: "+masa);
			
		} else if (masa < 10) 
		{	
			System.out.println("Obiekt jest za lekki: "+masa);
		} else 
		{	
			System.out.println("Przedmiot wazy: "+masa);
		}
		
		
	}

}
