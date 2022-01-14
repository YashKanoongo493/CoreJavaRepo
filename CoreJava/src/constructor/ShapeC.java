package constructor;

public class ShapeC {
	private String color;
	private int borderWidth;
	
	public ShapeC(){
		
	}
    public ShapeC (String s,int b) {
    	color = s;
    	borderWidth = b;
    }
	String getColor() {
		return color;
	}
	int getBorderWidth() {
		return borderWidth;
	}
}
