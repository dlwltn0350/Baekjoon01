package level8;
/**
 * �м�ã��
 * �� ���θ��� �����ϴ� ������ �ϳ��� �����Ѵ�.
 */
import java.io.*;
public class n1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long X=Integer.parseInt(br.readLine());
		long line=1, cnt=0; // cnt : ���ݱ��� Ȯ���� �м����� �Ѱ���
		
		
		while(true){//X��° �м��� ���� ���° ���ο� �ִ��� Ȯ���Ѵ�.
    		if(cnt+line>=X) break;
    		cnt += line;//���κ��� �Ѱ��� ������ ������. �������� ã�� �м����� �� ����
    		line++;
    		}
		//System.out.println(line);
		
		//X-cnt : �ش� line���� �� ��°�� �ִ� �м�����
		//�밢���� ���� : line+1
		if(line%2==0) System.out.println((X-cnt)+"/"+(line+1-(X-cnt)));
		else System.out.println((line+1-(X-cnt))+"/"+(X-cnt));
	}

}
