package swygonski;

import java.util.Scanner;

public class zadanie13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj sume poczatkowa: ");
		double pieniadzePoczatkowe = wpisz.nextDouble();
		System.out.println("Podaj roczna stope oprocentowania: ");
		double rocznaSO = wpisz.nextDouble();
		System.out.println("Podaj kapitalizacje odstetek(4 lub 12): ");
		int kapitalizacja = wpisz.nextInt();
		System.out.println("Podaj lata generacji odsetek: ");
		int lataGO = wpisz.nextInt();
		double P = pieniadzePoczatkowe;
		double r = rocznaSO*10;
		int n = kapitalizacja;
		int t = lataGO;
		double A = ((P*1+(r/n)*n)*t);
		
		System.out.println("Suma odlozona po:"+lataGO+" latach to "+A);
		
		
	}

}
