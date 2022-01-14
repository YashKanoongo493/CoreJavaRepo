package runtypearguments;

public class HelloAllConditional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int size =args.length;
  if(size==0)
  {
  System.out.println("Hello All");
	}
  else
  {
	  for (int i = 0; i < size; i++) {
		System.out.println(i+ "Size is= " +args[i]);
	}
  }
	}
}
