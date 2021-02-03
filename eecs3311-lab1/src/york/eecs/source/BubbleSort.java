package york.eecs.source;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author song and you
 * @description: @BubbleSort uses bubble sorting algorithm to rank a map based on the values.
 */
public class BubbleSort implements MapSort<String, Integer>{
    /**
     * @map to be sorted;
     */
	public Map<String, Integer> map;
    
	/**
	 * TODO: There are missing methods, you can find clues from test cases.
     */
	

	/**
	 * @description: Sort a map by the values in ascending order with bubble sorting algorithm. 
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue(){
	/**
	 *  TODO: Implement sorting the maps by values with bubble sorting algorithm.
	 *  	  This method returns the corresponding key list.
	 */
		ArrayList<Entry<String, Integer>> listOfEnrtries = new ArrayList<>(this.map.entrySet());
		
		int p=0;
		while (p<map.size()) {
			
			int i=0;
			
			while ( i < listOfEnrtries.size() - 1) {
				
				if (listOfEnrtries.get(i).getValue() > listOfEnrtries.get(i + 1).getValue()) {	
					
					Map.Entry<String, Integer> tmp = listOfEnrtries.get(i);	
					
					listOfEnrtries.set(i, listOfEnrtries.get(i + 1));// place entries in ascending order
					listOfEnrtries.set(i + 1, tmp); 					
									
				}				
				i++;
			}
			p++;
			
		}		
		
		ArrayList<String> k = new ArrayList<>();
		
		for ( Entry<String, Integer> i :listOfEnrtries) {
			k.add(i.getKey());
		}

		return k;
	}

	public void setMap(Map<String, Integer> map_to_be_sorted) {
		// TODO Auto-generated method stub

		for (Integer k : map_to_be_sorted.values()) {
			if (k == null) {
				throw new MapContainsNullValueException("MapContainsNullValueException");
			}
		}
		this.map = map_to_be_sorted;
		
	}

	public Map<String, Integer> getMap() {
		// TODO Auto-generated method stub
		return map;
	
	}
}