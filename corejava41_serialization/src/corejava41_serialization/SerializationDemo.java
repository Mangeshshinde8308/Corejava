package corejava41_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Dog implements Serializable{
	 int i=10;
	int j=20;
	transient double k=20.0;   //transient keyword serialize state of object(variable) into file.but while storing JVM store transient variable value with default value.  
	transient boolean b=true;  //eg. default for 
	static int s=222;
	
}
public class SerializationDemo  {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println("i="+d2.i+" "+"j="+d2.j);
		System.out.println(d2.k);  //-->0.00 default value due to transient nature.
		System.out.println(d2.b);  //-->false default value due to transient nature.
		System.out.println(d2.s);
		

	}

}
