package solutions;
/*
 * you are given a string which you havte to convert into a palindrome such that each step involves swapping two adjecent character
 * .find minimum number of stepsit would take for you to do so.
 * 
 * Note:
 * 1) If the String could not be converted into a palindrome, retirn -1
 * 2) Also , if the given String is a palindrome , return 0.
 * 
 * input Specification.
 * 	input1:The String
 * 	
 *output Specification>
 *	The minimum number of steps to convert the string to palindrome, if not possible return -1.
 *
 *Example 1:
 *input1:ntiin
 *output:1
 *
 *Example 2:
 *input1:naman
 *output:0
 */

public class Swapper {

	public static void main(String[] args) {
	String s="hi";
	int k=palin(s);
	System.out.println(k);
}
	static int palin(String s1) {
		String s2="";
		int max=0;
		int min=s1.length();
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				s2=s1.substring(i,j);
				String temp="";
				
				for(int k=s2.length()-1;k>=0;k--) {
					temp+=s2.charAt(k);
				}
				if(temp.equals(s2) && temp.length()>max) {
					max=temp.length();
				}
				if(temp.equals(s2) && temp.length()<min) {
					min=temp.length();
				}
			}
		}
		return max-min;
	}
	/*
	 * public class Globals
{
   
    public static int minSwap(String s)
    {
        HashMap<Character, Integer> unmp = new HashMap<Character, Integer>();
        int odd = 0;
        int left = 0;
        int right = s.length() - 1;
        int result = 0;
 
        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (unmp.containsKey(c))
                unmp.put(c, unmp.get(c) + 1);
            else
                  unmp.put(c, 1);
        }
       
          for (Map.Entry i : unmp.entrySet())
        {
            int val = unmp.get(i.getKey());
            if(val % 2 == 1)
            {
              odd++;
            }
        }
 
        if (odd > 1)
        {
            return -1;
        }
 
        while (left < right)
        {
            int l = left;
            int r = right;
            while (s.charAt(l) != s.charAt(r))
            {
                r--;
            }
            if (l == r)
            {
 
                // when we found odd element
                  char ch1 = s.charAt(r), ch2 = s.charAt(r+1);
                s = s.substring(0, r) + ch2
                   + ch1 + s.substring(r + 2);
                result++;
                continue;
            }
            else
            {
                // Normal element
                while (r < right)
                {
                    char ch1 = s.charAt(r), ch2 = s.charAt(r+1);
                    s = s.substring(0, r) + ch2
                           + ch1 + s.substring(r + 2);
                    result++;
                    r++;
                }
            }
            left++; right--;
        }
        return result;
    }
 
    // Driver's code
    public static void main(String[] args)
    {
        String s = "aabcc";
        System.out.print(minSwap(s));
    }
}
	 */
}
