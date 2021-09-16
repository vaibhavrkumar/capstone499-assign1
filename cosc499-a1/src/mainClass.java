import java.util.Arrays; 
import java.util.Collections; 


public class mainClass {
	public static void main(String[] args) {
		int [] arr = {12, 87, 78, 98,23, 45};
		
		sortArrayAsc(arr);
	}

	private static void sortArrayAsc(int[] arr) {
		System.out.printf("Original Array: %s", Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println();
		System.out.printf("Sorted in Ascending: %s", Arrays.toString(arr));
	}
}
