package solutions;

import java.util.Arrays;
import java.util.Comparator;

public class PickThePoint {
	
	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 2, 5 }, { 6,9 } };

		int N = arr.length;

		System.out.print(cntMinSteps(arr, N));
	}

	public static void sortbyColumn(int arr[][], int col) {

		Arrays.sort(arr, new Comparator<int[]>() {

			public int compare(final int[] entry1, final int[] entry2) {

				if (entry1[col] > entry2[col])
					return 1;
				else
					return -1;
			}
		});
	}

	static int cntMinSteps(int[][] arr, int N) {

		int cntSteps = 1;

		sortbyColumn(arr, 1);

		int Points = arr[0][1];

		for (int i = 0; i < N; i++) {

			if (arr[i][0] > Points) {

				cntSteps++;

				Points = arr[i][1];
			}
		}
		return cntSteps;
	}

}
