package input_and_output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterFile implements AutoCloseable{
public static void main(String[] args) throws Exception {
	
	FileWriter fw = new FileWriter("D:/javacore.txt",true); //true stands for append
	PrintWriter p = new PrintWriter(fw);
	p.println("Hi Good Morning dear: yash ");
	p.println("Hi Good Morning dear: yash ");
	p.println("Hi Good Morning dear: yash ");
	p.println("Hi Good Morning dear: yash ");
	p.println("yash");
	p.println("kapil ");
	p.println("mayank");
	p.println("vineet");
	System.out.println("Done");
	
	//fw.close(); //mandat
	//  p.close();  //mandat
	  
}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	
}

}
