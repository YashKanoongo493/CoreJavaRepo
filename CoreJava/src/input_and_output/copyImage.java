package input_and_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class copyImage {
public static void main(String[] args) throws Exception {
	String src = "D:/Image.jpg";
	String trgt = "D:/Image1.jpg";
	
	FileInputStream fr = new FileInputStream(src);
	FileOutputStream fw = new FileOutputStream(trgt);
	
	int ch = fr.read();
	while (ch!=-1) {
		fw.write(ch);
		ch = fr.read();
		
	}
	
	System.out.println(src+" is copied to: "+trgt);
	fw.close();
	fr.close();
}
}

