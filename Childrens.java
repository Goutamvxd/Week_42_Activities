package solutions;

/*
 *  Children's day On children's day, a teacher wants to distribute candies to all her students. 
 * She has N candies, and each candy has a special value. 
 * She wants all candies to have the same special value so she decides to reduce the special values of some candies. 
 * However, the special values of all the candies cannot be reduced. 
 * Hence, she decides to reduce the special values for as much candies as 
 * possible so that at least K candies have the same special value and this value
 *  must be as large as possible. 
 *  Find the maximum value that the teacher can achieve 
 *  
 *  Input Specification: 
 *  input1: N, total number of candies 
 *  input2: K, candies having the same special value 
 *  input3: The array representing the special values of the candies with in
 *  
 *   Output Specification: Return the maximum value that the teacher can achieve. 
 *   
 *   Example 1: 
 *   input1:3 
 *   input2: 2 
 *   input3: (26,20,23} 
 *   Output: 23 
 *   
 *   Explanation: Here, the teacher can reduce the special value of the first candy to 23 and thus, 
 *   at least two candies will have the special value of 23. Explanation: Here,
 *    the teacher can reduce the special value of the first candy to 23 and thus,
 *     at least two candies will have the special value of 23. 
 *     
 *     Example 2: 
 *     input1: 6 
 *     input2: 4 
 *     input3: {100, 20, 40, 20, 50, 50} 
 * 	    Output: 40 
 * 
 */
 
public class Childrens {

	public static void main(String[] args) {
	
	int input1=6;
	int input2=4;
	int[] input3= {100,20,40,20,50,50};
	System.out.println(candies(input1, input2, input3));
}
	static int candies(int input1,int input2,int[] input3) {
		int i,temp;
		for(i=0;i<input1;i++) {
			for(int j=i+1;j<input1;j++) {
				if(input3[i]<input3[j]) {
					temp=input3[i];
					input3[i]=input3[j];
					input3[j]=temp;
				}
			}
			if(i+1==input2) {
				break;
			}
		}
		return input3[i];
	}
}
