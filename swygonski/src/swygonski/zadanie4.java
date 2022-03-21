package swygonski;

import java.util.Scanner;

public class zadanie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		System.out.println("Podaj licze zuzytego paliwa: ");
		double zuzytePaliwo = user.nextDouble();

		System.out.println("Podaj liczbe przejechanych kilometrow: ");
		double przejechaneKilometry = user.nextDouble();

		double kilometryNaLitrze = przejechaneKilometry/zuzytePaliwo;
		
		System.out.println("Palisz: " + kilometryNaLitrze + "l paliwa.");
	}

}
