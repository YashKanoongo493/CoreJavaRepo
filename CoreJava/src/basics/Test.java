package basics;

public class Test {
	public static void main(String[] args) {
		int a = 20;
		/*for(int i = 0;i<=10;i++) {
			a= 2*i;
			System.out.println("2 * "+i+"="+a);
		}*/
		int b=40; 
		Test t= new Test();
		t.add(a, b);

	}
	public int add(int a,int b) {
		int c = 0;
		c= a+b;
		return c;
	}
}
