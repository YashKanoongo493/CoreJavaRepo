package excercise4_14;

public class Reverse_number {

	public static void main(String[] args) {
		//int i= 7;
	    //int j =9;
	    int num=561, rem=0, rev=0;
	    while(num>0)
	    {
	    	rem=num%10;
	    	rev=rev*10+rem;
	    	//for new no
	    	num=num/10;
	    	System.out.println("Reverse no: "+ rev);
	    }

	}
}
