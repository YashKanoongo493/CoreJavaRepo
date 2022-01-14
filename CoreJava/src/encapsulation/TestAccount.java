package encapsulation;

public class TestAccount {
	public static void main(String[] args) {

		Account ab= new Account();
		ab.withdrawl(1000);
		ab.deposit(115555);

		System.out.println(ab.getBalance());
		ab.setNumber("12345678990");
		ab.setType("Current account");
		ab.setBalance(100000.456);

		System.out.println(ab.getNumber());
		System.out.println(ab.getType());
		System.out.println(ab.getBalance());

}
}
