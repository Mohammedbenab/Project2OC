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

	private HashMap<String, Integer> sympmtomHm;

	/**
	 * This function create object for each symptom, and class them in hashMap list.
	 * 
	 * @param symptomHp is a list of symptoms with name key and occurrence value.
	 * 
	 * @return sympmtomHm This is hashMap list of all symptoms.
	 */

	@Override
	public HashMap<String, Integer> symptomCount(List<String> readFile) {

		sympmtomHm = new HashMap<String, Integer>();

		for (int i = 0; i < readFile.size(); i++) {

			if (!sympmtomHm.containsKey(readFile.get(i))) {

				sympmtomHm.put(readFile.get(i), 1);

			} else if (sympmtomHm.containsKey(readFile.get(i))) {

				sympmtomHm.replace(readFile.get(i), sympmtomHm.get(readFile.get(i)) + 1);
			}
		}
		return sympmtomHm;
	}

}