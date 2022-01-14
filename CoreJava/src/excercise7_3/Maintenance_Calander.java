package excercise7_3;

import java.util.*;

public class Maintenance_Calander {
	
	

			public static void main(String args[])
			{
				Calendar cal = Calendar.getInstance();
				System.out.println("The installation Date is: " + cal.getTime());
				System.out.println("");
						
				for (int i = 1; i < 13; i++) {
					
					cal.add(cal.DATE, +30);
					System.out.println("The "+i+" service date is: "+cal.getTime());
				}
			}		
			
}
