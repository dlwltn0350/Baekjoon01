package level7;

import java.util.*;

public class n2675 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int r;
		String s;
		
		for(int i=0;i<t;i++) {
			r=sc.nextInt();
			s=sc.next();
			
			for(int n=0;n<s.length();n++) {
				//System.out.print(s.charAt(j).repeat(r));
				for(int j=0;j<r;j++) {
					System.out.print(s.charAt(n));
				}
			}
			System.out.println();
		}
	}

}


//repeat�޼��� : java11���� ��밡��


/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	
	String[] str = br.readLine().split(" "); 
			
	int r = Integer.parseInt(str[0]);	// String -> int
	String s = str[1];
	
	//BufferedReader�� �����̽� ������ ���ϱ� ������ split�� �̿��Ͽ� �и����ش�

*/