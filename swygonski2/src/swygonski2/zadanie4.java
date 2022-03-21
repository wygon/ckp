package swygonski2;

import java.util.Scanner;

public class zadanie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj wynik pierwszego testu: ");
		double a = wpisz.nextDouble();
		wpisz.nextDouble();
		System.out.println("Podaj wynik drugiego testu: ");
		double b = wpisz.nextDouble();
		wpisz.nextDouble();
		System.out.println("Podaj wynik trzeciego testu: ");
		double c = wpisz.nextDouble();
		wpisz.nextDouble();
		double wynik = a + b + c;
		double srednia = wynik/3;

		if(srednia>90) {
			System.out.println("Ocena: 5");
		}
		else if(srednia>=80 || srednia <=89) {
			System.out.println("Ocena: 4");
		}
		else if(srednia>=70 || srednia <=79) {
			System.out.println("Ocena: 3");
			
		}
		else if(srednia >=60 || srednia <=69) {
			System.out.println("Ocena: 2");
			
		}
		else if(srednia < 60) {
			System.out.println("Ocena: 1");
		}
	}

}
