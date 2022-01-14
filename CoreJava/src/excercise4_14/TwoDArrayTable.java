package excercise4_14;

public class TwoDArrayTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][]a = new int[9][10];
    for(int i=0; i<9; i++)
    {
    System.out.println("");
       for(int j=1; j<=a[i].length;j++)
       {
    	   int s = (i+1)*j;
    	   System.out.print(" 	"+s);
       }
    	   
	 }
  }
}
