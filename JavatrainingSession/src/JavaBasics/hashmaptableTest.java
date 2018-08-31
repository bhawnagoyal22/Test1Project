package JavaBasics;

import java.util.Hashtable;

public class hashmaptableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer,String> test= new Hashtable <Integer,String>();
	
		test.put(1, "Hello World");
		test.put(2, "Hello World11");
		test.put(3, "Hello World22");
		test.put(4, "Hello World33");
		
		System.out.println(test.entrySet());
		System.out.println(test.keySet());
	}


}
