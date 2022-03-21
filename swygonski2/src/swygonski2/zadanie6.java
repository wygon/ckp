package swygonski2;

import java.util.Scanner;

public class zadanie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj liczbe sekund: ");
		int sekundy = wpisz.nextInt();
		
			
		if(sekundy<60)
		{
			System.out.println("Twoja liczba to "+sekundy+" sekund.");
		} else if(sekundy<3600)
		{
			System.out.println("Twoja liczba to " + sekundy/60 + "minut i " + sekundy/360 + "sekund");
		}
		
	}

}
