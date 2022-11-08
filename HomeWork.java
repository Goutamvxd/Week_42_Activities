package solutions;

public class HomeWork {

	public static void main(String[] args) {
	int n=4;
	int [] input1= {60,40,80,120};
	int[] input2= {1,2,2,2};
	System.out.println(work(n, input2, input2));
}
	static int work(int input1,int[] input2,int[] input3) {
		int sum=0;
		for(int i=0;i<input1;i++) {
			for(int j=i+1;j<input1;j++) {
				if(input3[i]==input3[j] && input2[i]!=0) {
					if(input2[i]>input3[j]) {
						input2[j]=0;
					}
					else {
						input2[i]=0;
					}
				}
			}
			if(input2[i]!=0) {
				sum+=sum+input2[i];
			}
		}
		return sum;
	}
}
