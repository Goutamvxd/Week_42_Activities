package solutions;
/*
 * One of the streets in your city has a total of L street lights. Each light i covers the street from
Xi to Yi distance. Find the length of street covered with light.
Input Specification:
input1: L, denoting the number of street lights.
input2: An array of L* 2 elements. For each row i, (Xi, Yi) denote that the
street light i covers the distance from Xi to Yi.
Output Specification:
Your function should return the length of the street covered with light.
Example 1:
input1: 1,
input2: {{5,10} }
Output: 5​
 */
import java.util.TreeSet;

public class StreetLight {
	public static void main(String[] args) {
		int [][] in= {{5,10}};
		int count=streetLight(in.length,in);
		System.out.println(count);
	}
	public static int streetLight(int size,int[][] in) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0;i<in.length;i++) {
			for(int j=in[i][0];j<in[i][1];j++) {
				t.add(j);
			}
		}
		return t.size();
	}

}
