package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

import Interface.ISymptomCountNumber;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 *
 * Class CountSymptom is implement of interface ISymptomCountNumber. 
 * This class count number of symptom which present in the file
 */

public class CountSymptom implements ISymptomCountNumber {
	
	/**
	 * @see Symptom, this class allows to instanciate a new symptom object.
	 */
	
	private HashMap<String, Integer> resultF;
	private int nbrOfSymptom;
	private Symptom symptomN;
	
	/**
	 * This function create object for each symptom, and class them in hashMap list.
	 * 
	 *@param nbrSymptom
	 *				This number will increase each time the symptoms is repeated in the file.
	 *@param symtomN
	 *				Allows to instantiate a new symptom object when we have a new symptom in the list.				
	  *@return resulF
	 *				This is hashMap list of all symptoms. 
	 */

	@Override
	public HashMap<String, Integer> symptomCount(List<String> readFile) {
		
		resultF = new HashMap<String, Integer>();
		nbrOfSymptom = 0;
		
		int i = 0;
		
		while (i < readFile.size()) {
			
				if (!resultF.containsKey(readFile.get(i))) {
					
					symptomN = new Symptom (readFile.get(i), nbrOfSymptom);
					symptomN.setNbrRepeat(nbrOfSymptom+1);
					resultF.put(symptomN.getName(), symptomN.getNbrRepeat());
					
				}else if(resultF.containsKey(readFile.get(i))){
					
					resultF.replace(readFile.get(i), resultF.get(readFile.get(i))+1);
				}
				i++;
			}
		
		return resultF;
		}
}