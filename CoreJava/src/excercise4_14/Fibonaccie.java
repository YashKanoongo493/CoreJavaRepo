package excercise4_14;

public class Fibonaccie {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n1=0, n2=1, n3,i ;
  for(i=0;i<=10;i++)
  {
	  n3=n1+n2;
	  System.out.println("Number is: "+n3);
	  n1=n2;
	  n2=n3;
  }
	}

}
