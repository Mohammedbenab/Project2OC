package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public class Main {
	
	
	public static void main(String args[]) throws Exception {
		
		 //First, we collect all symptoms in a ArrayLit
		 ReadSymptomDataFromFile file = new ReadSymptomDataFromFile();
		 List<String> fileReader = file.getSymptoms();
		 
		 //Second, we count number of symptoms and we integrate name of symptoms and number of repeat 
		 //in the HashMap list.
		 CountSymptom countSymptom = new CountSymptom();
		 HashMap<String, Integer> count = countSymptom.symptomCount(fileReader);
		 
		 //Third, we sort Hashmap list by a TreeMap and display them in the output file	 
		 WritingDisplayOutput finalOutput = new WritingDisplayOutput();
		 finalOutput.symptomsSorted(count);
		 
		 
		 
	}
}
