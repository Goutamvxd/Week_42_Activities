package solutions;

import java.util.HashSet;

/*
 *  Serena has a garden with N flower pots arranged in a row  
 *  Every morning she walks through the row and plucks flowers She targets to visit the 
 *  first K pots in the row
Find the number of different flowers that Serena would pluck on an angle walk through the k pots

Input Specification:

input1: N, number of flower pots in Serena's garden 
input2: K number of pots Serena visits one walk 
inputs: An array containing pot index P to represent each pot by unique numbers (1<=P<=1000). 
pots having the same flower will have the same pot index

Output Specification:

Your function should return the number of different flowers plucked by Serena

Example 1:

Input1: 5
Input2 : 3
Input3: (1,1,2,1,5)
Output: 2
Explanation:
Till the 3 d pot, Serena could find only 2 distinct flowers (1,2).    

Example 2:

Input1 :10
input2:7
input3 (2,1,2,1,3.1,4,5,6,1)
Output 4
Explanation:
Till the 7th pot. Serena could find only 4 distinct flowers (1,2.3,4).    
 */

public class SerenaAndFlower {

	public static void main(String[] args) {
	
		int inpu1=10;
		int input2=7;
		int[] input3= {2,1,2,1,3,1,4,5,6,1};
		System.out.println(flower(inpu1, input2, input3));
}
	static int flower(int noOfPots,int vistedPots,int[] potsArray) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<noOfPots;i++) {
			if(i<vistedPots) {
				hs.add(potsArray[i]);
			}
		}
		return hs.size();
	}
	
}
