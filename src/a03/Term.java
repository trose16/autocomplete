package a03;

import java.util.Comparator;



/**
 * TODO Add class description
 * @author Teako Warfield-Graham and Gabriel
 *
 */
public class Term {
	private String query;
	private double weight;
	
	/**
	 * Initialize a term with the given query string and weight.
	 * @param query
	 * @param weight
	 */
    public Term(String query, double weight){
    	if(query == null) { throw new java.lang.NullPointerException(); }
    	if(weight < 0) { throw new java.lang.IllegalArgumentException(); }
    	this.query = query;
    	this.weight = weight;
    	
    }

    /**
     * Compare the terms in descending order by weight.
     * @return
     */
    public static Comparator<Term> byReverseWeightOrder(){
		return null;
	}

    /**
     * Compare the terms in lexicographic order but using only the first r characters of each query.
     * @param r TODO (what is the r?)
     * @return TODO (what does this return?)
     */
    public static Comparator<Term> byPrefixOrder(int r){
		return null; 	
    }
    
    /**
     * Compare the terms in lexicographic order by query.
     * @param that
     * @return
     */
    public int compareTo(Term that){
		return 0; // TODO
	}
    
    /**
     * Return a string representation of the term in the following format:
     * the weight, followed by a tab, followed by the query.
     */     
    public String toString(){
		return null; // TODO
	}
    
    private static class compareByReverseWeightOrder implements Comparator<Term> {

		@Override
		public int compare(Term o1, Term o2) {
			// TODO Auto-generated method stub
			return 0;
		}
    	
    }
    
    private static class compareByPrefixOrder implements Comparator<Term> {

		@Override
		public int compare(Term o1, Term o2) {
			// TODO Auto-generated method stub
			return 0;
		}
    	
    }

}
