package assignment;

public class QuickSort {

	// Helper function
	public static String quickSortOperation(int array[])
	{
		int startIndex = 0;
		int endIndex = array.length - 1;
		quickSort(array, startIndex, endIndex);
		return printArray(array);
	}

	/* A utility function to print array of size n */
	static String printArray(int arr[])
	{
		String result = "";
		for (int i = 0; i < arr.length; i++)
		result = result + arr[i] + " ";
		return result.trim();
	}

	/**
	* Implement quicksort recursively
	* Add additional methods if you need
	* low --> Starting index,
	* high --> Ending index	
	*/

	static void quickSort(int arr[], int low, int high)
	{

		// Please do not remove this line from this quickSort method
		assignment.MyStackTrace.printTrace("quickSort");

		/*** *** Write YOUR CODE HERE *** ***/	
		// You can add additional methods if you need any
		// Do not use java library for sorting
		// base case for recursion
		if (low < high)
    		{
		        /* Taking first element of array as pivot. 
			 * calling inPlacePartition() method to place pivot element
			 * at its correct position in the array.
			 * The inPlacePartition() will return the position 
			 * of pivot element after partitioning the array.
			*/
		        int pivot = inPlacePartition(arr, low, high);
  
        		/* Making recursive calls to quickSort() method to sort 
			 * the left and right sub-arrays after partitioning.
			 */
	        	quickSort(arr, low, pivot - 1);
	        	quickSort(arr, pivot + 1, high);
    		}
	}

	/**
	* Implement inPlacePartition
	* Add additional methods if you need
	* Return the position of the pivot
	* For this inPlacePartitioning method use the first element of the subarray as the pivot.
	*/
	public static int inPlacePartition(int arr[], int start, int end) {

		/*** *** Write YOUR CODE HERE *** ***/
		// You can add additional methods if you need any
		//use the first element of the subarray as the pivot
		int pivot = arr[start];

		// start from the end of the subarray
		// index variable holds the position of the greatest element scanned till now in the subarray
		int index = end+1; 

		// repeat the process starting from the upper end to the lower end of the sub-array
 		for(int j = end; j > start; j--)
    		{
          		// If jth element is greater than the pivot element
        		if (arr[j] > pivot) 
        		{
				// Decrement index of greatest element
			        index--; 
				
				// swap index element with jth element
			        swap(arr, index, j);
        		}
    		}

		// swap the index element with the pivot element
		swap(arr, index - 1, start);

		// return position of the pivot element
		return (index - 1);
	}

	// Adding additional methods as needed
	// Helper function to swap ith and jth elements in the array
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
	    	arr[i] = arr[j];
		arr[j] = temp;
	}
}