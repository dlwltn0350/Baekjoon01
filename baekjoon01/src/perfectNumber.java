import java.util.*;
/*
 *  ������ �ڿ��� N�� ���Ͽ�, �� ���� ����� ������ 2N�� �Ǵ� ��쿡 N�� ������(perfect number)��� �Ѵ�.
 * */
public class perfectNumber {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		/*
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		if(n*2==sum) System.out.println(n+"�� ������ �Դϴ�.");
		else System.out.println(n+"�� �������� �ƴմϴ�.");
		System.out.println("sum :"+sum);
		*/
		
		int cnt=0, i=1;
		while(true) {
			sum=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(i*2==sum) cnt++;
			if(cnt==k) break;
			i++;
		}
		System.out.println(i);
	}
}
