package stringprograms;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Yash");
		System.out.println(sb);
		 System.out.println(sb.append(" Kanoongo"));
			StringBuffer s = new StringBuffer("YashKanoongo");

		 System.out.println(s.capacity());
		System.out.println("Replace Of o " +sb.replace(5,7, "RAJ"));  
		 System.out.println("Reverse of " +sb.reverse());
	}
}
