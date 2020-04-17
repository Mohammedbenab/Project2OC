package com.hemebiotech.interfaces;

import java.util.HashMap;
import java.util.List;

/**
 * @author Benabdallah Mohammed
 * @version 1.0
 * 
 *          ISymptomCountNuber is interface for count the number of symptom
 *          which represent in the file
 */
public interface ISymptomCountNumber {

	HashMap<String, Integer> symptomCount(List<String> readFile);

}
