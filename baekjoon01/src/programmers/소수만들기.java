package programmers;

import java.io.*;
import java.util.ArrayList;

public class 소수만들기 {
	public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			//if(!list.contains(nums[i]+nums[j]+nums[k]))
        				list.add(nums[i]+nums[j]+nums[k]);
        		}
        	}
        }

        
        boolean flag=true;
        for(int i=0;i<list.size();i++) {
        	
        	for(int j=2;j<list.get(i);j++) {
        		if(list.get(i)%j==0) flag=false;
        	}
        	
        	if(flag==true) {
        		//System.out.println(list.get(i));
        		answer++;
        	}
        	flag=true;
        }
        
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int[] nums=new int[str.length];
		for(int i=0;i<nums.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		
		System.out.println(solution(nums));
	}

}
