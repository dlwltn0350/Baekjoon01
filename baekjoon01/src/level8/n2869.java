package level8;
/*
 * �����̴� �ö󰡰� �ʹ�
 * �ݺ����� ������� �ʰ� ������ �ذ��ؾ� �Ѵ�. -> �ð������� ��
 */
import java.io.*;
public class n2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str= br.readLine().split(" ");
		
		long A=Integer.parseInt(str[0]);
		long B=Integer.parseInt(str[1]);
		long V=Integer.parseInt(str[2]);
		
		long cnt=(V-B)/(A-B);
	
		if((V-B)%(A-B)!=0) cnt++;
		System.out.println(cnt);
		
		/*long height=0,cnt=0;
		
		while(true) {
			cnt++;
			height+=A;
			if(height>=V) break;
			height-=B;
		}
		
		System.out.println(cnt);*/
	}

}
