import java.util.*;
/*
 *  임의의 자연수 N에 대하여, 그 수의 약수의 총합이 2N이 되는 경우에 N을 완전수(perfect number)라고 한다.
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
		if(n*2==sum) System.out.println(n+"은 완전수 입니다.");
		else System.out.println(n+"은 완전수가 아닙니다.");
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
