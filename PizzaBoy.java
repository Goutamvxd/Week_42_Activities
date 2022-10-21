package solutions;

import java.text.DecimalFormat;

class PizzaBoy {

	public static void main(String[] args) {
	int in1=2,in2=3,in3[][]= {{0,0},{0,2},{2,0}};
	System.out.println(time(in1, in2, in3));
	
}
	static double time(int in1,int in2,int in3[][]) {
		double dist=0;
		for(int i=0;i<in3.length-1;i++) {
			for(int j=i+1;j<in3.length;j++) {
				double x1=in3[i][0];
				double x2=in3[j][0];
				double y1=in3[i][1];
				double y2=in3[j][1];
				
				double temp=Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
				
				if(temp>dist) {
					dist=temp;
				}
				
			}
		}
		DecimalFormat numberFormat=new DecimalFormat();
		String ans=numberFormat.format(dist/in1);
		return Double.parseDouble(ans);
	}
}