package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

import com.hemebiotech.interfaces.ISymptomCountNumber;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 *
 *          Class CountSymptom is implement of interface ISymptomCountNumber.
 *          This class count number of symptom which present in the file.
 */

public class CountSymptom implements ISymptomCountNumber {

	private HashMap<String, Integer> symptomHm;

	/**
	 * This function create object for each symptom, and class them in hashMap list.
	 * 
	 * @param symptomHm is a list of symptoms with name key and occurrence value.
	 * 
	 * @return symptomHm This is hashMap list of all symptoms.
	 */

	@Override
	public HashMap<String, Integer> symptomCount(List<String> readFile) {

		symptomHm = new HashMap<String, Integer>();

		for (int i = 0; i < readFile.size(); i++) {

			if (!symptomHm.containsKey(readFile.get(i))) {

				symptomHm.put(readFile.get(i), 1);

			} else if (symptomHm.containsKey(readFile.get(i))) {

				symptomHm.replace(readFile.get(i), symptomHm.get(readFile.get(i)) + 1);
			}
		}
		return symptomHm;
	}

}