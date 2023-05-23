import java.util.*;
import java.io.*;

public class Main2 {
	static File file = null;
	static final long mod = 1000000007;
	static Scanner sc = null;
	static BufferedReader br = null;

	static class Pair implements Comparable<Pair> {
		int value;
		int index;

		public Pair(int v, int i) {
			this.value = v;
			this.index = i;

		}

		public int compareTo(Pair p) {
			if (p.value == this.value)
				return (p.index - this.index);
			return p.value - this.value;
		}
	}

	/* ------------------- Solve Area ------------------------------- */
	private static void solve() {

		try {

			/***********************************************/

			/***********************************************/
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}

	}
	/* ------------------- create Integer Array ------------------------------- */
	static Integer[] createIntegerArray() throws IOException {
		String temp[] = br.readLine().split(" ");
		Integer[] arr = new Integer[temp.length];
		for (int i = 0; i < temp.length; i++)
			arr[i] = Integer.parseInt(temp[i]);
		return arr;
	}
	/* ------------------- create Long Array ------------------------------- */
	static Long[] creatLongArray() throws IOException {
		String temp[] = br.readLine().split(" ");
		Long[] arr = new Long[temp.length];
		for (int i = 0; i < temp.length; i++)
			arr[i] = Long.parseLong(temp[i]);
		return arr;
	}
	/* ------------------- create Integer Matrix ------------------------------- */
	static Long[][] createLongMatrix(int n, int m) throws IOException {
		String temp[] = br.readLine().split(" ");
		Long[][] arr = new Long[n][m];
		for (int i = 0; i < temp.length; i++)
			arr[i] = creatLongArray();
		return arr;
	}
	/* ------------------- Check Palindrome ------------------------------- */
	static boolean checkPalindrome(String s, int l, int r) {
		while (l <= r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	/* ------------------- GCD ------------------------------- */
	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	/* --------------- fast power ----------------------------- */
	static long fastPow(long base, long d, long m) {
		if (d == 0)
			return 1;
		long half = fastPow(base, d / 2, m);
		if (d % 2 == 0)
			return mul(half, half, m);
		return mul(half, mul(half, base, m), m);
	}
	static long mul(long a, long b, long m) {
		return a * b % m;
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
	/* ------------------- Ceil Fuction ------------------------------- */
	@SuppressWarnings("unused")
	private static long findCeilValue(long a, long b) {
		return (a + b - 1) / b;
	}
	/* ------------------- Find Primes ------------------------------- */
	@SuppressWarnings("unused")
	private static HashMap<Integer, Integer> findPrime(int n) {
		HashMap<Integer, Integer> primemap = new HashMap<>();
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0 && n >= i) {
				n = n / i;
				primemap.put(i, primemap.getOrDefault(i, 0) + 1);
			}
		}
		if (n > 1)
			primemap.put(n, primemap.getOrDefault(n, 0) + 1);
		return primemap;
	}
	/* ------------------- Sum of Digit ------------------------------- */
	@SuppressWarnings("unused")
	private static int sumOfDigits(long num) {
		int cnt = 0;
		while (num > 0) {
			cnt += (num % 10);
			num /= 10;
		}
		return cnt;
	}
	/* ------------------- isPerfectSquare ------------------------------- */
	@SuppressWarnings("unused")
	private static boolean isPerfectSquare(long num) {
		long sqrt = (long) Math.sqrt(num);
		return ((sqrt * sqrt) == num);
	}
	/* ------------------- Main Method ------------------------------- */
	public static void main(String[] args) throws IOException {
		file = new File("/home/deependra/Code/Eclipse/JavaPractise/src/temp.txt");
		
//  		sc=new Scanner(new FileReader(file));
//  		sc=new Scanner(System.in);

		br = new BufferedReader(new InputStreamReader(System.in));

//  		br=new BufferedReader(new FileReader(file));

		solve();
	}
}
