package swygonski;

public class zadanie11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ankietowani = 12467;
		double jedenEnergol = 0.14;
		double smakCytrusowy = 0.64;
		
		double aJE = ankietowani*jedenEnergol; 
		double aSC = aJE*smakCytrusowy;
		System.out.println("Jeden energol: "+aJE +"\n Smak cytrusowy: "+ aSC);
	}

}
