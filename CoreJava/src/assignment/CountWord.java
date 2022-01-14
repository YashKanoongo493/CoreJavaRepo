package assignment;

public class CountWord {

	
	public static void main(String[] args) {
		
		int j = 0;
		String name="Yash Kanoongo ";
		for(char letter ='A' ; letter<='z' ; letter++) {
			
			for(int i=0; i<=name.length()-1; i++)
			{
				if(name.charAt(i) == letter)
				{
					j++;
					
			}
		if(j> 0)
		{
			System.out.println(letter+"=" +j);
			j=0;
		}
			}
		}
	}	
}
 
	
/*	int wordcount1 = 0;
	String word1="Yash Kanoongo ";

	
	
	for(char letter ='A' ; letter<='Z' ; letter++) {
		
		for(int i=0; i<word1.length(); i++)
		{
			if(word1.charAt(i) == letter)
			{
				wordcount1++;
				
		}
	if(wordcount1 > 0)
	{
		System.out.println(letter+"=" +wordcount1);
		wordcount1 =0;
	}
		}
	}
	
}

}*/
