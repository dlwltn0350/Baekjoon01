package level16;
import java.io.*;
import java.util.Arrays;
public class n1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		//boolean[] compare= new boolean[Integer.MAX_VALUE-5];
		boolean[] compare= new boolean[25];
		Arrays.fill(compare, false);
		
		for(int i=0;i<n;i++) {
			String[] str=br.readLine().split(" ");
			time[i][0]=Integer.parseInt(str[0]); //회의시작시간
			time[i][1]=Integer.parseInt(str[1]); //종료시간
		}
		
		int cnt=0;
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			for(int j=time[i][0]+1; j<time[i][1]; j++) {
				if(compare[j]==true && flag==false) { //시간이 다른 회의와 겹치는 경우
					flag=true;
				}
				compare[j]=true;
			}
			if(time[i][0]==time[i][1] && compare[time[i][0]]==true) flag=true;
			
			if(flag==false) {
				cnt++;
				//System.out.println(i);
			}
			flag=false;
		}
		
		System.out.println(cnt);
	}

}
