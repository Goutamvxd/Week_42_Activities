package solutions;
/*
 * 

Doug is fond of change, every now and then he tries to do new things. This time, he caught up with a rod comprising of negative (N) and positive (P) charges. He is asked to calculate the maximum net electrostatic field possible in the region due to the rod.
Note: Assume Electrostatic Field = Total charge * 100
Input specification:
Input 1: Integer array denoting the magnitude of each charge.
Input 2: String denoting nature of each charge ith represents a sign of charge at ithentry represents a sign of charge at ith location in input1
Input 3: No of charges it holds (length of input1)
Output Specification:
Return the next maximum electrostatic field possible in the rod.
Example 1:
Input 1: {4,3,5}
Input 2: PNP
Input 3: 3
Output: 600
Explanation:
The maximum electric charge on the rod is 4-3+5 = 6 units. So the magnitude of the electric field would be 6*100=600
Example 2:
Input 1: {2,3}
Input 2: PN
Input 3: 2
Output : 100
Explanation:
The maximum possible electric charge on the section of the rod is 2-3=-1 unit.

 */

public class Electrostatic {
	
	public static void main(String[] args) {
		int[] input1= {2,3};
		String input2="pn";
		int input3=2;
		System.out.println(es(input1, input2, input3));
	}
	static int es(int[] input1,String input2,int input3) {
		int sum=0;
		for(int i=0;i<input3;i++) {
			if(input2.charAt(i)=='p') {
				sum +=input1[i];
			}
			else {
				sum-=input1[i];
			}
		}
		if(sum>0) {
			return sum*100;
		}
		else
			return -sum*100;
	}

}
