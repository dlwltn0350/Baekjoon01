import java.util.*;
import java.io.*;

public class 에라토스테네스의체 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime , true);
		
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2; i*i<=n; i++){
			if(isPrime[i]){
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;                
				}
			}        
		}    
		
		for(int i=1; i<=n ;i++){
			if(isPrime[i]) System.out.print(i+" ");        
		}
	}

}
