package collectionframework;

	import java.util.LinkedList;
	import java.util.List;
	import java.util.Stack;
	import java.util.Vector;

	public class List_Interface {
	public static void main(String[] args) {
		
		
		List l = new LinkedList();
		Vector v = new Vector();
		Stack S = new Stack();
		
		
		
		//Adding elements in vector 
		v.add(1);
		System.out.println("Vector output is "+v); 
		System.out.println(" ");
		//Adding elements in Stack
		S.push(789);
		S.push(456);
		S.push(753);
		S.push(963);
		
		System.out.println("Stack output is "+ S);
		System.out.println(" ");
		
		//Adding elements in list
		l.add(12);
		l.add("JAVA");
		l.add('Y');
		l.add(12.56);
		l.add(1234);
		l.add(123);
		l.add("YASH");
		l.add('l');
		l.add(125.6);
		l.add(1234456);

		 //add(o.i); operation
		
		l.add(3,25);   //output--- index or value  aage badh jayge 
		l.add(0,25);
		l.add(6,32);
		l.add(5,10);
		l.add(4,97);
		l.add(2,81);
		System.out.println("List Is: "+l);
		System.out.println("  ");
		
		 //set(o.i); operation
		
		l.set(0, 123);       //output--- index or value  aage badh jayge 
		System.out.println("Set output: "+l);
		System.out.println("  ");
		
		l.remove(0);  //remove object from  given index 
		System.out.println("remove output: "+l);
		System.out.println("  ");
		
		 //get(o.i); operation
		l.get(4);     //returns an object from give index
		System.out.println("Get output is: "+l.get(4));
		System.out.println("  ");
		
		
		
		l.subList(0, 5);
		System.out.println("sublist output is: "+l.subList(0, 5));
		System.out.println("  ");
		
		
		l.indexOf(123);  ///aage se search krega or index btayga given object ka
		System.out.println("IndexOf Output is: "+l.indexOf(123));
		System.out.println(" ");
		
		
		l.lastIndexOf(1234);  //piche se search krega or index btayga given object ka
		System.out.println("LastIndex of  output is: "+l.lastIndexOf(1234));
		System.out.println(" ");
	}

}
