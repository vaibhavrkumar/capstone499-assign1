//import static org.junit.Assert.assertArrayEquals;
//import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class testClass extends mainClass{
	
	//unsorted array of integers
			int[] unsorted = {12, 87, 78, 98,23, 45};
			int [] sorted = {12, 23, 45, 78, 87, 98};
			int [] swapArray = {1, 2 , 3, 4};
			int [] swapArray2 = {4, 2, 3, 1};
			//sorted array
	    //descending sorted array
	  // This is test for Insertion Sort
	  @Test
	    public void QuickSortTest() {
	        quickSort(unsorted, 0, unsorted.length - 1);
			    assertArrayEquals(sorted, unsorted);
	  }
	//This is the test for descending array
	   @Test
	    public void SwapTest() {
	        swap(swapArray, 0, swapArray.length - 1);
			    assertArrayEquals(swapArray, swapArray2);
	}
}