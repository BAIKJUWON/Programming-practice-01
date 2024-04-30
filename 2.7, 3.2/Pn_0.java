package pn_0;

import java.util.Scanner;

public class Pn_0 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in); // Scanner 객체를 inp로 사용

		System.out.println("Input two numbers:"); // 두 수를 입력받음

		int a = inp.nextInt(); // 변수 a값을 입력받음
		int b = inp.nextInt(); // 변수 b값을 입력받음

		Pn_1 p = new Pn_1();

		p.Prime(a, b);

		p.Pr();
	}
}

