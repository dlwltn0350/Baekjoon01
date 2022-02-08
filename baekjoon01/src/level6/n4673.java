package level6;
/**
 * ¼¿ÇÁ³Ñ¹ö
 *
 */
import java.util.*;
public class n4673 {
	
	public static int d(int i) {
		int sum=i;
		while(true) {
			sum+=(i%10);
			if(i<10) {
				sum+=(i/10);
				break;
			}
			i=i/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1;i<10001;i++) {
			arr.add(d(i));
		}
		
		for(int i=1;i<10001;i++) {
			if(!arr.contains(i)) System.out.println(i);
		}
		
		
	}

}
