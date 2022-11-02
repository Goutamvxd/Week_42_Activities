package solutions;

import java.util.*;
/*
 * Harrypotter is visiting his uncle’s house ,the house of Black ,and ants to know more about the family through their ancestral tree.He notices that the ancestraltreebegins with the head of the family at the top,having 2 children as his descendants,This pattern is followed throught and each member is represented by unique integer.

Given relationships in the form ofan integer arraywhere the head of the family is at the first position (i=0) and his children areat position (2*i+1) and (2*i+2).

Your task is to help harry find and return all the siblings of any given family member and return them in the form of a sorted array.

Note:if there are no siblings ,return {-1}.

Example:

Input1:5

Input2:{1,2,3,4,5}

Input3:1

Output:{-1}
 */

public class HarryQuest {
	public static void main(String[] args) {
		int input1=5;
		int[] input2= {1,2,3,4,5};
		int input3=1;
		System.out.println(Arrays.toString(findSiblings(input1, input2, input3)));
	}


	public static int[] findSiblings(int input1, int[] input2, int input3) {
		int[] result = new int[] {-1};
		if (input2[0] == input3) {
		return result;
		}

		int siblingFindIndex = -1;
		for(int i=0;i<input2.length;i++){
		if(input2[i]==input3) { 
		siblingFindIndex = i;
		break; 
		}
		}
		if(siblingFindIndex>-1){ 
		result = new int[]{input2[siblingFindIndex-1],input2[siblingFindIndex+1]}; 
		
		}

		return result;
	}
}
		