
/**
 * @author Daniel Ramp
 */

public class LukasTest2_Person {

	public Integer id;
	public String name;
	public Integer age;
	public String note;
	public Boolean accepted;

	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param note
	 * @param accepted
	 */
	public LukasTest2_Person(Integer id, String name, Integer age, String note, Boolean accepted) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.note = note;
		this.accepted = accepted;
	}
	
	// Optional, Abfrage vereinfachen
	public String getAccepted() {
		if (accepted) {
			return "Ja";
		} else {
			return "Nein";
		}
	}
	
}
//Code written by Daniel Ramp - c 2020
