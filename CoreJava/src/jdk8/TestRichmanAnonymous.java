package jdk8;

public class TestRichmanAnonymous {
public static void main(String[] args) {
	
	Richman R = new Richman() {
		
		@Override
		public void party() {
			// TODO Auto-generated method stub
			System.out.println("Aaj Bhai ka bday hai  lets partyyyyyyyyy");
		}
		
		@Override
		public void earnmoney() {
			// TODO Auto-generated method stub
			System.out.println("Pesa hi pesa Hoga");
		}
		
		@Override
		public void donation() {
			// TODO Auto-generated method stub
		System.out.println("Donation k bina addmission nhi hoga ");	
		}
	};R.party();
	R.donation();
	R.earnmoney();
}
}
