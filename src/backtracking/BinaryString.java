package backtracking;

public class BinaryString {
	

	public static void main(String[] args) {
		
		int n = 4;
		int[] arr = new int[n];
		generateAllBinaryStrings(n, arr, 0);
	}

	private static void generateAllBinaryStrings(int n, int[] arr, int i) {
		if (i == n) {
			printTheArray(arr, n);
			return;
		}
		
		arr[i] = 0;
		generateAllBinaryStrings(n, arr, i + 1);
		
		
		arr[i] = 1;
		generateAllBinaryStrings(n, arr, i + 1);
		
		
		
	}

	private static void printTheArray(int[] arr, int n) {
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
