package excercise4_14;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454, rev=0, temp,rem;
		
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num = num/10;
			
		}
		if (temp==rev)
	 System.out.println("Palindrome number " );
		else
	 System.out.println("not palindrome ");
	}
}
