package encapsulation;

public class Automobile {

	  private String color;
	  private int speed;
	  private int gear;
	  private String make;
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	//	for (int i = 0; i < 180; i++) {
			if(speed<20)
			{
				System.out.println("First Gear  " +speed);
				
			}
			else if(speed<20)
			{
				System.out.println("Second Gear  " +speed);
				
			}
			else if(speed<60)
			{
				System.out.println("Third Gear  " +speed);
				
			}
			else if(speed<100)
			{
				System.out.println("Fourth Gear  " +speed);
				
			}
			else if(speed<=180)
			{
				System.out.println("Fifth Gear  " +speed);
				
			}
			
		}
	//}
	int getGear() {
		return gear;
	}
	void setGear(int gear) {
		this.gear = gear;
	}
	String getMake() {
		return make;
	}
	void setMake(String make) {
		this.make = make;
	}
	  
	
}
