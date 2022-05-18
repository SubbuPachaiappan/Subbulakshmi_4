package set_02_05;

import java.util.HashSet;

public class Sets {
    // creating the objects of string type
    HashSet<String> hashset = new HashSet<String>();

    public void basicSetEg() {
        //adding names
        hashset.add("rayan");
        hashset.add("tharun");
        hashset.add("Vishnu");
        hashset.add("kapil dev");
        hashset.add("ragavi");
        

        // to display the hashset obj
        System.out.println("Names in HashSet:"+ hashset);

        // remove elements using remove() method.
        hashset.remove("tharun");
        System.out.println("After removing the names in Hashset: "+hashset);
    }

    public void removeIf() {
        HashSet<String> remove = new HashSet<String>();
        remove.add("Jeri");
        remove.add("akshiya");
        remove.add("pooja");
        remove.add("sam");
        remove.add("sridhar");

        // appling removeIf() to remove a string names starts with "s"
        remove.removeIf(n -> (n.charAt(0) == 's'));
        System.out.println("\nStudents name Does not start with s"+remove);
    
    }

    public void removeSet() {
        HashSet<String> removehashset = new HashSet<String>();
        removehashset.add("shiny");
        removehashset.add("Maddy");
        removehashset.add("karthik");
        removehashset.add("neeshi");
        removehashset.add("ram");
        // removing all the element in the hashset.
        System.out.println("\nNames in Hashset:");
        System.out.println(removehashset);
        removehashset.removeAll(removehashset);
        System.out.println("After removing the names from the hashset:"+removehashset);
        
        }
}