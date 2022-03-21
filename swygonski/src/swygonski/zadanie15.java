package swygonski;

import java.util.Scanner;

public class zadanie15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner wpisz = new Scanner(System.in);
    
    System.out.println("Podaj dlugosc rzedu");
    double dlugoscRzedu = wpisz.nextDouble();
    
    System.out.println("Podaj miejsce zajmowane przez okratowanie");
    double okratowanie = wpisz.nextDouble();
  
    System.out.println("Podaj odleglosc miedzy sadzonkami ");
    double odlegloscMiedzySadzonkami = wpisz.nextDouble();
    
    double liczbaSadzonek = (dlugoscRzedu-(2*okratowanie))/odlegloscMiedzySadzonkami;
    
    System.out.println("Wlasciciel winnicy moze posadzic " + liczbaSadzonek + " sadzonek.");
	}

}
