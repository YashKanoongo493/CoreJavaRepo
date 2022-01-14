package input_and_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSer {
public static void main(String[] args) throws Exception {
	
	FileOutputStream file = new FileOutputStream("D:/obj.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	
	EmployeeSer e = new EmployeeSer(1,"Rays","Tech");
	
	out.writeObject(e);
	out.close();
	//f.close();
	System.out.println("Done");
}
}
