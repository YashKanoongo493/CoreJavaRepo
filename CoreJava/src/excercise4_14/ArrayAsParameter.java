package excercise4_14;

public class ArrayAsParameter {

	public static void main( String args[] ) {
	       int[] a = {1545,9,554,152222};
	       for (int i = 0; i < a.length-1; i++) {
	    	   if (a[0]>a[1]) {
	    		   if (a[0]>a[2]) {
	    			   if (a[0]>a[3]) {
						System.out.println(a[0]);
						break;
					} else {
						System.out.println(a[3]);
						break;
					}
				} else {
					if (a[2]>a[3]) {
						System.out.println(a[2]);
						break;
					} else {
						System.out.println(a[3]);
						break;
					}
				}
			} else {
				if (a[1]>a[2]) {
					if (a[1]>a[3]) {
						System.out.println(a[1]);
						break;
					} else {
						
					}
				} else {
					

				}

			}
	       
		}
}
}
