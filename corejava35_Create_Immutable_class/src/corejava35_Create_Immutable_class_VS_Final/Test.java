package corejava35_Create_Immutable_class_VS_Final;

//final keyword applicable for variable and class not for Object.
//Immutable concept related Object. if we declare class as final means we not making it as immutable.
//if we declare variable as final then we cant perform reassignment to different object.
//

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final StringBuffer sb=new StringBuffer("Mangu"); //heree we apply final modifier to Stringbuffer object. that does means we 
		                                                  //we convert Strinbuffer as immutable.
		 sb.append("dada");  //-->
		 System.out.println(sb);  //-->Mangudada  -->we can cahnge contain of object here without cerate new object.
		                           //means by declaring final only class not convert into immutable.
		
		 // sb=new StringBuffer("raj");  --> sb is final cant be reassign.
		 //string calss and all wrapeer class are final and immutable. 
		

	}

}
