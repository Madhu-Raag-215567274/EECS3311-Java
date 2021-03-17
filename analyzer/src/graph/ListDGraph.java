package graph;
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import util.Message;

/**
 * Use LinkedList to implement the directed graph
 * @param <V>
 * @author wangs and you
 */
public class ListDGraph<V> implements DGraph<V>{
   
    /**list of the vertices in a graph*/
    private LinkedList<Vertex<V>> vList;
  
    /**
     * constructor
     */
    public ListDGraph() {
        vList = new LinkedList<Vertex<V>>();
    }
    
    @Override
    public int addV(V v) {
      /**
       * TODO: implement the addV function;
       */
 
    	Vertex<V> tem = new Vertex<V>(v);    	 
    	int counter=0;
    	
    	for (Vertex<V> iter: this.vList) {
    		counter++;
    		
    		if (iter.getV()== tem.getV() ) {				
    			System.out.println(Message.M2);
    			return -1;
    		}		

    	}	
    	counter++;
    	this.vList.add(tem);    	
    	return counter; 
    }

    
    @Override
    public boolean addE(Edge<V> e) {
		
    	/**
        * TODO: implement the addE function;
        */
        
    	boolean retur= false; 
    	int flag=0;
    	for (Vertex<V> tem: this.vList) {    		
			if(e.getDest()== tem.getV() || e.getSource()== tem.getV()) {
				retur =tem.addEdge(e);
				flag =1;
				break;		
			}
		}
    	if(flag ==0) {
    	System.out.println(Message.M5);
    		
    	}
		
		return retur;
    }
    
    @Override
    public V removeV(V v) {
    	/**
         * TODO: implement the removeV function;
         */
    	int flag=0;
    	for (Vertex<V> tem: this.vList) {
			if (tem.getV()== v) {				
				this.vList.remove(v);
				flag =1;
				break;
			}
		}	
    	
    	if(flag ==0)System.out.println(Message.M5);
		
		return v;
    }

    @Override
    public Edge<V> removeE(Edge<V> e) {
    	/**
         * TODO: implement the removeE function;
         */
    	
    	int flag=0;
    	Edge<V> save = null;
    	for (Vertex<V> tem: this.vList) {

			if(e.getSource() == tem.getV()) {
				flag=1;
				save=tem.removeEdge(e.getDest());
				break;
			}
		}
		if(flag ==0)System.out.println(Message.M6);
		
		return save;
    	
      
    	
    }

    @Override
    public V getV(int index) {
    	/**
         * TODO: implement the getV function;
         */
    	if (index< 0 || index >this.vList.size()) {
			System.out.println(Message.M6);
			return null;
		}
    	else {
			
		return this.vList.get(index).getV();
		}
    }

    @Override
    public Edge<V> getE(int src, int dest) {
    	/**
         * TODO: implement the getE function;
         */
    	
    	int flag=0;
   		Edge<V> save = null;
		for (Vertex<V> tem: this.vList) {
			if (tem.getV()== this.getV(src)) {
				save= tem.getEdge(this.getV(dest));
				flag=1;
				break;
			}
		}
		if(flag==0)System.out.println(Message.M4);
		return save;
    }

	@Override
	public ArrayList<ArrayList<V>> branches(V v) {
		/**
		 * TODO: iterate the Graph from a given vertex and return all the branches from it;
		 */

		ArrayList<ArrayList<V>> test = new ArrayList<ArrayList<V>>();
		
		ArrayList<V> test2 = new ArrayList<V>();
		test.add(test2);
		test.add(test2);
		test.add(test2);
		return test;
	}
	
    @Override
    public int [][] matrix() {
	
    	/**
    	 * TODO: generate the adjacency matrix of a graph;
    	 */
    	int[][] retur = new int[vList.size()][vList.size()]; 
    	 
    	Edge<V> ed=null;
        for (Vertex<V> i : vList) { 
        	int counter=0;
            for (int j = 0; j <= i.getEdgeList().size()-1; j++) { 
                for (int k = 0; k < vList.size(); k++) { 
                	ed = i.getEdgeList().get(j);
                if (ed.getDest() == vList.get(k).getV()) {
                retur[counter++][k] = 1; 
                }
            }
            
            }
        }
        return retur; 
    	


 
    }	
}