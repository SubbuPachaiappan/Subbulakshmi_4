package set_02_05;

	import java.util.Collections;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.TreeSet;
	import java.util.Set;

	public class InsertionSet {
	    public void hashSet() {
	         Set<String> hashSet = new HashSet<String>();
	         hashSet.add("jeni");
	         hashSet.add("tharun");
	         hashSet.add("ragavi");
	         hashSet.add("rayan");
	         hashSet.add("ragavi");
	         System.out.println("Names displyed HashSet"+ hashSet);
	        
	    }
	    public void linkedSet() {
	         Set<String> linkedSet = new LinkedHashSet<String>();
	         linkedSet.add("jeni");
	         linkedSet.add("tharun");
	         linkedSet.add("ragavi");
	         linkedSet.add("vishnu");
	         linkedSet.add("rayan");
	         linkedSet.add("ragavi");
	         System.out.println("\nNames displayed in LikedHashset:");
	         System.out.println(linkedSet);
	    }
	    public void treeSet() {
	        Set<String> treeset = new TreeSet<String>();
	        treeset.add("jeni");
	        treeset.add("tharun");
	        treeset.add("ragavi");
	        treeset.add("vishnu");
	        treeset.add("ragavi");
	        treeset.add("rayan");
	        System.out.println("\nNames displayed in TreeSet");
	        System.out.println(treeset);
	        Set<String> reverse=new TreeSet<String>(Collections.reverseOrder());
	        reverse.addAll(treeset);
	        
	        for(String revName : reverse){
	            System.out.println(revName);
	        }
	      
	    }
	    
	}

