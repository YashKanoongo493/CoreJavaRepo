package input_and_output;

import java.io.File;

public class Directry {
	public static void main(String[] args) {
		File f = new File("c:/");
		String[] list = f.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1)+":"+list[i]);
		} 
	}
}
