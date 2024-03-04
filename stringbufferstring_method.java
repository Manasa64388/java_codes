package week7;
import java.lang.String;
import java.lang.StringBuffer;
public class stringbufferstring_method {
	public static void main(String[] args) {
		System.out.println("This Code illustrations use of string class & its methods");
		System.out.println("*********************************************************");
		String str=new String("Train your Mind to see the good in Everything: ");
		System.out.println("the initial Strings is: \t"+str);
		System.out.println("After replacing 'o' with 'O':\t"+str.replace('o','O'));
		System.out.println("The length of given string is:\t"+str.length());
		System.out.println("The occurence of character G is at position:\t"+str.indexOf('G'));
		System.out.println("The lower case of String is:\t"+str.toLowerCase());
		System.out.println("The Upper case of String is:\t"+str.toUpperCase());
		System.out.println("The Extracted sub String is:\t"+str.substring(27));
		String s="        Hello World         ";
		System.out.println("The String with spaces:"+s);
		System.out.println("The string with leading & trailing spaces:\t"+s);
		System.out.println("the String without spaces:"+s.trim());
		if (s.isEmpty())
			System.out.println("The String is Empty");
		else
			System.out.println("The String is not empty. It contains " + s);
		s=null;
		System.out.println("The string is after modifying....\t"+s);
		System.out.println("****************************************************");
		System.out.println("This code illustrates use of String Buffer class and its members");
		System.out.println("****************************************************");
		StringBuffer strbuf = new StringBuffer();
		System.out.println("The initial capacity of string buffer is" + strbuf.capacity());
		strbuf.setLength(20);
		strbuf.insert(5,"welcome to world of java");
		System.out.println("the string buffer is:\t" + strbuf);
		System.out.println("The stringbuffer after appending "+strbuf.capacity());
		System.out.println("The reverse of given string buffer is: "+ strbuf.reverse());
		System.out.println("The string buffer after deleting\t"+strbuf.delete(5, 43));
		System.out.println("******************************************************************");
	}
}
