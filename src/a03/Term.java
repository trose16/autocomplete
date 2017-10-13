package a03;

import java.util.Comparator;

/**
 * TODO Add class description
 * @author Teako Warfield-Graham and Gabriel
 *
 */
public class Term {
	
	/**
	 * Initialize a term with the given query string and weight.
	 * @param query
	 * @param weight
	 */
    public Term(String query, double weight){
    	
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

}
