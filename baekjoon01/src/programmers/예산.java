package programmers;
import java.util.*;
import java.io.*;

public class ¿¹»ê {

	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++) {
        	if(budget-d[i]>0) {
        		answer++;
        		budget-=d[i];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] d=new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			d[i]=Integer.parseInt(str[i]);
		}
		
	}

}
