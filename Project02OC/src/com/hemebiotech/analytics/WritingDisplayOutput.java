package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.interfaces.ISortSymptoms;
import com.hemebiotech.interfaces.IWritingSymptomsSorted;

/**
 * 
 * @author Benabdallah Mohammed
 * 
 *         This function allows to sort all symptoms in alphabetical order and
 *         display in the file.out
 *
 */

public class WritingDisplayOutput implements IWritingSymptomsSorted {

	private String outputFile;
	private String outSymptoms;

	/**
	 * @param outputFile   This is path of the file output
	 * @param outSymptoms  Symptoms sorted and display in the output file
	 * @param bufferWriter
	 * @return Sorted list of symptoms
	 */

	@Override
	public List<String> writingSymptomsSorted(List<String> sortedList) throws IOException {

		outputFile = "results.out";

		BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(outputFile));

		if (sortedList != null) {

			try {

				for (int i = 0; i < sortedList.size(); i++) {

					outSymptoms = sortedList.get(i);
					System.out.println(outSymptoms);
					bufferWriter.write(outSymptoms);
					bufferWriter.newLine();
				}

			} finally {
				try {
					bufferWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sortedList;
	}

}
