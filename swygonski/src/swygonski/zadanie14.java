package swygonski;

public class zadanie14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int akcje = 1000;
		double cenaKA = 32.87;
		double broker = 0.02;
		double cenaSA = 33.92;
		double brokerKA = (akcje*cenaKA)*broker;
		double brokerSA = (akcje*cenaSA)*broker;
		double zarobek = ((akcje*cenaSA)*0.98)-((akcje*cenaKA)*1.02);
		
		System.out.println("Jacek kupil akcje za: "+akcje*cenaKA+"\nZaplacil brokerowi: "+brokerKA+"\nSprzedal za: "+akcje*cenaSA+"\nZaplacil brokerowi: "+brokerSA+"\nJacek zarobil: "+zarobek);
		
		
	}

}
