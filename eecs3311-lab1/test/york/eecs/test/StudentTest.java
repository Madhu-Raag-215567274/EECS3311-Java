package york.eecs.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import york.eecs.source.BubbleSort;
import york.eecs.source.HeapSort;
import york.eecs.source.MapContainsNullValueException;

public class StudentTest {
 /**
  * TODO: Please write at least 5 test cases for testing @BubbleSort.
  * TODO: Please write at least 5 test cases for testing @HeapSort.
  */
	HeapSort heapsort;	
	BubbleSort bubblesort;

	
	
	 @Before 
	    public void setUp() throws Exception {
		 bubblesort= new BubbleSort();
		 heapsort = new HeapSort(); 
	 }
	 @Test
	 //Bubble Test-1 
	    public void test_bubble_test1() throws MapContainsNullValueException {
		 
		 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();

			map_to_be_sorted.put("Tom", 91);
			map_to_be_sorted.put("Buck", 25);
			map_to_be_sorted.put("Jerry", 69); 
		
	     
	     
	      bubblesort.setMap(map_to_be_sorted);

	   
	     ArrayList<String> expected_result = new ArrayList<String>();
	     expected_result.add("Buck");
	     expected_result.add("Jerry");
	     expected_result.add("Tom");
	    
		 
	     
		 Assert.assertEquals(map_to_be_sorted.size(), bubblesort.getMap().size());   
		 		    
	     Assert.assertEquals(expected_result.size(), bubblesort.sortbyValue().size());
	     
	     for(int i =0; i<expected_result.size(); i++) {
	    	 Assert.assertEquals(expected_result.get(i), bubblesort.sortbyValue().get(i));
	     }
	 } 
	 
	 //Bubble Test-2 
	 @Test
	    public void test_bubble_test2() throws MapContainsNullValueException {
		 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
		 	map_to_be_sorted.put("Tom", -91);
			map_to_be_sorted.put("Buck", 25);
			map_to_be_sorted.put("Jerry", 3); 
	     
	     
	      bubblesort.setMap(map_to_be_sorted);
	        
	     ArrayList<String> expected_result = new ArrayList<String>();
	     expected_result.add("Tom");
	     expected_result.add("Jerry");
	     expected_result.add("Buck");
	    
	    
	  
		 
	     
		 Assert.assertEquals(map_to_be_sorted.size(), bubblesort.getMap().size());   
		 		    
	     Assert.assertEquals(expected_result.size(), bubblesort.sortbyValue().size());
	    
	     for(int i =0; i<expected_result.size(); i++) {
	    	 Assert.assertEquals(expected_result.get(i), bubblesort.sortbyValue().get(i));
	     }
	 } 
	 
	// Bubble test- 3 
		 @Test
		    public void test_bubble_test3() throws MapContainsNullValueException {
			 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
			 	map_to_be_sorted.put("Tom", 94);
				map_to_be_sorted.put("Buck", 77);
				map_to_be_sorted.put("Jerry", 34); 
				map_to_be_sorted.put("Sid", 44);
		   
		     
		      
		      bubblesort.setMap(map_to_be_sorted);
		        
		     
		     ArrayList<String> expected_result = new ArrayList<String>();
		     
		     expected_result.add("Jerry");
		     expected_result.add("Sid");
		     expected_result.add("Buck");
		     expected_result.add("Tom");
			 
		    
			 Assert.assertEquals(map_to_be_sorted.size(), bubblesort.getMap().size());   
					    
		     Assert.assertEquals(expected_result.size(), bubblesort.sortbyValue().size());
		   
		   
		 } 
		 
		 //Bubble Test-4 
		 @Test
		    public void test_bubble_test4() throws MapContainsNullValueException {
			 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
			 
			 	map_to_be_sorted.put("Kon", 17);
				map_to_be_sorted.put("Jim", 39);
				map_to_be_sorted.put("Cr7", 43); 
				map_to_be_sorted.put("Messi", 51);
		     
		  
		      bubblesort.setMap(map_to_be_sorted);
		        
		   
		     ArrayList<String> expected_result = new ArrayList<String>();
		     expected_result.add("Kon");
		     expected_result.add("Jim");
		     expected_result.add("Cr7");
		     expected_result.add("Messi");
		
			 Assert.assertEquals(map_to_be_sorted.size(), bubblesort.getMap().size());   		    
		     Assert.assertEquals(expected_result.size(), bubblesort.sortbyValue().size());
		    
		     for(int i =0; i<expected_result.size(); i++) {
		    	 Assert.assertEquals(expected_result.get(i), bubblesort.sortbyValue().get(i));
		     }
		 } 
		 	//Bubble Test-4 
		    @Test(expected = MapContainsNullValueException.class)
		    public void test_bubble_exception_test5(){
			 Map<String, Integer> map_to_be_sorted = new HashMap<String, Integer>();
				map_to_be_sorted.put("asd", 99);
				map_to_be_sorted.put("assd", 30);				
				map_to_be_sorted.put("adfs", null); 
		    
		       bubblesort.setMap(map_to_be_sorted);
		 } 	
		    
	 
		 // Heap Test-1 
		 @Test
		    public void test_heap_test1() {
			Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
			map_to_be_sorted.put("A", 99.6);
			map_to_be_sorted.put("E", -50.4);
			map_to_be_sorted.put("C", 167.5);
			map_to_be_sorted.put("D", 87.4); 
			map_to_be_sorted.put("B", -17.5);
			
		    heapsort.setMap(map_to_be_sorted);    
		    
		    
			ArrayList<String> results = new ArrayList<String>();
			results.add("E");
			results.add("B");
			results.add("D");
			results.add("A");
			results.add("C");			

			Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());			
		    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());
			for(int i =0; i<results.size(); i++) {
				 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
			}
	     }
		 
		 // Heap Test-2
		 @Test
		    public void test_heap_test2() {
			Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
			map_to_be_sorted.put("A", 39.7);
			map_to_be_sorted.put("E", 52.8);
			map_to_be_sorted.put("C", 89.9);
			map_to_be_sorted.put("D", -100.12); 
			map_to_be_sorted.put("B", 100.15);
		    
		   
		    heapsort.setMap(map_to_be_sorted);    
		    
		    
			ArrayList<String> results = new ArrayList<String>();
			
			results.add("D");
			results.add("A");
			results.add("E");
			results.add("C");		
			results.add("B");			
			
			Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());			
		    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());
		   
			for(int i =0; i<results.size(); i++) {
				 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
			}
	     }
		 
		 // Heap Test-3
		 @Test
		    public void test_heap_test3() {
			Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
			map_to_be_sorted.put("A", 99.8);
			map_to_be_sorted.put("C", 83.7);
			map_to_be_sorted.put("D", -217.6); 
			map_to_be_sorted.put("B", 77.7);
		   
		    heapsort.setMap(map_to_be_sorted); 
		    
			ArrayList<String> results = new ArrayList<String>();
			results.add("D");
			results.add("B");
			results.add("C");
			results.add("A");
		
			
			Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());
			
		    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());
		  
			for(int i =0; i<results.size(); i++) {
				 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
			}
	     }
		 
		 // Heap Test-4
		 @Test
		    public void test_heap_test4() {
			Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
			map_to_be_sorted.put("A", 9.9);
			map_to_be_sorted.put("E", 501.7);
			map_to_be_sorted.put("C", 333.8);
			
		    
		    heapsort.setMap(map_to_be_sorted);    
		    
			ArrayList<String> results = new ArrayList<String>();
		
			results.add("A");
			results.add("C");
			results.add("E");
			
			Assert.assertEquals(map_to_be_sorted.size(), heapsort.getMap().size());
			
		    Assert.assertEquals(results.size(), heapsort.sortbyValue().size());

		    for(int i =0; i<results.size(); i++) {
				 Assert.assertEquals(results.get(i), heapsort.sortbyValue().get(i));
			}
	     }		 
		
		 
		 // Heap Test-5
		 @Test(expected = MapContainsNullValueException.class)
		    public void test_heap_exception_test5(){
			 Map<String, Double> map_to_be_sorted = new HashMap<String, Double>();
				map_to_be_sorted.put("Z", 99.0);
				map_to_be_sorted.put("W", 30.1);
				map_to_be_sorted.put("Y", null); 
				map_to_be_sorted.put("X", 107.3);
		     
		      
				heapsort.setMap(map_to_be_sorted);	    
		    }
		 
	
}
