package pn_0;

public class Pn_1 {
	int s = 0;

	// 소수 구하는 메소드
	void Prime(int a, int b) {
		for (int i = a; i <= b; i++) {
			int j;
			for (j = 2; j < i; j++)
				if (i % j == 0) break;
			if (j == i) {
				System.out.println(j);
				s += j;
			}
		}
	}

	// 합계 출력 메소드
	void Pr() {
		System.out.println("\nsum = " + s);
	}
}
