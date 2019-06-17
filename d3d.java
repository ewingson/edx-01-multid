class d3d
{
	//main method, arguments may be passed on commandline execution
	public static void main(String args[])
	{
		// declare and initialize 3D array
		int arr[][][] = {
						{ {0,4,2},{1,6,1},{5,4,2} },
						{ {3,7,9},{9,6,2},{0,1,3} },
						{ {5,8,4},{4,5,6},{2,5,2} }
						};
		// print 3D array in three nested for-loops
		for (int i=0; i< 3 ; i++)
		{
			for (int j=0; j < 3 ; j++)
			{
				for (int k=0; k < 3; k++)
				{
					//print element
					System.out.print(arr[i][j][k] + " ");
				}
				//print whitespaces
				System.out.print("     ");
			}
			//newline
			System.out.println();
		}
	}
}
