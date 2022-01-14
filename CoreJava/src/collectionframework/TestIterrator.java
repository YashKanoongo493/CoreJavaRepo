package collectionframework;


	import java.util.Enumeration;
	import java.util.Iterator;
	import java.util.Vector;
	//import java.util.*;

	public class TestIterrator {
		
			public static void main(String[] args) {
				Vector v = new Vector();
				v.add("One");
				v.add("Two");
				v.add("Three");
				v.add("Four");
				v.add("Five");
				
				//print all elements by iterator
				
				Iterator it =  v.iterator();
				while(it.hasNext())   //hasnext
					it.remove();
				{
					String str = (String) it.next();  //next
					System.out.println("Iterator output "+str);
				}
				
			/*	Enumeration en = v.elements();
				
				while (en.hasMoreElements()) {
					String str1 = (String) en.nextElement();
					
					System.out.println("Enum output "+str1);
					
				}	*/

				Iterator its =  v.iterator();
				if(its.hasNext()) {  //hasnext
					its.remove();
				
					String str2 = (String) its.next();  //next
					System.out.println("Iterator output 1"+str2);
				}
				
				}
}
