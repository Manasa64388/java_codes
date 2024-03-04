package week7;
import java.util.Scanner;
public class duplicate_elements{
	public static void main(String[] args) {
		int array[] = new int[10];
		boolean isDuplicate=false;
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter array size....");
		int size = inScanner.nextInt();
		System.out.println("Enter array elements one by one....");
		for (int i=0; i<size; i++)
			array[i]=inScanner.nextInt();
		int i,j=0;
		Outer: for (i=0; i<size-1; i++) {
			for (j=i+1; j<size; j++) {
				if (array[i]==array[i]) {
					isDuplicate = true;
					break Outer;
				}
			}
		}
		if (isDuplicate)
			System.out.println("Array contains duplicate elements at position: "+ (i+1)+" and at "+(j+1));
		else
			System.out.println("Array doesn't contains duplicate element.");
	}
}
