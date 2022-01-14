package assignment;

public class ReverseStringArray {

	public static void main(String[] args) {
	  String name = "YashKanoongo";
	  String[] name2 = name.split("");
	 System.out.println("Reverse string is:- ");  
	 for(int i=name2.length-1; i>=0; i--)
	 { 
		 System.out.print(name2[i]);
	 }
  }
}
