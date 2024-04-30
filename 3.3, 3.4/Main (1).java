package inh_0;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		// StdDept 객체 생성과 초기화
		StdDept p = new StdDept(101, "kim", 80, "ce", "F");

		// 학생 정보 출력
		p.pr();

		// 사용자로부터 입력 받기
		int s = inp.nextInt();
		String d = inp.next();

		// 학과 변경 메소드 호출
		p.chgDept(d);
		// 성적 변경 메소드 호출
		p.change(s);
		// 학점 변경 메소드 호출
		p.chgGrade(s);
		// 변경된 학생 정보 출력
		p.pr();
	}
}
