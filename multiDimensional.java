class multiDimensional
{
	//main method, arguments may be passed on commandline execution
	public static void main(String args[])
	{
		// declare and initialize 2D array
		int arr[][] = { {1,5,9},{3,5,7},{0,6,2} };

		// print 2D array in two nested for-loops
		for (int i = 0; i < 3 ; i++)
		{
			for (int j = 0; j < 3 ; j++)
			{
				//print element
				System.out.print(arr[i][j] + " ");
			}
			//newline
			System.out.println();
		}
	}
}
