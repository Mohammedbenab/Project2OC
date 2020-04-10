package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Interface.ISymptomCountNumber;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 *
 *          Class CountSymptom is implement of interface ISymptomCountNumber.
 *          This class count number of symptom which present in the file
 */

public class CountSymptom implements ISymptomCountNumber {

	/**
	 * @see Symptom, this class allows to instanciate a new symptom object.
	 */

	private ArrayList<Symptom> resultF;

	/**
	 * This function create object for each symptom, and class them in hashMap list.
	 * 
	 * @param nbrSymptom This number will increase each time the symptoms is
	 *                   repeated in the file.
	 * @param symtomN    Allows to instantiate a new symptom object when we have a
	 *                   new symptom in the list.
	 * @return resulF This is hashMap list of all symptoms.
	 */

	@Override
	public ArrayList<Symptom> symptomCount(List<String> readFile) {

		resultF = new ArrayList<Symptom>();

		int i = 0;

		while (i < readFile.size()) {

			if (!resultF.contains(readFile.get(i))) {

				resultF.add(new Symptom(readFile.get(i), 1));

			} else if (resultF.contains(readFile.get(i))) {

				
			}
			i++;
		}

		return resultF;
	}
}