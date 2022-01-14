package excercise4_14;

public class Odd_Even {
	public static void main(String[] args) {
		 int n = Integer.parseInt(args[0]);
		 int countOfEvenNumbers=0,countOfOddNumber=0,sumEven=0,sumOdd=0;
		 
		 while(n > 0) {
			 if(n%2==0) {
				countOfEvenNumbers++;
				sumEven = sumEven + n;
				
			 }
			 else {
				 countOfOddNumber++;
				 sumOdd =sumOdd + n;
				 
			 }
			 n--;
		 }
		 int evenAvg,oddAvg;
		 evenAvg = sumEven/countOfEvenNumbers;
		 oddAvg= sumOdd/countOfOddNumber;
		 System.out.println("average of first N even num"+evenAvg);
		 System.out.println("Average of first n odd number "+oddAvg);
		 
	}
}
