/*
 * 1. 정렬
 * 2. Arrays.sort의 new Comparator를 변경
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
			if(tmp[part1].length() <= tmp[part2].length()) { //글자길이
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
			if(!list.contains(arr[i])) { //중복제거를 위한 arraylist
				list.add(arr[i]);
			}
		}
		
		str=new String[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			str[i]=list.get(i);
		}

		Arrays.sort(str); //먼저 영문자 대로 정렬
		merge_sort();// 글자수대로 정렬
		
		for(int i=0;i<list.size();i++)
			System.out.println(str[i]);
	}

}

/*
 * 		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2); //사전 순 정렬
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length(); // s1-s2>0(양수) : 정렬알고리즘에 의해 자리가 바뀐다. 하지만 0이나 음수(s1-s2<0)는 서로 위치가 바뀌지 않음
				}
			}
		});
	*/
