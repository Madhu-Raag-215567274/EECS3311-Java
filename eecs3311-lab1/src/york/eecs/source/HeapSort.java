package york.eecs.source;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author song and you
 * @description: @HeapSort uses max heap algorithm to rank a map based on the values.
 */
public class HeapSort implements MapSort<String, Double>{
	/**
     * @map to be sorted;
     */	
	public Map<String, Double> map;
	
    
	/**
	 * TODO: There are missing methods, you can find clues of these methods from test cases.
     */
	
	
	/**
	 * @description: Sort a map by the values in ascending order max heap sorting algorithm.
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue() {
		/**
		 *  TODO: Implement sorting the maps by values with max heap sorting algorithm.
		 *  	  This method returns the corresponding key list.
		 *  	  You need to use the auxiliary method, i.e., @heapify.
		 */
		
		ArrayList<Map.Entry<String, Double>> listOfEnrtries = new ArrayList<>(this.map.entrySet());
		
		
	
	

		int n = listOfEnrtries.size();	
		
		
		for (int i = n / 2 ; i >= 0; i--) {
			heapify(listOfEnrtries, n, i);// max heap
		}

		for (int i = n - 1; i >= 0; i--) { 
			
			Map.Entry<String, Double> temp = listOfEnrtries.get(0);
			
			listOfEnrtries.set(0, listOfEnrtries.get(i));
			listOfEnrtries.set(i, temp);	
			
			heapify(listOfEnrtries, i, 0);// heapify the root
		}
		
		ArrayList<String> k = new ArrayList<>();
		for ( Entry<String, Double> i :listOfEnrtries) {
			k.add(i.getKey());
		}

		return k;
	}
	
	/**
	 * To heapify a subtree rooted with node `i' which is an index in both @keys and @values. 
	 * `n' is size of heap.
	 */
	public void heapify(ArrayList<Map.Entry<String, Double>> listofentries, int n, int i) {
		/**
		 *  TODO: Implement @heapify to build heap. 
		 */ 
		int hi = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if ((l < n )&& (listofentries.get(l).getValue() > listofentries.get(hi).getValue())) {
			hi = l;
		}
		if ((r < n) && (listofentries.get(r).getValue() > listofentries.get(hi).getValue())) {
			hi = r;			
		}


		if (hi != i) {		
			
			Map.Entry<String, Double> sp = listofentries.get(i);
			listofentries.set(i, listofentries.get(hi));			
			listofentries.set(hi, sp);
			
			heapify(listofentries, n, hi);
			
		}
		
		
	}

	public void setMap(Map<String, Double> map_to_be_sorted) {
		// TODO Auto-generated method stub
		for (Double k : map_to_be_sorted.values()) {
			if (k == null) {
				throw new MapContainsNullValueException("MapContainsNullValueException");
			}
		}
		this.map = map_to_be_sorted;
		
	}

	public Map<String, Double> getMap() {
		// TODO Auto-generated method stub
		return map;
		
	}
}