package excercise4_14;

public class DescedingOrder_18 {

	public static void main(String[] args) {
		int a[]= { 1,456,7,44,998,59,877,446,44,66,1245};
		int x = 446;
		boolean foundNumber = false;
		for (int i = 0;  i < a.length; i++) {
			if (a[i]==x) {
				System.out.println("the position"+x+"in this array is:"+(i+1));
				foundNumber = true;
				break;
				
				
			}
		}
		if(foundNumber==false) {
			System.out.println("the number is not find, -1");
		}
	}	
}
