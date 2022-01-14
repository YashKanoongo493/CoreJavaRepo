package collectionframework;


	import java.util.ArrayList;
	import java.util.Vector;

	public class ConvertStringToObject {
	public static void main(String[] args) {
		
		
		//ArrayList l = new ArrayList();
	    Vector l = new Vector();
		l.add(1695552);
		l.add(1792);
		l.add(1462);
		l.add(1245);
		l.add(1255);
		l.add(124);
		l.add(123);
		
		
		int size = l.size();
		for (int j = 0; j < size; j++) {
			//  Type(1)  
			//System.out.println(j+ " "+ l.get(j));
			
		//  Type(2)  
		//	Object o = l.get(j);  //object = datatype 
		//	System.out.println(j+ " "+ o);
			
		//  Type(3)
			Object o = l.get(j);  
			System.out.println(j+ " "+ l.toString());
			
		}
		System.out.println("   ");
		System.out.println("Hello"+l.get(5));
		
		
	}

}
