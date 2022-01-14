package collectionframework;


	import java.util.ArrayList;
	import java.util.List;

	public class CollectionOfArrayList {
	public static void main(String[] args) {

		//ListMethods ---{add(o), addAll(c), clear(o), contains(o), containsAll(c), isEmpty(), iterator(), remove(o), removeAll(c), retainAll(c), size() ||}
		
		
		List l = new ArrayList<>();   //add
		l.add(12);
		l.add("JAVA");
		l.add('Y');
		l.add(12.56);
		l.add(1234);
		  System.out.println( "list l is" + l);
		 System.out.println("        ");
		  
		  
		 for (Object o : l) {
			System.out.println(o);
			 System.out.println("         ");
		}
			 
		  List e = new ArrayList<>();   //add
			e.add(12);
			e.add("Yash");
			e.add('G');
			e.add(1256);
			e.add(1234);
			  System.out.println("List e is "+e);
			  System.out.println("       ");
			  
			  
			  
			
			  l.addAll(e);
			   System.out.println("After add E "+l);
			   System.out.println("        ");

	/*l.clear();  //clear
	System.out.print("clear l: "+l);
	 System.out.println("          ");
	 
	 

	System.out.println("List e contains true or false "+e.contains('Y')); //contains
	 System.out.println("         ");




	System.out.println("List e contains objects "+e.containsAll(e));  //containsAll
	 System.out.println("       ");
	 
	 
	 
	System.out.println("List e is empty  "+e.isEmpty()); // is empty
	 System.out.println("            ");
	 
	 
	 

	System.out.println("Removed index letter is  "+ e.remove(2)); //remove
	System.out.println("New list e after removing "+ e);
	 System.out.println("          ");



	System.out.println("Remove All: "+e.removeAll(e)); //remove all
	System.out.println(e);
	  System.out.println("          ");*/
			   
			   
			   
				
	System.out.println("Retain all output is "+e.retainAll(l));   //retain all gives output when elements are same in lists 
	System.out.println("new output of e after RetainAll "+e);
	System.out.println("         ");



	          
	System.out.println("Size is "+e.size());  //SIZE//
	System.out.println("New Output of e after size "+e);
	System.out.println("         ");


	} 
}
