// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
public class LinearSearch
{
	// This function returns index of element x in arr[]
	static int search(int arr[], int n, int x)
	{
		for (int i = 0; i < n; i++)
		{
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}
	public static void main (String[] args) {
	    int[] a={10,20,30,55,88};
	    int n=a.length;
	    int x=88;
	    int p=search(a,n,x);
	    System.out.println(p);
	}
}
