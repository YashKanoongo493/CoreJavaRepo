package encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestPerson {
	

	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		
		Person p = new Person();
	    p.setName("Yash");
	    p.setDob(d.parse("13/12/1999"));
	    p.setAddress("indore mp");
	    
	    System.out.println(p.getName());
	    System.out.println(p.getDob());
	    System.out.println(p.getAddress());
	  
	}
}
