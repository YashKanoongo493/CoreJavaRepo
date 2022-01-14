package interface_;

public class TestBussinessMan {
	public static void main(String[] args) {
		RichMan r = new BussinessMan();
		r.donation();
		r.earnmoney();
		r.party();

		SocialWorker s = new BussinessMan();
		s.helpToOthers();

		BussinessMan b = new BussinessMan();
		b.donation();
		b.earnmoney();
		b.party();

	}
}
