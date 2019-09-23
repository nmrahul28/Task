package Task_LessThanThreeDigits;

public class Solution {
	public int solution(int A, int B) {
		int counter = 0;
		if(A==0 && B ==0){
			counter=counter+1;
		}
		for(int i =A;i<B;i++){
		int element = A;
		String str = Integer.toString(A);
		int zero = 0;
		int one = 0, two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		for(int index =0;index <str.length();index++){
		int remainder = element%10;
		element = element/10;
		switch(remainder){
		case 0:
		zero=zero+1;
		break;
	case 1:
		one=one+1;
		break;
	case 2:
		two=two+1;
		break;
	case 3:
		three=three+1;
		break;
	case 4:
		four=four+1;
		break;
	case 5:
		five=five+1;
		break;
	case 6:
		six=six+1;
		break;
	case 7:
		seven=seven+1;
		break;
	case 8:
		eight=eight+1;
		break;
	case 9:
		nine=nine+1;
		break;
	}
		}
		if( one<3 && two<3 && three<3 && four<3 && five<3 && six<3 && seven<3 && eight<3 && nine<3){
			counter=counter+1;
		}
	}
	return counter;
}
}
