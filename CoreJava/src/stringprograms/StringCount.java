package stringprograms;

public class StringCount {
	public static void main(String[] args) {
		String str ="I m Yash Kanoongo";
		int count=0;
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i)!=' ')
				count++;
			
		}
System.out.println("Total no. of characters in a given string is: " + count);
	}

}
