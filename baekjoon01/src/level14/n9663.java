package level14;
/**
 * 원소값을 행, 각 원소의 index를 열로 생각한다.
 * queen은 같은 행, 같은 열, 대각선에 존재해서는 안된다.
 * ↓ 방향으로 깊이를 생각하고 탐색한다.
 * queen의 순서를 →방향을 채워나간다.
 */
import java.io.*;

public class n9663 {
	
	static int[] arr;
	static int count=0;
	public static void queen(int n, int depth) {
		
		if(depth==n) {
			count++;
			return;
		}
		
		for(int i=0;i<n;i++) { 
			arr[depth]=i;
			
			if(check(depth)) { //해당 자리에 넣어도 된다면
				queen(n, depth+1);
			}
		}
	}
	
	public static boolean check(int depth) { //지금까지 올려둔 queen 위치에 새로운 queen을 올려두면 영향이 끼치는지 아닌지 check

		for(int i=0;i<depth;i++) { // i==depth인 경우는 이미 해당 행에 queen이 존재하는 경우이므로 <=depth 제외
			if(arr[i]==arr[depth]) // 이미 해당 행에 queen이 존재한다면 false
				return false;
			
			if(Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) //이미 대각선 상에 queen이 존재한다면 false
				return false;
			//대각선 = 열의 차와 행의 차가 같다.
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		queen(n,0);
		System.out.println(count);
	}

}
