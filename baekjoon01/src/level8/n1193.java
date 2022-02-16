package level8;
/**
 * 분수찾기
 * 각 라인마다 존재하는 개수가 하나씩 증가한다.
 */
import java.io.*;
public class n1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long X=Integer.parseInt(br.readLine());
		long line=1, cnt=0; // cnt : 지금까지 확인한 분수들의 총개수
		
		
		while(true){//X번째 분수가 현재 몇번째 라인에 있는지 확인한다.
    		if(cnt+line>=X) break;
    		cnt += line;//라인별로 한개씩 개수가 증가함. 이전까지 찾은 분수들의 총 개수
    		line++;
    		}
		//System.out.println(line);
		
		//X-cnt : 해당 line에서 몇 번째에 있는 분수인지
		//대각선의 총합 : line+1
		if(line%2==0) System.out.println((X-cnt)+"/"+(line+1-(X-cnt)));
		else System.out.println((line+1-(X-cnt))+"/"+(X-cnt));
	}

}
