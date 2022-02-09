package level6;
/**
 * ÇÑ¼ö
 */
import java.util.*;

public class n1065 {
	
	public static int d(int i) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int diff=0;
		boolean flag=true;
		
		while(true) {
			if(i/10<=0) {
				arr.add(i%10);
				break;
			}
			arr.add(i%10);
			i=i/10;
		}
		
		if(arr.size()>1) {
			for(int j=1;j<arr.size()-1;j++) {
				diff = arr.get(j)-arr.get(j+1);
				if(arr.get(j-1)-arr.get(j)!=diff) flag=false;
			}
		}
		arr.clear();
		if(flag==true) return i;
		else return 0;
	}

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0, cnt=0;
		
		for(int i=1;i<=n;i++) {
			s=d(i);
			if(s>0) cnt++;
		}
		System.out.println(cnt);
	}
}
