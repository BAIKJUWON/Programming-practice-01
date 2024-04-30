package inh_0;

public class StdDept extends Std {
	// 멤버 변수 선언
	String dept;
	String grade;

	// 생성자 정의
	StdDept(int a, String b, int c, String d, String e){
		super(a, b, c);
		dept = d;
		grade = e;
	}

	// 학과 변경 메소드
	void chgDept(String a) {
		dept = a;
	}

	// 학점 변경 메소드
	void chgGrade(int a) {
		if(a >= 90) grade = "A";
		else if (a >= 80) grade = "B";
		else if (a >= 70) grade = "C";
		else if (a >= 60) grade = "D";
		else grade = "F";
	}

	// 정보 출력 메소드
	void pr() {
		super.pr();
		System.out.println(dept + " " + grade);
	}
}
