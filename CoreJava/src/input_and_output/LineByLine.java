package input_and_output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LineByLine {
public static void main(String[] args) throws Exception {
	FileReader reader = new FileReader("D:/javacore.txt");
	BufferedReader br = new BufferedReader(reader);
	String ch = br.readLine();
	while (ch!= null) {
System.out.println(ch);
ch = br.readLine();
	}
	reader.close();
}
}
