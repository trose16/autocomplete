package a03;

import java.util.Arrays;
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
    	if (query == null) { throw new java.lang.NullPointerException(); }
    	if (weight < 0) { throw new java.lang.IllegalArgumentException(); }
    	
    	this.query = query;
    	this.weight = weight;
    	
    }

    /**
     * Compare the terms in descending order by weight.
     * @return
     */
    public static Comparator<Term> byReverseWeightOrder(){
		return new CompareByReverseWeightOrder();
	}

    /**
     * Compare the terms in lexicographic order but using only the first r characters of each query.
     * @param r TODO (what is the r?)
     * @return TODO (what does this return?)
     */
    public static Comparator<Term> byPrefixOrder(int r){
    	if (r < 0) { throw new java.lang.IllegalArgumentException(); }
		return new CompareByPrefixOrder(r); 	
    }
    
    /**
     * Compare the terms in lexicographic order by query.
     * @param that
     * @return
     */
    public int compareTo(Term that){
		return this.query.compareTo(that.query); // this doesn't work since query isn't a string number
	}
    
    /**
     * Return a string representation of the term in the following format:
     * the weight, followed by a tab, followed by the query.
     */     
    public String toString(){
		return String.format("%f %8s", this.weight, this.query); 
	}
    
    private static class CompareByReverseWeightOrder implements Comparator<Term> {

		@Override
		public int compare(Term a, Term b) {
			return  Double.compare(b.weight, a.weight);
		}
    	
    }
    
    private static class CompareByPrefixOrder implements Comparator<Term> {
    	private int r;
    	
    	private CompareByPrefixOrder(int r){
    		this.r = r;
    	}

		@Override
		public int compare(Term a, Term b) {
			if ( r == 0 ) { r = 1; } // if a zero is passed we will return index 0 of string (aka first character of string)
			System.out.println("term a " + a.query.substring(0, r) + " term b " + b.query.substring(0, r)); // just for testing will remove
			return a.query.substring(0, r).compareTo(b.query.substring(0, r));
		}
    	
    }
    
    
    public static void main(String[] args) {
    	Term[] terms = {new Term("test", 6), new Term("boy", 2), new Term("cat", 3)};
    	Term term1 = new Term("applation", 2);
    	Term term2 = new Term("apple", 3);
//    	System.out.println(term1.compareTo(term2));
//    	System.out.println(term1.byReverseWeightOrder().compare(term1, term2));
//    	System.out.print(Arrays.toString(terms));
//    	int r = 3;
//    	String string = "string";
//    	System.out.println(string.charAt(r));
//    	System.out.println(string.substring(0, r));
    	CompareByPrefixOrder prefix = new CompareByPrefixOrder(0);
    	System.out.println(prefix.compare(term1, term2));
    	
    	String empty = "";
    	System.out.println("empty string " + empty.length()); // will need to return all queries if query is empty
    	
    }
    

}
