class time
{
	//main method, arguments may be passed on commandline execution
	public static void main(String args[])
	{
		// declare and initialize 4D array
		int arr[][][][] = {
								{
									{ {0,0,0},{2,6,1},{5,4,2} },
									{ {0,0,0},{9,6,2},{0,1,3} },
									{ {0,0,0},{4,5,6},{2,5,2} }
								},
								{
									{ {0,4,2},{1,6,1},{5,4,2} },
									{ {3,7,9},{9,6,2},{0,1,3} },
									{ {5,8,4},{4,5,6},{2,5,2} }
								},
								{
									{ {7,5,2},{2,6,2},{6,5,5} },
									{ {6,8,9},{7,5,2},{8,5,9} },
									{ {2,8,5},{3,7,7},{4,5,8} }
								}
							};
		// print time array in four nested for-loops
		for (int l = 0; l<3; l++)		
		{	
			//print 3D-element number
			System.out.println(l);
			for (int i=0; i< 3 ; i++)
			{
				for (int j=0; j < 3 ; j++)
				{
					for (int k=0; k < 3; k++)
					{
						//print element
						System.out.print(arr[l][i][j][k] + " ");
					}
					//print whitespaces
					System.out.print("     ");
				}
				//newline
				System.out.println();
			}
		}
	}
}
