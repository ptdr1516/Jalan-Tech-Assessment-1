import java.util.Scanner;

public class RearrangeArrays {
	
	public static void rearrange(int arr[], int n) {
        // initialize index of first minimum and first maximum element
		int min = 0;
        int max = n - 1;
		 
        // store maximum element of array
        int max_elem = arr[n - 1] + 1;
 
        for(int i = 0; i < n; i++) {
            // at even index : we have to put maximum element
        	// at odd index : we have to put minimum element
            if (i % 2 == 0) {
                arr[i] += (arr[max] % max_elem) * max_elem;
                max--;
            } else {
                arr[i] += (arr[min] % max_elem) * max_elem;
                min++;
            }
        }
 
        // array elements --> to it's original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int T = s.nextInt();

		while(T != 0) {
			System.out.println("Enter the length of array: ");
			int n = s.nextInt();
			int arr[] = new int[n];

			System.out.println("Enter the elements of the array: ");

			for(int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			System.out.println("Original Array: ");
			for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
			
            rearrange(arr, n);
			
	    System.out.print("\nModified Array: \n");
	    for (int i = 0; i < n; i++)
	         System.out.print(arr[i] + " ");
	    T--;
	}
    }
}
