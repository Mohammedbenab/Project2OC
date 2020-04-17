package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String args[]) {

		// Collect all symptoms in a ArrayLit
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile();
		List<String> fileReader = file.getSymptoms();

		// Count occurrence of symptoms
		CountSymptom countSymptom = new CountSymptom();
		HashMap<String, Integer> count = countSymptom.symptomCount(fileReader);

		// Sort all Symptoms
		SortAllSymptoms list = new SortAllSymptoms();
		List<String> output = new ArrayList<String>();
		output = list.symptomsSorted(count);
		
		// Writing symptoms in the file, and display them
		WritingDisplayOutput finalOutput = new WritingDisplayOutput();
		finalOutput.writingSymptomsSorted(output);

	}
}
