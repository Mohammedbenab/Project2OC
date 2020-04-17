package Interface;

import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Benabdallah
 * @version 1.0
 * 
 *          ISortSymptom is interface which sort all Symptoms in the
 *          alphabetical order.
 *
 */

public interface ISortSymptoms {

	List<String> symptomsSorted(HashMap<String, Integer> input);

}
