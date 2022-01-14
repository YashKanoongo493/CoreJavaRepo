package jdk8;

import java.util.ArrayList;

public class TestForEach {
public static void main(String[] args) {
	
	ArrayList<Integer> i = new ArrayList<Integer>();
	i.add(185936);
	i.add(1256);
	i.add(1789);
	i.add(13);
	i.add(12);
	i.add(1234);
	
	i.forEach(li ->System.out.println(li));
}
}
