package application;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class Outputter {
	
	//private Boolean type; // Output types: Console 0, GUI 1 (not implemented jet) replaced by ENUM Type 
	enum Type {
		CONSOLE,
		GUI
	}
	private Boolean debuggingEnabled = true;
	
	Date date;
	SimpleDateFormat dateFormat;
	
	public Outputter(String text) {
		this(text, Outputter.Type.CONSOLE);
	}
	
	public Outputter(String text, Type type) {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		if (debuggingEnabled) {
			switch (type) {
			case CONSOLE:
					System.out.println(dateFormat.format(date)+" [INFO]: "+text);
				break;
			case GUI:
				System.out.println("Not implemented yet! Outputting as Console...");
				new Outputter(text, Type.CONSOLE);
				break;
			default:
				System.out.println("OutputType not known! Outputting as Console...");
				new Outputter(text, Type.CONSOLE);
				break;
			}
		}
	}
	
}
