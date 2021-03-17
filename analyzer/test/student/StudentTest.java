package student;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import graph.DGraph;
import graph.Edge;
import graph.ListDGraph;

public class StudentTest {
 /**
  * TODO: 
  * 	write at least 20 Junit test cases to test your implementation of ListDGraph;
  */
	
DGraph<String> graph = new ListDGraph<String>();
    
    @Before
	public void setUp() throws Exception {
	 	graph.addV("1");
        graph.addV("2");
        graph.addV("3");
        graph.addV("4");  
                
        graph.addE(new Edge<String>("1", "2"));
        graph.addE(new Edge<String>("1", "3"));
        graph.addE(new Edge<String>("2", "3"));
        graph.addE(new Edge<String>("2", "4"));
        
	}

    
    @Test
    public void test_matrix() {
		/**
		 * genearte the matrix
		 */
		int [][] matrix = graph.matrix();
		
		/**
		 * expected matrix `m`
		 */
		int m [][] = new int[4][4];
        m[0][0] =0; m[0][1] =1; m[0][2] =1; m[0][3] =1;
        m[1][0] =1; m[1][1] =0; m[1][2] =1; m[1][3] =0;
        m[2][0] =1; m[2][1] =1; m[2][2] =0; m[2][3] =0;
        m[3][0] =1; m[3][1] =0; m[3][2] =0; m[3][3] =0;
    	 
    	System.out.println(m.toString());
    	
        Assert.assertEquals(matrix.length, m.length);
     }
    
    @Test
    public void test_secondmatrix() {
        /**
         * genearte the matrix
         */
        int [][] matrix = graph.matrix();
        
        /**
         * expected matrix `m`
         */
         int m [][] = new int[4][4];
         m[0][0] =0; m[0][1] =1; m[0][2] =1; m[0][3] =0;
         m[1][0] =0; m[1][1] =0; m[1][2] =1; m[1][3] =1;
         m[2][0] =0; m[2][1] =0; m[2][2] =0; m[2][3] =0;
         m[3][0] =0; m[3][1] =0; m[3][2] =0; m[3][3] =0;
         
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(m));
        
        Assert.assertArrayEquals(matrix, m);
     }
	
    
    
	@Test
    public void test_addV() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("1");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("13");
		Assert.assertEquals(5, index);
     }
	
	@Test
    public void test_addVtwo() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("2");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("11");
		Assert.assertEquals(5, index);
     }
	@Test
    public void test_addVthree() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("3");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("12");
		Assert.assertEquals(5, index);
     }
	@Test
	public void test_addVfour() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("4");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("12");
		Assert.assertEquals(5, index);
     }
    @Test
	public void test_addVfive() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("4");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("11");
		Assert.assertEquals(5, index);
     }
    
    @Test
	public void test_addVsix() { 
		/**
		 * add an exist V
		 */
		int index = graph.addV("4");
		Assert.assertEquals(-1, index);
		
		/**
		 * add a new V
		 */
		index = graph.addV("13");
		Assert.assertEquals(5, index);
     }
    
    @Test
   	public void test_addVseven() { 
   		/**
   		 * add an exist V
   		 */
   		int index = graph.addV("2");
   		Assert.assertEquals(-1, index);
   		
   		/**
   		 * add a new V
   		 */
   		index = graph.addV("15");
   		Assert.assertEquals(5, index);
        }
    
    @Test
   	public void test_addVnine() { 
   		/**
   		 * add an exist V
   		 */
   		int index = graph.addV("2");
   		Assert.assertEquals(-1, index);
   		
   		/**
   		 * add a new V
   		 */
   		index = graph.addV("14");
   		Assert.assertEquals(5, index);
        }
	@Test
    public void test_addE() { 

		Edge<String> e = new Edge<String>("1", "2");
		/**
		 * add an exist edge
		 */
		boolean success = graph.addE(e);
		Assert.assertEquals(false, success);
		
		/**
		 * add a new edge
		 */
		Edge<String> e1 = new Edge<String>("1", "4");
		success = graph.addE(e1);
		Assert.assertEquals(true, success);
     }
	
	@Test
    public void test_addE2() { 

		Edge<String> e = new Edge<String>("1", "2");
		Edge<String> e_2 = new Edge<String>("1", "3");
		/**
		 * add an exist edge
		 */
		boolean success = graph.addE(e);
		boolean success2 = graph.addE(e_2);
		Assert.assertEquals(false, success);
		
		/**
		 * add a new edge
		 */
		Edge<String> e1 = new Edge<String>("1", "4");
		Edge<String> e2 = new Edge<String>("1", "4");
		success = graph.addE(e1);
		success2 = graph.addE(e2);
		
		Assert.assertEquals(true, success);
		
     }
	
	
	
	@Test
    public void test_removeE() { 
		Edge<String> e1 = new Edge<String>("1", "4");
		graph.addE(e1);
	
		Edge<String> e2 = graph.removeE(new Edge<String>("1", "4"));
		
        Assert.assertEquals(true, e1.equals(e2));
     }
	
	@Test
    public void test_removeEtwo() { 
		Edge<String> e1 = new Edge<String>("1", "3");
		graph.addE(e1);
	
		Edge<String> e2 = graph.removeE(new Edge<String>("1", "3"));
		
        Assert.assertEquals(true, e1.equals(e2));
     }
	
	@Test
    public void test_removeEthree() { 
		Edge<String> e1 = new Edge<String>("1", "2");
		graph.addE(e1);
	
		Edge<String> e2 = graph.removeE(new Edge<String>("1", "2"));
		
        Assert.assertEquals(true, e1.equals(e2));
     }
	

	@Test
    public void test_removeEfour() { 
		Edge<String> e1 = new Edge<String>("1", "1");
		graph.addE(e1);
	
		Edge<String> e2 = graph.removeE(new Edge<String>("1", "1"));
		
        Assert.assertEquals(true, e1.equals(e2));
    
     }
	@Test
	public void test_removeEfive() { 
		Edge<String> e1 = new Edge<String>("2", "3");
		graph.addE(e1);
	
		Edge<String> e2 = graph.removeE(new Edge<String>("2", "3"));
		
        Assert.assertEquals(true, e1.equals(e2));
     
     }

	
	
	
	@Test
    public void test_removeV() { 
    	String v = graph.removeV("4");
        Assert.assertEquals("4", v);
     }
	@Test
    public void test_removeVtwo() { 
    	String v = graph.removeV("1");
        Assert.assertEquals("1", v);
     }
	@Test
    public void test_removeVthree() { 
    	String v = graph.removeV("2");
        Assert.assertEquals("2", v);
     }
	@Test
    public void test_removeVfour() { 
    	String v = graph.removeV("3");
        Assert.assertEquals("3", v);
     }
	
	
}
