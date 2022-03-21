package swygonski;

import java.util.Scanner;

public class zadanie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double podatekStanowy = 0.04;
 double podatekLokalny = 0.02;
 
 Scanner klawisz = new Scanner(System.in);
 
 System.out.println("Podaj cene produktu: ");
 
 double produkt = klawisz.nextDouble();
 
 double cena = produkt+(produkt*podatekStanowy)+(produkt*podatekLokalny);
 
 System.out.println("Wartosc "+ produkt +", podatek stanowy="+podatekStanowy +", podatek lokalny="+podatekLokalny);
 System.out.println("Cena produktu z podatkami to: "+ cena);
	}

}
