// Code by Daniel Ramp
public class LukasTest1 {

	@SuppressWarnings("deprecation")
	Object[][] data = { { "1", "Debi", new Integer(17), "girl", new Boolean(false)} };
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		LukasTest2_Person p1 = new LukasTest2_Person(0, "Debi", 17, "girl", false);
		
		System.out.println(p1);
		
		
		// oder sogar alle Personen in einem Array
		LukasTest2_Person[] personen = null;
		
		personen[0] = new LukasTest2_Person(0, "Debi", 17, "girl", false);
		
	}

}
//Code by Daniel Ramp