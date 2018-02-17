//classname must be filename
class multiDimensional
{
	//main method, arguments may be passed on commandline execution
	public static void main(String args[])
	{
		// declaring and initializing 2D array
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

		// printing 2D array in two nested for-loops
		for (int i=0; i< 3 ; i++)
		{
			for (int j=0; j < 3 ; j++)
				//print element
				System.out.print(arr[i][j] + " ");
			//newline
			System.out.println();
		}
	}
}
