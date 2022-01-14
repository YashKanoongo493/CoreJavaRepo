package collectionframework;

public class EqualsAndHashCode {
 public static void main(String[] args) {
	String S1 = "Java";
	String S2 = "Java";
	String S3 = "yash";
	System.out.println("Equals is "+S1.equals(S2));
	System.out.println("Equals is "+S1.equals(S3));
	
	System.out.println("HashCode of S1 is "+ S1.hashCode());
	System.out.println("HashCode of S2 is "+ S2.hashCode());
	
	
	Integer i = 5; //for hashcode---Integer is wrapper class and for primitive data types we use wrapper class
	System.out.println("HashCode of i is "+  i.hashCode());
}
}
