package programmers;

import java.io.*;

public class ³»Àû {
	public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i<a.length;i++) {
        	answer+=a[i]*b[i];
        }
        
        return answer;
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] a=new int[str.length];
		for(int i=0;i<str.length;i++) {
			a[i]=Integer.parseInt(str[i]);
		}
		str=br.readLine().split(" ");
		int[] b=new int[str.length];
		for(int i=0;i<str.length;i++) {
			b[i]=Integer.parseInt(str[i]);
		}
		
		System.out.println(solution(a,b));
	}

}
