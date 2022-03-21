package swygonski;

public class zadanie10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cenaAkcji = 21.77;
		
		double wartoscCalosci = 600*cenaAkcji;
		
		double prowizja = wartoscCalosci*0.02;
		
		double suma = wartoscCalosci + prowizja;
		System.out.println("Wartosc akcji bez prowizji: "+wartoscCalosci+"\n wysokosc prowizji: "+prowizja+"\n laczna kwota: "+ suma);
		
	}
}
