package application;

/**
 * @author Daniel Ramp
 *
 */
public class Testerli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Signeli si = new Signeli();
		
		si.setText1("blabla");
		si.getInstance().setText1("blaeae");
		
		Signeli si2 = new Signeli();
		
		System.out.println(si2.getInstance().getText1());
		
		Signeli si3 = Signeli.getInstance();
		
		System.out.println(si3.getText1());
		
	}

}
