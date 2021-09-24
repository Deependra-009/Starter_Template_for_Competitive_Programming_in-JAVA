import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class starter_template {

	/* ------------------- Main ------------------------------- */

	public static void main(String... args) throws IOException {

		PrintWriter out = new PrintWriter(System.out);
		FastReader inp = new FastReader();
		
		try {
			
		}
		catch(Exception e) {
			
		}
		
		
        

        
		
		out.close();

	}

	/* ------------------- FastReader ------------------------------- */

	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {

			br = new BufferedReader(new InputStreamReader(System.in));

		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] stringarray() throws IOException {
			String arr[] = br.readLine().split(" ");
			return arr;
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
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	  
	static int partition(int[] arr, int low, int high)
	{
	    int pivot = arr[high]; 
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot) 
	        {
	            i++; 
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	static void sort(int[] arr, int low, int high)
	{
	    if (low < high) 
	    {
	        int pi = partition(arr, low, high);
	        sort(arr, low, pi - 1);
	        sort(arr, pi + 1, high);
	    }
	}
	

}
