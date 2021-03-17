package graph;

import java.util.LinkedList;
import java.util.List;

import util.Message;

/**
 * The vertex class; a Vertex object has a vertex and a list of edges started from it;
 * @author wangs and you
 * @param <V> 
 */
public class Vertex<V> {
	
	/**vertex */
    private V v;
    /** edges started from this vertex*/
    private List<Edge<V>> edgeList;
    
    /**
     * constructor
     * @param v
     */
    public Vertex(V v) {
        this.v = v;
        this.edgeList = new LinkedList<Edge<V>>();
    }
    
    public V getV() {
		return v;
	}

	public List<Edge<V>> getEdgeList() {
		return edgeList;
	}

	/**
     * add an edge to the edge list of this vertex.
     * if add successfully return true;
     * if edge exists: print `M3` and return false;
     * if `e`'s src is not this vertex: print `M5` and return false;
     * @param e
     */
    public boolean addEdge(Edge<V> e) {
       /**
        * TODO: add an edge to the edge list;
        */
    	
    	if(!(e.getSource().equals(this.v)) ) {
    		System.out.println(Message.M5);
    		
    		return false;
    	}
    	else {
    		 for(Edge<V> edge: edgeList) {
                 if(edge.equals(e)) {
                     System.out.println(Message.M3);
                     return false;
                 }
             }
    		this.edgeList.add(e);
    		return true;
    		
    	}
    }
    
    /**
     * get an edge between this vertex and the destination V "dest";
     * if 'dest' does not exist: print `M5` and return null; 
     * if edge does not exist: print `M6` and return null; 
     * @param dest
     * @return 
     */
    public Edge<V> getEdge(V dest) {
    	/**
         * TODO: get the edge between this vertex and the destination V "dest";
         */
    	
    	int flag=0;
    	int flagtwo=0;
    
    	
    	for(Edge<V> e: edgeList) {
    		
    		if(dest.equals(e.getDest())) {
    			flag =1;
    		}
    		if(e.getSource().equals(this.v)&& dest.equals(e.getDest()) ) {
    			flagtwo=1;
    		}
    		if(dest.equals(e.getDest()) && e.getSource().equals(this.v)) {
    			return e;
    			
    		}
    	}
    	if(flag==0) {
    		System.out.println(Message.M5);
    		return null;
    	}
    	if (flagtwo==0) {
    		System.out.println(Message.M6);
    		return null;
    	}   	
    	
     	return null;
    }
    
    /**
     * remove an edge from the edge list of this vertex
     * if 'dest' is not null: return the removed edge;
     * if 'dest' is null: print `M5` and return null; 
     * if edge does not exist: print `M6` and return null; 
     * @param dest
     * @return removed Edge<V>
     */
    public Edge<V> removeEdge(V dest) {
	
    	/**
         * TODO: removed an edge
         */
    	
    if(dest.equals(null)) {
    	System.out.println(Message.M5);
    	return null;
    }
    for(Edge<V> e:this.edgeList) {
    	if (e.getDest().equals(dest)) {
			this.edgeList.remove(e);
			return e;
		}
    }
    
    System.out.println(Message.M6);	 		
    	
	return null; 
    }

    public boolean equals(Vertex<V> o) { 
		/**
		 * TODO: implement the comparison between two vertices
		 * IFF `v` and `edgeList` are the same return true
		 */
//    	if(o==null) {
//    		return false;
//    	}
    	if(this.v.equals(o.v) && o.edgeList.equals(this.edgeList)) {
    		return true;
    	}
	
		return false;
	}
    
    @Override
    public String toString() {
        String ret = String.format("v : %s , edges: %s", v, edgeList.toString());
        return ret;
    }    
}