package excercise9_7;

public class Immutable_Class {

	private final String pancard;
	private final String pancardNumber;

	public Immutable_Class (String pancardNumber,String pancard) {
		
		
          this.pancardNumber =  pancardNumber;
          this.pancard = pancard;
                                                           }

	public String getPancard() {
		return pancard;
	}
	

	public String getPancardNumber() {
		return pancardNumber;
	}

	public static void main(String[] args) {
		Immutable_Class e = new Immutable_Class("Aasd!@qwer","Privacy");
		String s1 = e.getPancardNumber();
		String s2 = e.getPancard();
		System.out.println("Pancard number"+ " "+ s1 +s2);
	}
}
