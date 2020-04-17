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
	private int repeat;

	/**
	 * This function create object for each symptom, and class them in hashMap list.
	 * 
	 * @param symptomHp is a list of symptoms with name key and occurrence value.
	 * 
	 * @param repeat    This number will increase each time the symptoms is repeated
	 *                  in the file.
	 * @return resulF This is hashMap list of all symptoms.
	 */

	@Override
	public HashMap<String, Integer> symptomCount(List<String> readFile) {

		sympmtomHm = new HashMap<String, Integer>();

		for (int i = 0; i < readFile.size(); i++) {

			if (!sympmtomHm.containsKey(readFile.get(i))) {

				sympmtomHm.put(readFile.get(i), 1);

			} else if (sympmtomHm.containsKey(readFile.get(i))) {

				repeat = sympmtomHm.get(readFile.get(i));
				sympmtomHm.replace(readFile.get(i), repeat + 1);
			}
		}
		return sympmtomHm;
	}

}