package level8;
/**
 * 
 * 3�� ������ ���ҷ��� �迭�� ũ�Ⱑ 15�� ������ ������ �ֱ� ������ ����, �迭�� ���� �� �����Ѵ��� �˸��� �迭���� ����Ѵ�.
 * arr[i][j] = arr[i-1][j] + arr[i][j-1]; 
 */
import java.util.*;
public class n2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int cnt, b;
		int[][] arr;
		
		for(int i=0;i<t;i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			arr=new int[k][n];
			
			cnt=1;
			b=0;
			
			for(int j=0;j<n;j++) {
				arr[0][j]=cnt;
				cnt++;
			}
			
			cnt=0;
			
			for(int j=1;j<k;) {//0������ ����
				
				for(int s=0;s<=b;s++) {
					arr[j][b]+=arr[j-1][s];
				}
				
				b++;
				
				if(b>n-1) {
					b=0;
					j++;
				}
				
			}
			
			for(int j=0;j<n;j++) cnt+=arr[k-1][j];
			System.out.println(cnt);
			
		}
	}

}

/*
 * 2�� 1 4 10 20
	1�� 1 3 6 10
	0�� 1 2 3 4
*/
