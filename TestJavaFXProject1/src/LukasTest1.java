import java.util.ArrayList;

// Code by Daniel Ramp
public class LukasTest1 {
	
	public static void main(String[] args) {
		
		// Variante 1: pro Person eine Variable (hier p1)
		LukasTest2_Person p1 = new LukasTest2_Person(0, "Debi", 17, "girl", false);
		
		System.out.println(" --- Variante 1 --- ");
		System.out.println("Name: " + p1.name);
		
		// Variante 2: Alle Personen in einem personen Array beginnend mit 0
		LukasTest2_Person[] personen1 = new LukasTest2_Person[100]; // Array initialisieren und mit null "leeren". Das Array wird hier mit der Groesse 100 erstellt, da es nicht variabel sein kann, siehe Stackoverflow: https://stackoverflow.com/a/15776652
		personen1[0] = new LukasTest2_Person(0, "Debi", 17, "girl", false); // In Position 0 (erste) des Arrays ein Objekt "LukasTest2_Person"
		
			// Ausgabe: Nur eine Person
				System.out.println(" --- Variante 2 --- (nur eine spezifische person)");
				System.out.println("Name: " + personen1[0].name);
				
			// Ausgabe: Alle Personen
				System.out.println(" --- Variante 2 --- (alle Personen)");
				for (int i = 0; i < personen1.length; i++) {
					if (personen1[i] != null) { // check noetig, da Array groesser als inhalt
						System.out.println("Name: " + personen1[i].name);
					}
				}
		
		// Variante 3: Alle Personen in einer personen ArrayList, damit man flexibler ist (nicht mit 0 und so beginnen)
		ArrayList<LukasTest2_Person> personen2 = new ArrayList<LukasTest2_Person>();
		personen2.add(new LukasTest2_Person(0, "Debi", 17, "girl", false));
		
			// Output/Testing/Debugging: (Variante 3)
				// Nur eine Person
						System.out.println(" --- Variante 3 --- (nur eine spezifische person)");
						System.out.println("Name: " + personen2.get(0).name);
				// Alle Personen
					System.out.println(" --- Variante 3 --- (alle Personen)");
					for (LukasTest2_Person person : personen2) {
						System.out.println("Name: " + person.name);
					}
	}

}
//Code by Daniel Ramp