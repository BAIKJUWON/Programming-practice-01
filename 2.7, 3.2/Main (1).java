package inh_0;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		// 학생 객체 생성과 초기화
		StdDept p = new StdDept(101, "kim", 80, "ce", "F");


        //교수 객체 생성과 초기화
		prof q = new prof(102, "kang");


		// 초기 정보 출력
		p.pr();
		q.pr();

		// 변경할 점수와 학과 입력
		int s = inp.nextInt();
		String d = inp.next();

		// 학과 변경, 점수 변경, 학점 변경
		p.chgDept(d);
		p.change(s);
		p.chgGrade(s);

		// 변경된 정보 출력
		p.pr();
	}
}
