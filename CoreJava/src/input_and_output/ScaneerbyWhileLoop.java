package input_and_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScaneerbyWhileLoop {
public static void main(String[] args) throws Exception {

	FileReader f = new FileReader("D:/newtest.txt");
	Scanner sc = new Scanner(f);
	
	String s = sc.nextLine();
	while (sc.hasNext()) {
		System.out.println(s);
		
	}
	f.close();
}
}
