package excercise4_14;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=59;
  boolean cond= false;
  for(int i=2; i<=num/2;i++)
  {
	  if (num%i==0)
	  {
		  cond=true;
		  break;
	  }
  }
  if(!cond)
	  System.out.println("Number is prime " +num);
  else
	  System.out.println("Number is not prime " +num);
	}

}
