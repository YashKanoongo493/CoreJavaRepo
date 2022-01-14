package excercise13_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWriteStudent {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("D:/student.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		Student s = new Student();

		s.setName("Ram");
		s.setRoll_no("70");
		s.setAge(22);

		System.out.println("Name :" + s.getName());
		System.out.println("Roll_no : " + s.getRoll_no());
		System.out.println("Age :" + s.getAge());

		out.writeObject(s);
		out.close();
        file.close();
		System.out.println("object is serialize and persisted");
	}

}
