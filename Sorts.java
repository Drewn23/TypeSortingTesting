/** 
** Software Technology 152
** Class to hold various static sort methods.
*/
class Sorts
{
    // bubble sort
    public static void bubbleSort(int[] A)
    {
	boolean swapped; //let swapped be boolean variable
	// the sorting loop must reiterate at least once for each array element  
	for (int i = 0; i < A.length - 1; i ++) //for loop to operate sorting loop multiple times
	{
		swapped = false; //declare swapped as false
		for (int j = 0; j < A.length -1 - i; j ++) //for loop to cycle through array elements for sorting
		{
			//compare elements by size
			if (A[j] > A[j + 1]) //if statement to compare the current and element after
			{
				int temp = A[j]; //let temp be integer and declare temp as interger in array A[j}
				A[j] = A[j + 1]; // declare interger in A[j] be interger from element after in the array
				A[j + 1] = temp; // declare element after in the array be interger from temp variable
				swapped = true; // let swapped be true
			}
		}
		
		if (!swapped) //if swapped not false
		{
			break; //stop for loop
		}
	}	
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A)
    {
	for (int i = 0; i < A.length - 1; i ++) //loop for each element in the array
	{
		int min = i; // let min be interger and be value of interger i
		for (int j = i + 1; j < A.length; j ++) //loop to sort each element by size
		{
			if (A[j] < A[min]) // to compare if the element in A[j] is less than in A[min]
			{
				min = j; // store the value of j in min; this is to store the location of the selected element in the array
			}
		}
		int temp = A[i]; // let temp be interger and store value of A[i] in temp
		A[i] = A[min]; // Replace value of A[i] with element in A[min]
		A[min] = temp; // Replace A[min} element with value from temp
	}	
    }// selectionSort()

    // insertion sort
    public static void insertionSort(int[] A)
    {
	for (int i = 1; i < A.length; i ++) //loop for each element in array
	{
		int j = i; //let j have value of i
		while (j > 0 && A[j - 1] > A[j]) //while loop to countinuiously check if element after is higher 
		{
			int temp = A[j]; //temporary store element of A[i] in temp
			A[j] = A[j - 1]; //let A[j] have value of element before
			A[j - 1] = temp; // replace element before with value of temp
			j --; //reduce j by 1 for each iteration 
		}
	}	
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts calss
