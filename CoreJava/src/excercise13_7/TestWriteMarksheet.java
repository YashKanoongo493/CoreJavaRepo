package excercise13_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWriteMarksheet {
	  public static void main(String[] args) throws IOException {
			
		    FileOutputStream file = new FileOutputStream("D:/marksheet.ser");
		    ObjectOutputStream out = new ObjectOutputStream(file);
		    
		    ExcerciseMarkshhet_7 m = new ExcerciseMarkshhet_7();
		    
		    m.setName("ram");
		    m.setMaths(70);
		    m.setPhysics(80);
		    m.setChemistry(90);
		    m.setTemp(99);
		    
			
			  System.out.println("name :"+m.getName());
			  System.out.println("maths : "+m.getMaths());
			  System.out.println("chemistry :"+ m.getChemistry());
			  System.out.println("physics :"+m.getPhysics());
			  System.out.println("total marks :" + m.getTotal());
			  System.out.println("total percentage :" + m.getPercentage());
			 
		    
		    out.writeObject(m);
		    out.close();
		    
		    System.out.println("object is serialize and persisted");
	}
}
