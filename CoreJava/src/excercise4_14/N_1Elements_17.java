package excercise4_14;

public class N_1Elements_17 {
	static void findMissing(int a[], int b[], int n, int m) {
		for (int i = 0; i < n; i++) {
			int j;

			for (j = 0; j < m; j++)
				if (a[i] == b[j])
					break;

			if (j == m)
				System.out.print(a[i] + " ");
		}
	}

// Driver Code
	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 3, 4, 5 };
		int b[] = { 4, 2, 6, 5, 1 };

		int n = a.length;
		int m = b.length;

		findMissing(a, b, n, m);
}
	}
