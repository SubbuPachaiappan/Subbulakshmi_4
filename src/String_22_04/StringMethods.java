package String_22_04;

public class StringMethods {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	String Sentence="A cloudless plain blue sky is like a flowerless garden";
	String Sentence2="A cloudless plain blue sky is like a flowerless garden";
	System.out.println("Convert to uppercase: "+Sentence.toUpperCase());
	System.out.println("Convert to uppercase: "+Sentence.toLowerCase());
	System.out.println(Sentence.indexOf("blue"));
	System.out.println(Sentence.lastIndexOf("garden"));
	System.out.println("Print the total number of strings present: "+Sentence.length());
	System.out.println(Sentence.concat(Sentence2));
	System.out.println(Sentence.charAt(5));
	System.out.println(Sentence.contains("is"));
	System.out.println(Sentence.contains("are"));
	System.out.println(Sentence.replace("is","was"));
	System.out.println(Sentence.replaceAll("is", "was"));
	System.out.println(Sentence.equals(Sentence2));
	System.out.println(Sentence.isEmpty());
	System.out.println(Sentence.replaceFirst("A", "the"));
	System.out.println(Sentence.substring(2, 11)); //2 is inclusive 11 is exclusive
	System.out.println(Sentence.equalsIgnoreCase(Sentence2));
	
	    }
	}


