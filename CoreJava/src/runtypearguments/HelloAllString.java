package runtypearguments;

public class HelloAllString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=0; i<args.length; i++)
	  //0th index ke liye length()-1 or i<=args.legth
  {
	System.out.println(i + "Hello" + args[i]);  
  }
	}

}
