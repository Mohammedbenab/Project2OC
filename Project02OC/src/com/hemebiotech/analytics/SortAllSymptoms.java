package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.interfaces.ISortSymptoms;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 * 
 *          Class for sort all symptoms in the hashmap list by key.
 *
 */

public class SortAllSymptoms implements ISortSymptoms {

	private TreeMap<String, Integer> sortedList;
	private List<String> output;

	/**
	 * This function sort all symptoms and return an ArrayList.
	 * 
	 * @param sortedList List of symptoms sorted by key.
	 * @param output     TreeMap sorted list
	 * @return list of all sort symptoms and occurrence.
	 */

	@Override
	public List<String> symptomsSorted(HashMap<String, Integer> input) {

		sortedList = new TreeMap<>();
		output = new ArrayList<String>();

		sortedList.putAll(input);

		for (Map.Entry<String, Integer> entry : sortedList.entrySet()) {
			String k = entry.getKey();
			Integer v = entry.getValue();
			output.add("Symptom " + k + " = " + v);
		}
		return output;
	}
}
