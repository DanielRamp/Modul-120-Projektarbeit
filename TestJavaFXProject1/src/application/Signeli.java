package application;

/**
 * @author Daniel Ramp
 *
 */
public class Signeli {
	
	private static Signeli instance;
	
	private String text1;
	
	public static Signeli getInstance () {
	    if (Signeli.instance == null) {
	    	Signeli.instance = new Signeli ();
	    }
	    return Signeli.instance;
	  }

	/**
	 * @return the text1
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @param text1 the text1 to set
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}
	
}
