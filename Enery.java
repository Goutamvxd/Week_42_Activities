package solutions;

public class Enery {

	public static void main(String[] args) {

		int src = 2;
		int dst = 3;
		System.out.println(photons(src, dst));

	}

	static int photons(int src, int dst) {
		int power = -1;
		while (src != dst) {
			power--;

			if (src > dst) {
				src = src / 2;

			} else {
				dst = dst / 2;
			}
		}
		return power;

	}

}
