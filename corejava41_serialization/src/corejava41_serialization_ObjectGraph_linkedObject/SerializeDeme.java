package corejava41_serialization_ObjectGraph_linkedObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	 Cat c=new Cat();
}

class Cat implements Serializable{
	Rat r=new Rat();
}

class Rat implements Serializable {  //we need to implement serializable interface with all linked classes. otherwise we will get exception 
	int j=10;
}
public class SerializeDeme {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();   
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);  //we serialise Dog object but along with Dog all linked object also deserialised.
		
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d1=(Dog) ois.readObject();
		System.out.println("value of j= "+d1.c.r.j);
		

	}

}
