package week7;
import java.io.*;
class Student{
	String name, course; int rno;
	float ia1, ia2, ia3,avg;
	Student(){
		try {
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enetr the roll no of Student: ");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enetr the name of Student: ");
			name=br.readLine();
			System.out.println("Enetr the course of Student: ");
			course=br.readLine();
			System.out.println("Enetr the CIE1 score of the Student: ");
			ia1=Float.parseFloat(br.readLine());
			System.out.println("Enetr the CIE2 score of the Student: ");
			ia2=Float.parseFloat(br.readLine());
			System.out.println("Enetr the CIE3 score of the Student: ");
			ia3=Float.parseFloat(br.readLine());
			avg=(ia1+ia2+ia3)/3;
		}
		catch (Exception e) {
			System.out.println("Run time Error occured while input..");
			e.printStackTrace();
		}
	}
	void displayStudentDetails() {
		System.out.println(rno + "\t" + name + "\t" + course + "\t" + ia1 + "\t" + ia2 + "\t" + ia3 + "\t" + avg);
	}
}
public class arrayofstudent_bufferedreader {
	public static void main(String[] a) {
		Student list[] = new Student[5];
		/*Initialing array of objects individually*/
		for (int i=0; i<list.length; i++)
			list[i] = new Student();
		System.out.println("\n *******************************************************");
		System.out.println("Rno \t Name \t Course \t Cie1 \t cie2 \t cie3 \t avg");
		System.out.println("\n *******************************************************");
		for (int i=0; i<3; i++)
			list[i].displayStudentDetails();
		System.out.println("\n ********************************************");
	}
}
