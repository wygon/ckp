package swygonski;

import java.util.Scanner;

public class zadanie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kaloriePorcji = 300;
		int kcalCiastka = kaloriePorcji/4;
		int zjedzoneCiastka;
		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj ilosc zjedzonych ciastek: ");
		zjedzoneCiastka = wpisz.nextInt();
		int kalorieICiastka = kcalCiastka*zjedzoneCiastka;
		System.out.println("Kalorie "+ zjedzoneCiastka+" zjedzonych ciastek to: " + kalorieICiastka);
		
	}
}
