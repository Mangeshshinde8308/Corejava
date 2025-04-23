package corejava37_StringBuilder;


//all concepts, method and constructor of StringBuilder( is same as per StringBuffer.
// only diffrence is  Stringbuffer that all methods Syncronised in StrinBuffer.(Stringbuffer also final class.)
//String class also final.
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class def==public final class StringBuilder
		StringBuilder sb =new StringBuilder();
		
		// public StringBuilder append(String str) -->declaration of StringBuilder method. method are not synchronised.
		sb.append("mangu");
		System.out.println(sb);

	}

}
