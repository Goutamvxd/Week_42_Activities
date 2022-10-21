package solutions;

import java.util.ArrayList;

public class WeddingPlan {
public static void main(String[] args) {
	String s="12345";
	int x=1;
	System.out.print(count(s, x));
}
static int count(String s,int x) {
	int a=0;
	String temp="";
	ArrayList<Integer> d=new ArrayList<Integer>();
	for(int i=0;i<s.length();i++) {
		if(Integer.parseInt(temp + s.charAt(i))<=x) {
			temp +=s.charAt(i);
		}
		else {
			d.add(Integer.parseInt(temp));
			temp=s.charAt(i)+"";
		}
	}
	d.add(Integer.parseInt(temp));
	for(int i=0;i<d.size();i++) {
		System.out.println(d.get(i));
		if(d.get(i)<=x) {
			a++;
		}
	}
	return a;
}
}