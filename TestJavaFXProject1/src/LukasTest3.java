import java.util.ArrayList;

/**
 * @author Daniel Ramp
 */

public class LukasTest3 {
	
	public static void main(String[] args) {
		
		// Variante 3: Alle Personen in einer personen ArrayList, damit man flexibler ist (nicht mit 0 und so beginnen)
		ArrayList<LukasTest2_Person> personen = new ArrayList<LukasTest2_Person>();
		personen.add(new LukasTest2_Person(personen.size(), "Debi", 17, "girl", false));
		personen.add(new LukasTest2_Person(personen.size(), "Lucky", 18, "boy", true));
		personen.add(new LukasTest2_Person(personen.size(), "Fabu", 18, "Knitting", true));
		
		// Output / Testing / Debugging
			// Nur eine spezifische Person
					System.out.println("dieser Name: " + personen.get(0).name);
			// Alle Personen
				for (LukasTest2_Person person : personen) {
					// Akzeptiert Ja/Nein anstatt true/false
						String acceptedTemp;
						if (person.accepted) {
							acceptedTemp = "Ja";
						} else {
							acceptedTemp = "Nein";
						}
					
					System.out.println("ID: "+person.id+"   Name: "+person.name+
							"   Alter: "+person.age+"   Notiz: "+person.note+"   Akzeptiert: "+acceptedTemp);
				}
		
	}

}
// Code written by Daniel Ramp - c 2020