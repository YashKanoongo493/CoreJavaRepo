package input_and_output;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Marksheet1 implements Externalizable {
 
	private String name;
	private int maths;
	private int physics;
	private int chemistry;
    transient int temp = 0;
    
    public Marksheet1() {}//Default constructor
    	public Marksheet1(String name, int maths, int physics, int chemistry, int temp) {
    		
    	}
    

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
