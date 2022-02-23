package level11;
/*
 * 분해합
 * 4673문제(셀프넘버)와 연계?
 */
import java.io.*;
public class n2231 {
	
	public static int d(int i, int n) {
		int sum=i;
		
		while(true) {
			sum+=(i%10);
			if(i<10) break;
			i=i/10;
		}
		
		if(sum==n) return 1;
		else return 0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tmp, i;
		for(i=0; i<n; i++) {
			tmp=d(i, n);
			if(tmp == 1) {
				System.out.println(i);
				break;
			}
		}
		if(i==n) System.out.println(0);
	}

}
