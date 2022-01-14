package input_and_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardInputStream  {
public static void main(String[] args) throws Exception {
	 
	
	String trgt = "D:/Paste.txt";
	FileWriter fw = new FileWriter(trgt,true);
	PrintWriter Pw = new PrintWriter(fw);
	
	InputStreamReader inp = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(inp);
	
	String line = br.readLine();
	while (!line.equals("quit")) {
	Pw.println(line);	
	line = br.readLine();
	}
	Pw.close();
	fw.close();	
}


	
}

