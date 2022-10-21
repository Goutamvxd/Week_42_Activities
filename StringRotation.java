package solutions;

public class StringRotation {
	
	public static void main(String[] args) {
	String a="abc";
		int n=3;
		System.out.println(find(a, n));
	}
	static int find(String a,int n) {
		int count=0;
		String s[]=a.split(" ");
		String sample;
		
		for(int i=0;i<s.length;i++) {
			sample=s[i].substring(n%s[i].length())+s[i].substring(0,n%s[i].length());
			
			if(s[i].equalsIgnoreCase(sample)) {
				count ++;
			}
		}
		return count;
	}

}
