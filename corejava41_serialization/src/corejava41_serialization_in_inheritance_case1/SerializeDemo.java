package corejava41_serialization_in_inheritance_case1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.j);  //we are able to access child class variable after deserializabtion
		System.out.println(d2.i);
		//that means if parent is serializable then child automatically serializable.
		//we not implemented serializable interface for Dog(child) then also we serialize and deserialize object.
		

	}

}
