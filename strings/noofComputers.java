
class noofComputers
{


static int runCustomerSimulation(int n, char []seq)
{
	// seen[i] = 0, indicates that customer 'i' is not in cafe
	// seen[1] = 1, indicates that customer 'i' is in cafe but
	//		 computer is not assigned yet.
	// seen[2] = 2, indicates that customer 'i' is in cafe and
	//		 has occupied a computer.
	char []seen = new char[26];


	int res = 0;

	int occupied = 0; 

	// Traverse the input sequence
	for (int i=0; i< seq.length; i++)
	{
	
		int ind = seq[i] - 'A';

		
		if (seen[ind] == 0)
		{
			// set the current character as seen
			seen[ind] = 1;

			// If number of occupied computers is less than
			// n, then assign a computer to new customer
			if (occupied < n)
			{
				occupied++;

				// Set the current character as occupying a computer
				seen[ind] = 2;
			}

			// Else this customer cannot get a computer,
			// increment result
			else
				res++;
		}

		else
		{
			
		
		if (seen[ind] == 2)
			occupied--;
		seen[ind] = 0;
		}
	}
	return res;
}

// Driver program
public static void main(String[] args)
{
	System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray()));
	System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toCharArray()));
	System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toCharArray()));
	System.out.println(runCustomerSimulation(1, "ABCBCA".toCharArray()));
	System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray()));
}
}

// This code is contributed by Princi Singh
