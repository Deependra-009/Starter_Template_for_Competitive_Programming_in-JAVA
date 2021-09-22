import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
public class starter_template {
	
/* ------------------- Main -------------------------------*/
	
	
    public static void main(String... args) throws IOException {
    	
    	
    	
    	PrintWriter out=new PrintWriter(System.out);
    	FastReader inp=new FastReader();
    	
    	int t=inp.nextInt();
    	while(t-->0) {
    		
    		//in object works same as Scanner Object but much faster
            //out.println() works faster than System.out.println()
            //Write your code here
    	}
    	
    	out.close();
    	
	
    }
	
	
	/* ------------------- FastReader  -------------------------------*/
	
	static class FastReader{
		
		BufferedReader br;
		StringTokenizer st;
		
		
		public FastReader() {
			
			br=new BufferedReader(new InputStreamReader(System.in));
			
		}
		String next() {
			while(st==null|| !st.hasMoreElements()) {
				try {
					st=new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() 
	    { 
	        return Long.parseLong(next()); 
	    } 

	    double nextDouble() 
	    { 
	        return Double.parseDouble(next()); 
	    } 
	    
	    String nextLine() {
	    	String str="";
	    	try {
	    		str=br.readLine();
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    	return str;
	    }

    
	} 
	
	
	/* ------------------- GCD -------------------------------*/
	
	static long gcd(long a, long b)
	{
	   if(b==0) {
		   return a;
	   }
	   return gcd(b,a%b);
	}
	/* --------------- fast power -----------------------------*/
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

}
