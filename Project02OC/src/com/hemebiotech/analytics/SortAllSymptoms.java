package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import Interface.ISortedFile;

public class SortAllSymptoms implements ISortedFile{
	
	private ArrayList sortLit;

	@Override
	public ArrayList getSortSymtom(HashMap<String, Integer> hList) {
		
		sortLit = new ArrayList();
		
		if (hList != null) {
			
			for(int i = 0; i < hList.size(); i++) {
				
				sortLit.add(hList.get(i));
				
			}
			
			Collections.sort(sortLit);
			for(int i=0; i < hList.size(); i++) {
				sort
			}
		}
		return null;
	}
	
	

}
