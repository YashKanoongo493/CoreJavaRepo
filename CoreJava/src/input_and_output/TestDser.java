package input_and_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDser {
public static void main(String[] args) throws Exception {
	

	
	FileInputStream file = new FileInputStream("D:/obj.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	EmployeeSer e = (EmployeeSer) in.readObject();
	
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getPwd());
	
}
}

