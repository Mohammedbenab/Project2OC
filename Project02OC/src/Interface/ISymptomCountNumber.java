package Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.hemebiotech.analytics.Symptom;

/**
 * @author Benabdallah Mohammed
 * @version 1.0
 * 
 * ISymptomCountNuber is interface for count the number of symptom which represent 
 * in the file
 */
public interface ISymptomCountNumber {
	
	ArrayList<Symptom> symptomCount (List<String> readFile);

}
