package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import Interface.ISortSymptoms;

/**
 * 
 * @author Benabdallah Mohammed
 * 
 * 
 *
 */


public class WritingDisplayOutput implements ISortSymptoms{

	
	private String outputFile;
	private String outSymptoms;
	private TreeMap<String, Integer> sortedFile;
	
	/**
	 * @param output
	 */

	@Override
	public HashMap<String, Integer> symptomsSorted(HashMap<String, Integer> input) throws IOException {
		
		outputFile = "results.out";
		
		BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(outputFile));
		sortedFile = new TreeMap<>();
		sortedFile.putAll(input);
		
		if (input != null) {
			
			try {

				 for (Map.Entry<String, Integer> mapElement : sortedFile.entrySet()) { 
					 				 
			            outSymptoms = "Symptom " + mapElement.getKey() + " = " + mapElement.getValue(); 
			            System.out.println(outSymptoms);
			            bufferWriter.write(outSymptoms);
			            bufferWriter.newLine();
			        } 
					
				
			}finally {
					try {
						bufferWriter.close();
					}catch	(IOException e){
							e.printStackTrace();
					}
			}
		}
		return null;
	}
		
}
