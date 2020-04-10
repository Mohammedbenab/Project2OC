package Interface;

import java.io.IOException;
import java.util.HashMap;

/**
 * 
 * @author Benabdallah 
 * @version 1.0
 * 
 * IDisplaySymptoms is interface which display all Symptoms in the alphabetical order and the number of repeat.
 *
 */

public interface ISortSymptoms {
	
	HashMap<String, Integer> symptomsSorted(HashMap<String, Integer> input) throws IOException;

}
