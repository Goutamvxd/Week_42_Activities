package solutions;

public class LostInForest {
	public static void main(String[] args) {
		int in1 = 10;
		int n = find(in1);
		System.out.println(n);
	}

	static int find(int m) {
		/// ­­­­­­­start­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
		int[] fin = new int[m];
		for (int i = 1; i <= m; i++) {
			int count = 0;
			int sum = i;
			do {
				if (sum % 2 == 0) {
					sum = sum / 2;
					count++;
				} else {
					sum = (3 * sum) + 1;
					count++;
				}

			} while (sum != 1);
			fin[i - 1] = count;
		}
		int max = fin[0];
		int index = 0;
		for (int i = 0; i < m; i++) {
			{
				if (max < fin[i]) {
					max = fin[i];
					index = i;
				}
			}

		}
		return index + 1;
	}
}
