/*
 * 1. ����
 * 2. Arrays.sort�� new Comparator�� ����
 */
package level12;

import java.io.*;
import java.util.*;

public class n1181 {

	static String[] str;
	static String[] tmp;
	
	public static void merge_sort() {
		tmp=new String[str.length];
		merge_sort(0,str.length-1);
	}
	private static void merge_sort(int start, int end) {
		int mid;
		
		if(start<end) {
			mid=(start+end)/2;
			merge_sort(start,mid);
			merge_sort(mid+1,end);
			merge(start,mid,end);
		}
	}
	private static void merge(int start, int mid, int end) {
		tmp=str.clone();
		
		int part1=start;
		int part2=mid+1;
		int index=start;
		
		while(part1<=mid && part2<=end) {
			if(tmp[part1].length() <= tmp[part2].length()) { //���ڱ���
				str[index++]=tmp[part1++];
			}
			else {
				str[index++]=tmp[part2++];
			}
		}
		
		for(int i=0;i<=mid-part1;i++) {
			str[index+i]=tmp[part1+i];
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] arr=new String[n];
		List<String> list=new ArrayList();
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
			if(!list.contains(arr[i])) { //�ߺ����Ÿ� ���� arraylist
				list.add(arr[i]);
			}
		}
		
		str=new String[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			str[i]=list.get(i);
		}

		Arrays.sort(str); //���� ������ ��� ����
		merge_sort();// ���ڼ���� ����
		
		for(int i=0;i<list.size();i++)
			System.out.println(str[i]);
	}

}

/*
 * 		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// �ܾ� ���̰� ���� ��� 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2); //���� �� ����
				} 
				// �� ���� ��� 
				else {
					return s1.length() - s2.length(); // s1-s2>0(���) : ���ľ˰��� ���� �ڸ��� �ٲ��. ������ 0�̳� ����(s1-s2<0)�� ���� ��ġ�� �ٲ��� ����
				}
			}
		});
	*/
