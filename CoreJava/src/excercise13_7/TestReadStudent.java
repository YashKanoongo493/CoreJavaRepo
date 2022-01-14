package excercise13_7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestReadStudent {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:/student.ser");
		ObjectInputStream in = new ObjectInputStream(file);

		Student s = (Student) in.readObject();

		System.out.println("name :" + s.getName());
		System.out.println("Roll_no :" + s.getRoll_no());
		System.out.println("Age  :" + s.getAge());

		in.close();
		file.close();

	}
}
