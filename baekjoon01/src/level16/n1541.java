package level16;

import java.io.*;

public class n1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subtraction=br.readLine().split("-"); //-�� �������� �и� -> �����κ��� �����ִ�.(�������� ó���ϰ� ����ó���ϱ� ����)
		
		int sum=0;
		int result=0;
		for(int i=0;i<subtraction.length;i++) {
			sum=0;
			
			String[] addition=subtraction[i].split("\\+");
			
			for(int j=0;j<addition.length;j++) {
				sum+=Integer.parseInt(addition[j]);
			}
			if(i==0) result+=sum;
			else result-=sum;
		}
		
		System.out.println(result);
	}

}
