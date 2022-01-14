package input_and_output;

import java.io.File;
import java.util.Date;

public class TextClass {
public static void main(String[] args) {
	File f = new File("D:/javacore.txt");
	if(f.exists()) {
		System.out.println("NAME "+f.getName());
		System.out.println("Absolute path "+f.getAbsolutePath());
		System.out.println("Is Writable "+f.canWrite());
		System.out.println("Is Readable "+f.canRead());
		System.out.println("Is file "+f.isFile());
		System.out.println("Is Directory "+f.isDirectory());
		System.out.println("Last modified at "+new Date(f.lastModified())+" "+"time"+new Date(f.lastModified()).getTime());
		System.out.println("Length"+f.length()+"bytes long");
	}
}
}
