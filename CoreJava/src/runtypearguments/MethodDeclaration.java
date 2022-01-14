package runtypearguments;

public class MethodDeclaration {
	  public static int add(int a,int b)
	   {
		   return a+b;
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			   int a=1;
			   int b=2;
	      int c = a+b ;
	      MethodDeclaration  m = new MethodDeclaration ();
	      m.add(a,b);
	      System.out.println(c);
		}

}
