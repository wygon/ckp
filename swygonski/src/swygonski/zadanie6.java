package swygonski;

import java.util.Scanner;

public class zadanie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj wynik 1 testu: ");
		double wynik1 = wpisz.nextDouble();
		System.out.println("Podaj wynik 2 testu: ");
		double wynik2 = wpisz.nextDouble();
		System.out.println("Podaj wynik 3 testu; ");
		double wynik3 = wpisz.nextDouble();
		double srednia = (wynik1+wynik2+wynik3)/3;
		System.out.println("Wynik z 1 to:"+wynik1+"\n Wynik z 2 to: "+wynik2+"\n Wynik z 3 to: "+wynik3);
		System.out.println("Srednia to: "+ srednia);
	}

}
