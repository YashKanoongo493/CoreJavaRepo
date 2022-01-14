package excercise4_14;

public class H100To_200DivisbleBy_7 {

	public static void main(String[] args) {
		int  sum=0;
				//count=0;
		for(int i=100;i<=200;i++)
		{
			if(i % 7== 0)
			{
				//sum +=i;
				sum=sum+i;
				//sum++;
			//	count= sum++;
				
			}
		}
			System.out.println("The number which is divisible by 7 is: "+sum);
		
	}
}
