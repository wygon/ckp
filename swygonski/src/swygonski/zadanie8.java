package swygonski;

import java.util.Scanner;

public class zadanie8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
		
		System.out.println("Podaj nazwe ulubionego miasta: ");
		String ulubioneMiasto = wpisz.nextLine();
		
		int liczbaZnakow = ulubioneMiasto.length();
		
		String DulubioneMiasto = ulubioneMiasto.toUpperCase();
		String MulubioneMiasto = ulubioneMiasto.toLowerCase();
		char znak = ulubioneMiasto.charAt(0);
		System.out.println("Twoje ulubione miasto: "+ ulubioneMiasto + " \nliczba jego znakow: "+ liczbaZnakow+ "\n"+DulubioneMiasto + " \n"+ MulubioneMiasto + " \n" + znak);
		
	}

}
