package excercise13_7;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExcerciseMarkshhet_7 implements Externalizable{

	  String name = null;
	  int maths = 0;
	  int physics = 0;
	  int chemistry = 0;
	  
	  transient int total=0;
	  
	  transient double percentage = 0;
	  
	  transient int temp = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	
	public int getTotal() {
		total = maths+physics+chemistry;
		return total;
		
		
	}
	
	public double getPercentage() {
		percentage = total/3;
		return percentage;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeInt(physics);
		out.writeInt(chemistry);
		out.writeInt(maths);
		
		//serialize transient variable
		out.writeInt(temp);
		                                                                                                                                                   
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String) in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		//deserializable transient variable
		temp = in.readInt();
	}
	  

}
