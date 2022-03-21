package swygonski;

import java.util.Scanner;

public class zadanie9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner wpisz = new Scanner(System.in);
		System.out.println("Podaj cene posiłku: ");
		double cenaPosilku = wpisz.nextDouble();
		double podatek = cenaPosilku*0.0675;
		double napiwek = (cenaPosilku+podatek)*0.2;
		double suma = cenaPosilku+podatek+napiwek;
		System.out.println("Cena posilku: "+cenaPosilku+"\n podatek: "+ podatek+"\n wysokosc napiwku "+napiwek + "\n suma do zaplaty: "+ suma);
	}

}
