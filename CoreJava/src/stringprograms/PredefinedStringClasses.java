package stringprograms;

public class PredefinedStringClasses {
	public static void main(String[] args) {
	    String n = "Yash";
	    String name = new String ("Yash Kanoongo");
	    System.out.println("String length: " +name.length());
        System.out.println(name);
        System.out.println(name + name.length());
        System.out.println("7th character is: " + name.charAt(6));
        System.out.println("Index of O "+name.indexOf("o"));
        System.out.println("First o Position " +name.lastIndexOf("o"));
        System.out.println("a is replaced by b " +name.replace("a", "$"));
        System.out.println("All o is replaced by " +name.replaceAll("o","0"));
        System.out.println("Small case " + name.toLowerCase());
        System.out.println("Upper case "+name.toUpperCase());
        System.out.println("Starts with Yash "+name.startsWith("Kanoongo"));
	    System.out.println("Ends with go "+name.endsWith("go"));
	    System.out.println("Substring "+name.substring(0,5));
	}
}
