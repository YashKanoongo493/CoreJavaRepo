package array1DMD;

public class CopyAnArray {

	public static void main(String[] args) {
		
		char[] ch = {'d','e','f','g','h','i','j','k'};
		char [] cp = new char[7];
		//char[] cp = new char [7];
		System.arraycopy(ch, 01, cp, 0, 7);
		for (char c : cp) {
			System.out.println(c);
	
		}
	}
}
