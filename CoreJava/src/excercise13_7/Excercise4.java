package excercise13_7;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Excercise4 {
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
