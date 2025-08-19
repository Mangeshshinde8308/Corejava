package corejava23_default_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
       Connectivity c=new DataConnectivity();
       c.sqlConnection();  //-->O/P -->this is default method present in Interface
       //-->Now this is method present inside interface. this interface hold object of DataConnectivity. then also we can able to access sqlConnection method from interface.
       
       
       SQLConnnectivity sq=new SQLConnnectivity();
       sq.sqlConnection();  //O/P-->implemented default method in implented class

	}

}
