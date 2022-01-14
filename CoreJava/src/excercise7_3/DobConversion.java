package excercise7_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DobConversion {

		
	 public static void main(String[] args) throws ParseException{
		    
		 //direct  Age calculation
		 
		LocalDate l = LocalDate.of(1998, 06, 13); //specify year,month,date. dob 
		 LocalDate now = LocalDate.now(); //get local date
		 Period diff = Period.between(l, now);//diffrent calculation
		 System.out.println(diff.getYears()+"years"+diff.getMonths()+"months"+diff.getDays()+"days");
		 
		 String s = "2021/12/27";
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		 Date d = sdf.parse(s);
		 Calendar c = Calendar.getInstance(); //method
		 c.setTime(d);
		 int year = c.get(Calendar.YEAR);
		 int month = c.get(Calendar.MONTH);
		 int date = c.get(Calendar.DATE);
		 
		 LocalDate l1 = LocalDate.of(year, month, date);
		 LocalDate now1 = LocalDate.now();
		 Period diff1 = Period.between(l, now);
		 
		 System.out.println("age"+ diff1.getYears()+"years");
		 System.out.println(diff1.getMonths());
		 System.out.println(diff1.getDays());
	}
}
