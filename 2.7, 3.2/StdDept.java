package inh_0;

public class StdDept extends Std {
	String dept;
	String grade;

	// 생성자: 학생의 id, 이름, 점수, 학과, 학점을 초기화합니다.
	StdDept(int a, String b, int c, String d, String e){
		super(a, b, c); // 상위 클래스의 생성자 호출
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

	// 학생 정보 및 학과, 학점 출력 메소드
	void pr() {
		super.pr(); // 상위 클래스의 정보 출력 메소드 호출
		System.out.println(dept + " " + grade);
	}
}
