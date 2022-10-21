package solutions;
/*
 * You write a love letter to you friend. However, before your friend can read it, someone else read it and rotates the characters of each word to the right K times. Find the number of words that remain the same even after this shifting of letters.

Note: There can be more than one spaces between the words.

Input specifications:

Input1: String of words

Input2: K number of times rotation happens

Output specifications:

Your function should return the numbers of correct words.

Example 1:

Input1: llohe ereth

Input 2: 2

Output: 0

Explanation: In example 1, "llohe ereth" is a rotated string with K factor 2. Hence after moving the last two letters of right to left , we get the original string as "Hello there".

Example 2:

Input1: adaada

Input 2: 3

Output: 1

Explanation: In example 2, "adaada" when rotated 3 times gives back "adaada". Hence answer is 1.
 */
public class LoveLetter {
	public static void main(String args[])
	{
		/*
		 * nput1: adaada

Input 2: 3

Output: 1
		 */
	    String str="llohe ereth";
	    int n=2;
	    solution(str,n);
	}
	

	public static void solution(String str,int n)
	{
	    int l=str.length();
	    String a[]=str.split("\\s+");
	    String str1="";
	    int c=0;
	    for(int i=0;i<a.length;i++)
	    {
	        String s=a[i];
	        String k=rightrotate(s,n);
	        if(a[i].equals(k)){
	            c++;
	        }
	        else
	            continue;
	    }
	    System.out.println(c);
	}
	static String rightrotate(String str, int d)
	{
	    d=str.length()-d;
	    String ans = str.substring(d) + str.substring(0, d);
	    return ans;
	}

}
