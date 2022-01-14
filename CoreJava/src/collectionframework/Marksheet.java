package collectionframework;

public class Marksheet implements Comparable<Marksheet>{
	
private String roll_no;
private String f_name;
private String l_name;
private int phy;
private int chem;
private int math;
public String getRoll_no() {
	return roll_no;
}
public void setRoll_no(String roll_no) {
	this.roll_no = roll_no;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public int getPhy() {
	return phy;
}
public void setPhy(int phy) {
	this.phy = phy;
}
public int getChem() {
	return chem;
}
public void setChem(int chem) {
	this.chem = chem;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
@Override
public int compareTo(Marksheet o) {
	// TODO Auto-generated method stub
	return this.roll_no.compareTo(o.roll_no);   //compareTo method uses only for string 
}


}
