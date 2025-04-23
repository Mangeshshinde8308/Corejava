package corejava22_Typecasting;
//there are two type of casting
//1)Implicite casting/widning casting/casting down: also know as down casting. compile will take care of this. (bade container main choti container.
public class Casting {
	
		
	int a=10;   //byte->short->int->long->float->double
	long l=a; //-->here we stored a=10 this int type of value in long type.means bade container main choti value. this conversion done by compiler.
              //in case implicite casting/down casting there is no chance of lose data.
	
	
	
	long b=10L;   //-->here we are tring to store long type value in int type. means large value in short container. such type casting is known as upcasting/explicite casting.
	int c=(int)b;  //--here long b means  byte value we are storing in int cwhich is 4 byte. means in case of explicite casting there is chance of losing data.
	               // here is chance of losing data means we then also we need conversion means we need to gave datatype of assining variable in bracket. which means we are saying to compiler, yes we know this is exlicite casting. we neeed it. it chance of losing data but its fine. we need it.
}
