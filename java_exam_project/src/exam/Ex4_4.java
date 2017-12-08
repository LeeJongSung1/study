package exam;

public class Ex4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		while (sum <= 100) {
			cnt++;
			if (cnt % 2 == 0) {
				sum = sum - cnt;
			} else {
				sum = sum + cnt;
			}

		}
		System.out.println("cnt=" + cnt);
		System.out.println("sum=" + sum);
		int cnt2 = 0;
		boolean TF=true;
		while (TF) {
			cnt2++;
			System.out.println("cnt2:" + cnt2);
			if (cnt2 > 10) {
				TF=false;
			}
		}

	}
}
