package com.hemebiotech.analytics;

/**
 * 
 * @author Benabdallah Mohammed
 * @version 1.0
 * 
 * This class allows to creates a new Symptom object
 *
 */

public class Symptom {
	

	private String name;
	private int nbrRepeat;
	
	/**
	 * This is constructor 
	 * @param name
	 * 				this is name of symptom
	 * @param nbrRepaet
	 * 				this is number of repeat in the file
	 */

	public Symptom(String name, int nbrRepaet) {
		this.name = name;
		this.nbrRepeat = nbrRepaet;
	}
	
	/**
	 * This function return name of symptom
	 * @return a name witch matches symptom
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * This function allows to change name of symptom
	 * @param name
	 * 				This is name of symptom
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This function return number of repeat of symptom
	 * @return number of repeat found in the source file
	 */

	public int getNbrRepeat() {
		return nbrRepeat;
	}
	
	/**
	 * this function allows to change or increment number of repeat in the source file
	 * @param nbrRepeat 
	 * 					This is number of each symptom repeat
	 * @return 
	 */

	public void setNbrRepeat(int nbrRepeat) {
		this.nbrRepeat = nbrRepeat;
	}
	
}
