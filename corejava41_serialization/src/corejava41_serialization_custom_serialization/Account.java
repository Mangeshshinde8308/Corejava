package corejava41_serialization_custom_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
   String username="mangu";
   transient String pwd="Mangu1432";   //these are transient variable 
   transient int pin=1234;
   
   private void writeObject(ObjectOutputStream os) throws Exception {  //to retrive transient variable value we need to implement below two method.;
	   os.defaultWriteObject();
	   String epwd="1234"+pwd;
	   int epin=pin+4444;
	   os.writeObject(epwd);
	   os.writeObject(epin);
   }
   
   
   private void readObject(ObjectInputStream oi) throws Exception {
	   oi.defaultReadObject();
	   String epwd=(String) oi.readObject();
	   pwd=epwd.substring(4);
	   int epin=(int) oi.readObject();
	   pin=epin-4444;
	   
	   
   }
   
  
}

