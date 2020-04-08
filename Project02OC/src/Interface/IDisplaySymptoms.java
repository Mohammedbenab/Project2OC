package Interface;

import java.util.HashMap;

/**
 * 
 * @author Benabdallah 
 * @version 1.0
 * 
 * IDisplaySymptoms is interface which display all Symptoms in the alphabetical order and the number of repeat.
 *
 */

public interface IDisplaySymptoms {
	
	void displayAllSymptom(HashMap<String, Integer> input);

}
