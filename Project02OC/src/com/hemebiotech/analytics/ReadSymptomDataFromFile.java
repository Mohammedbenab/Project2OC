package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.interfaces.ISymptomReader;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 *
 * This class allows to read the file and collect all symptoms in the ArrayList.
 */

public class ReadSymptomDataFromFile implements ISymptomReader {
	

	private String filePath;
	private ArrayList<String> result;
	
	/**
	 * GetSymtoms is a function witch allows to collect all symptoms.
	 * 
	 * @param result
	 * 				this is all symptoms collected in arrayList
	 * @param filpath
	 * 				this is path of symptoms file
	 * @return ArrayList which contains all symptom collected to file.
	 * 			
	 */
	
	@Override
	public List<String> getSymptoms() throws IOException{
		
		result = new ArrayList<String>();
		filePath = "symptoms.txt";
		
		BufferedReader reader = null;
		
		if (filePath != null) {
			
				try {
					reader = new BufferedReader (new FileReader(filePath));
					String line;
		
					while ((line = reader.readLine())  != null) {
						result.add(line);
					}
				} catch (IOException e) {
						e.printStackTrace();
				}finally {
						try {
							reader.close();
						}catch	(IOException e){
								e.printStackTrace();
						}
				}
		}
		return result;
	}

}
