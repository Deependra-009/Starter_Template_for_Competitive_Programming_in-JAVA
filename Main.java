import java.util.*;
import java.io.*;

public class Main {

	static File file;
	static BufferedReader br;

	/* ------------------- Solve Area ------------------------------- */
	private static void solve() {
		
		try {
			
			
			
		}catch(Exception e) {
			
		}
		
	}

	/* ------------------- Main Method ------------------------------- */

	public static void main(String[] args) throws IOException {

 		file = new File("/home/deependra/Code/Eclipse/JavaPractise/src/temp.txt");
 		br = new BufferedReader(new FileReader(file));

//		br=new BufferedReader(new InputStreamReader(System.in));

		solve();

	}

	/* ------------------- GCD ------------------------------- */

	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	/* --------------- fast power ----------------------------- */
	static long fastPow(long base, long exp, long m) {
		if (exp == 0)
			return 1;
		long half = fastPow(base, exp / 2, m);
		if (exp % 2 == 0)
			return mul(half, half, m);
		return mul(half, mul(half, base, m), m);
	}

	static long mul(long a, long b, long m) {
		return a * b % m;
	}

	/* --------------- sort ----------------------------- */
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

}
