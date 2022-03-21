package swygonski;

import java.util.Scanner;

public class zadanie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
	
		double marza = 0.4;
		System.out.println("Podaj cene detaliczna plytki: ");
		double cenaDetaliczna = wpisz.nextDouble();
		
		double zysk = cenaDetaliczna*marza;
		System.out.println("Zysk z sprzedazy to: "+zysk);
	}
}
