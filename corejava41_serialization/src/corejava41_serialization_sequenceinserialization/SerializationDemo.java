package corejava41_serialization_sequenceinserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();  //here doesnt matter sequence we created instance
		Cat c=new Cat();  
		Rat r=new Rat();
		FileOutputStream fio=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fio);
		oos.writeObject(c);     //the sequence in which we passed object while serialization in that object only we need to deserialize.
		oos.writeObject(r);   //no matter in which sequence we created object. imm sequence we passes for serialization.
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat c1=(Cat) ois.readObject();
	Rat r1=(Rat) ois.readObject();
		Dog d1=(Dog) ois.readObject();
		
//		Cat c1=(Cat) ois.readObject();  -->Exception in thread "main" java.lang.ClassCastException: class corejava41_serialization_sequenceinserialization.Rat cannot be cast to class corejava41_serialization_sequenceinserialization.Dog (corejava41_serialization_sequenceinserialization.Rat and corejava41_serialization_sequenceinserialization.Dog are in module corejava41_serialization of loader 'app')
//		Dog d1=(Dog) ois.readObject();   //we changed sequence while deserialization. 
//		Rat r1=(Rat) ois.readObject();   // serialization  Cat-->Rat-->Dog
//		                                 //Deserialization we tried in  Cat-->Dog--->Rat  so exception will raised.
		System.out.println(c1.toString());
		System.out.println(r1.toString());
		System.out.println(d1.toString());


				
	}

}
