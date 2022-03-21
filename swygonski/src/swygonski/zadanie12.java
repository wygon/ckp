package swygonski;

import java.util.Scanner;

public class zadanie12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ciastka = new Scanner(System.in);
		
		double cukier = 1.5;
		double maslo = 1;
		double maka = 2.75;
		double pierwszeCiastka = 48;
		double cukierJC =cukier/pierwszeCiastka;
		double masloJC =maslo/pierwszeCiastka;
		double makaJC =maka/pierwszeCiastka;
		
		System.out.println("Podaj ile chcesz przygotowac ciastek: ");
		double liczbaCiastek = ciastka.nextDouble();
		
		double cukierLC = cukierJC*liczbaCiastek;
		double masloLC = masloJC*liczbaCiastek;
		double makaLC = makaJC*liczbaCiastek;
		System.out.println("Potrzebujesz: " + cukierLC + "cukru \n"+ masloLC + " masla \n" + makaLC +" maki.");
	}

}
