import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	static File file;
	static BufferedReader br;

	/* ------------------- Solve Area ------------------------------- */
	private static void solve() {

		try {

			/***********************************************/
			
			
			
			
			
			/***********************************************/

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

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

	/* --------------- sieveOfEratosthenes ----------------------------- */

	static ArrayList<Integer> sieveOfEratosthenes(int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		boolean visit[] = new boolean[n + 1];
		Arrays.fill(visit, true);
		for (int i = 2; i * i <= n; i++) {

			if (visit[i] == true) {
				for (int j = i * i; j <= n; j += i) {
					visit[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (visit[i])
				ans.add(i);
		}
		return ans;
	}

	/* --------------- Merge Sort ----------------------------- */

	@SuppressWarnings("unused")
	private static void mergesort(int nums[], int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(nums, low, mid);
			mergesort(nums, mid + 1, high);
			merge(nums, low, mid, high);
		}
	}

	private static void merge(int nums[], int low, int mid, int high) {

		int l1 = mid - low + 1;
		int l2 = high - mid;

		int a1[] = new int[l1];
		int a2[] = new int[l2];

		for (int i = 0; i < l1; i++) {
			a1[i] = nums[i + low];
		}

		for (int i = 0; i < l2; i++) {
			a2[i] = nums[mid + i + 1];
		}

		int i = 0;
		int j = 0;
		int k = low;

		while (i < l1 && j < l2) {
			if (a1[i] <= a2[j]) {
				nums[k++] = a1[i++];
			} else {
				nums[k++] = a2[j++];
			}
		}
		while (i < l1) {
			nums[k++] = a1[i++];
		}
		while (j < l2) {
			nums[k++] = a2[j++];
		}
	}
	
	/* ------------------- Ceil Fuction ------------------------------- */
	
	@SuppressWarnings("unused")
	private static long findCeilValue(long a,long b) {
		return (a+b-1)/b;
	}

	/* ------------------- Main Method ------------------------------- */

	public static void main(String[] args) throws IOException {

		file = new File("/home/deependra/Code/Eclipse/JavaPractise/src/temp.txt");
		br = new BufferedReader(new FileReader(file));

//		br=new BufferedReader(new InputStreamReader(System.in));

		solve();

	}

}
