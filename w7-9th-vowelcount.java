package week7;
public class vowelcount {
	/*This function is to count no. of vowels, consonants, digits and special character in a string.*/
	static void countCharacterType(String str) {
		//Declare the variables for no. of counts vowels, consonant, digit & special characters
		byte vowelsCount=0, consonantCount=0, digitCount=0, splChars=0;
		for (short i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if ((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')) {
				ch=Character.toLowerCase(ch);
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowelsCount=0;
				else
					consonantCount=0;
				}
			else if (ch>='0'&&ch<='9')
				digitCount++;
			else
				splChars++;//This counts even whitespace...
		}
		System.out.println("The total no. of Vowels in the given string: "+vowelsCount);
		System.out.println("The total no. of Consonants in the given string: "+consonantCount);
		System.out.println("The total no. of Digits in the given string: "+digitCount);
		System.out.println("The total no. ofSpecial characters in the given string: "+splChars);
	}
	static void main (String[] args) {
		String str=("Habit-2: Begin with an end in ypur mind.\n Stephen R. Covey author of 7 habits of Effective people, suggests that effective individuals have a clear vision of     their desired destination before embarking on any endeavor.");
		countCharacterType(str);
	}

}
