package excercise4_14;

public class ArmstrongNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num=371, num1,rem, result=0;
num1=num;
while(num1!=0)
{
	rem=num1%10;
	result+= Math.pow(rem,3);
	num/=10;
	
}
if(result==num)
	System.out.println(num+"number is armstrong" );
else
	System.out.println(num+"number is not armstrong");
}
}
