package excercise11_8;

import java.util.Stack;
import java.util.Iterator;

public class StackA_Z {
	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		for(char letter ='A' ; letter<='Z' ; letter++) {
			 s1.push(letter);  
			 //System.out.println(letter);
			 System.out.println("s1 Stack: "+s1);
			
		}
		
	   Stack s2 = new Stack();
	   for(char letter1 ='A' ; letter1<='Z' ; letter1++)  {
		  
				s2.push(s1.pop());
				System.out.println(" ");
				System.out.println("After popping stack s1: "+s1);
				
				System.out.println("by inserting s1 stack into Stack s2: "+s2);
				 //System.out.println(letter1);		
	   }
	   Stack s3 = new Stack();
		for (char letter2 ='Z' ; letter2<='A' ; letter2++) {
			s3.push(s2.pop());
		}
		System.out.println(" ");
		System.out.println("s1 stack: "+s1);
		
		System.out.println("s2 Stack: "+s2);
	}	
		
		
		
		
		
		
		//System.out.println("finally s3 Stack: "+s3);

				
			
		} 
		

	                // s2 = (Stack) s1.pop();
	              //   System.out.println(s2); 

	         //System.out.println(s1.get(s2.push(s1)));
