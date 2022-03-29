package programmers;

import java.io.*;

public class m2016³â {
	public static String solution(int a, int b) {
		String[] week= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int[] months= {31,29,31,30,31,30,31,31,30,31,30,31};
        int day=0;
        
        for(int i=1;i<a;i++) {
        	day+=months[i-1];
        }
        day+=b-1;
        return week[(day+5)%7];
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		System.out.println(solution(a,b));
	}

}
