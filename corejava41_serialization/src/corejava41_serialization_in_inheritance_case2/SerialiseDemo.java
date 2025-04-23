package corejava41_serialization_in_inheritance_case2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerialiseDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog();
		d1.i=888;
		d1.j=999;
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.i);  // here original value came as output. because we not serialise parent class.
		System.out.println(d2.j);
		

	}

}
