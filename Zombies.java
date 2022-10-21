package solutions;

/*
 *  In a country of zombies each city has a certain percentage of zombies. Cities are designated as
	1. A city[i] is magical if city[i] and city[i+1] have no common divisor other than 1.
	2. A city is good if the percentage of zombies in the city[i] is more than percentage of zombies in city[i+1] 
	
Find a city that is perfect, where perfect means both good and magical,
if there are more than one perfect cities, output the left-most city index. Also, the minimum number of cities in a country is 2 and there will be at least one perfect city

Input Specification:

input1: An array representing the percentage of zombies in each city 
input2: Number of cities in the country

Output Specification:

Return the favourable city index "i"

Example 1:

input1: (1,1,3,6,7,3) 
input2: 6
output: 4
Explanation: city[4] = 7 

 */

public class Zombies {

	public static void main(String[] args) {

		int in[] = { 1, 1, 3, 6, 7, 3 };
		int input2 = 6;
		int count = perfectCity(in, input2);
		System.out.println(count);
	}

	static int perfectCity(int input1[], int input2) {
		int flag = 0;
		for (int i = 0; i < input2; i++) {
			if (input1[i] > input1[i + 1]) {
				for (int j = 2; j < Math.sqrt(input1[i]); j++) {
					if (input1[i] % j == 0 && input1[i + 1] % j == 0) {
						flag = 1;
					}
				}
				if (flag == 0) {
					return i;
				}
			}
		}
		return 0;
	}

}
