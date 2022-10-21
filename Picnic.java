package solutions;

public class Picnic {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 4, 4 };
		int n = arr.length;
		int res = 0;
		res = find(n, arr);
		System.out.println(res);
	}

static int find(int n, int[] arr) {
///­­­­­­­start­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
int y=0,i,j,count=0;
for(i=1;i<n;i++){
for(j=i-1;j>=y;j--){
if(arr[i]==arr[j]){
count++;
if(i==n-2)
break;;
y=i+1;
i=i+1;
break;
}
}
if(i==n-2 && arr[i]==arr[j]){
break;
}
}
return count;
}
}
