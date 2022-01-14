package assignment;

public class ReverseOnPlace {
	public static void main(String[] args) {
		
		String name = "Yash Kanoongo";
		  String[] name2 = name.split(" ");
		  
		 System.out.println("Reverse string is:- ");  
		 String a = name2[0];
		 //String[]b= a.split("");
		 for(int i=(a.length()-1); i>=0; i--)
				 {
			 System.out.print(a.charAt(i));
				 }
		 System.out.print(" ");
		 String a1 = name2[1];
		 //String[] b1 = a1.split("");
		 
				 for(int i=(a1.length()-1); i>=0; i--)
				 {
					 System.out.print(a1.charAt(i));
}
	}
}
