package input_and_output;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCharByChar {
	public static void main(String[] args) throws Exception {
		
	FileReader f = new FileReader("D:/javacore.txt");
	int ch = f.read();
	char c;
	while (ch != -1) {
		c= (char) ch;
		System.out.println(c);
		ch = f.read();
	}
}
}
