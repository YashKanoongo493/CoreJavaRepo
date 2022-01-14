package input_and_output;

import java.util.Scanner;

public class ScannerClassAdd {
public static void main(String[] args) {
	


	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter 1st no : ");
	 int a = sc.nextInt();
	
	 System.out.println("Enter 2nd no : ");
	 int b = sc.nextInt();
    
	 
 System.out.println("Addition is: ");
 int c = a + b;
 System.out.println(c);
 
  //System.out.println("Enter your name or any string: ");
	// String s = sc.nextLine();
	// System.out.println(s);
	
	 sc.close();
}
}
