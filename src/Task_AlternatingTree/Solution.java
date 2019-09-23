package Task_AlternatingTree;

public class Solution {
	public static int checkSign(int A[]) {
		int prev_difference=0;
		for(int i=0;i<A.length-1;i++) {
		int current_difference=A[i]-A[i+1];
		if(i==0) {
			prev_difference= -current_difference;
		}
		if(prev_difference>0 && current_difference<0) {
			prev_difference= current_difference;
			continue;			
		}else if(prev_difference<0 && current_difference>0) {
			prev_difference= current_difference;
			continue;
		}else if(current_difference ==0)
			return -1;
		else
			return -1;
		
		}
		
		return 1;
	}
	public int solution(int A[]) {
		int final_counter=0;
		if(checkSign(A)==1) {
			return 0;
		}
		int tempArray[]=A.clone();
		for(int index=0;index<A.length;index++) {
		 A=tempArray;
		 int counter=0;
			int newArray[]= new int[A.length-1];
			for(int i=0;i<A.length;i++) {
				if(i== index) {
					continue;
				}
				newArray[counter++]=A[i];
			}
			A=newArray;
         if(checkSign(A)==1) {
        	 final_counter=final_counter+1;
        	 }
         }
		if(final_counter==0)
			return -1;
		else
			return final_counter;
		
	}

}
