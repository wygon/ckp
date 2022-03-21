package swygonski2;

import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wpisz = new Scanner(System.in);
	
		System.out.println("Podaj dzien w formie liczby: ");
		int a = wpisz.nextInt();
		
		System.out.println("Podaj miesiac w formie liczby: ");
		int b = wpisz.nextInt();
		
		System.out.println("Podaj dwie ostatnie liczby roku: ");
		int c = wpisz.nextInt();
		
		if(a*b==c){
		System.out.println("Data jest magiczna.");
		}
		else 
		{
			System.out.println("Data nie jest magiczna.");
		}
	}

}
