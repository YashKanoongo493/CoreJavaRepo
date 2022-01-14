package excercise13_7;

import java.io.File;

public class Excercise1 {
	public static void main(String[] args) {
		File f = new File ("c:/");
		File[] list = f.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				System.out.println((i+1)+" : "+ list[i].getName());
			}
		}
	}
}
