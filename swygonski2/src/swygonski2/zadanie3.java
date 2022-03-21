package swygonski2;

import java.util.Scanner;

public class zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner wpisz = new Scanner(System.in);
	       
	       System.out.println("Podaj swoj wzrost w metrach: ");
	       double wzrost = wpisz.nextDouble();
	       System.out.println("Podaj swoja wage: ");
	       int waga = wpisz.nextInt();
	       
	       double BMI = waga /(wzrost*wzrost);
	       
	       if(BMI >= 18.5 && BMI <=25) {
	    	System.out.println("Twoja waga jest prawidlowa. ");   
	       }
	       else if(BMI < 18.5) {
	    	   System.out.println("Masz niedowage. ");   
	       }
	       else {
	    	   System.out.println("Masz nadwage. ");
	       }
		
		
	}

}
