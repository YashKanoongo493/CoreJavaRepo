package excercise7_3;


	import java.time.*;
	import java.util.*;

	public class FindAge {

			public static void caluculateAge(LocalDate  date_of_birth, LocalDate current_date)   
		    {
				// Get period between the first and the second date   
		        Period difference = Period.between(date_of_birth, current_date);   
		        // Show date difference in years, months, and days   
		        System.out.print("The age of this employee is:\n");   
		        System.out.printf( "%d years, %d months and %d days",   
		            
		               
		            difference.getYears(),
		            difference.getMonths(),
		            difference.getDays());
		   
		    }
			 public static void main(String[] args)   
			    {   
			        // Create first and second date using LocalDate's of() method  
			        LocalDate date_of_birth = LocalDate.of(1998, 06, 13);   
			        LocalDate current_date = LocalDate.of(2021, 12, 27);   
			        // Calling calculateAge() method to get and print the period between both dates   
			        caluculateAge(date_of_birth, current_date);   
			    }   
		
}
