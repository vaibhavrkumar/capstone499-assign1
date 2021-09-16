import java.util.Arrays; 
import java.util.Collections; 


public class mainClass {
	public static void main(String[] args) {
		int [] arr = {12, 87, 78, 98,23, 45};
		
		sortArrayAsc(arr);
		sortArrayDesc(arr);
	}	

	private static void sortArrayAsc(int[] arr) {
		System.out.printf("Original Array: %s", Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println();
		System.out.printf("Sorted in Ascending: %s", Arrays.toString(arr));
	}
	
	private static void sortArrayDesc(int[] arr) {
		// Sorts IntArray in descending order 
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tmp = 0;
	            if (arr[i] > arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
	    }
	System.out.printf("Sorted in Descending: %s", Arrays.toString(arr));	
	}
}
