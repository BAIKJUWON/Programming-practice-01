package inh_0;

public class Std {
	int id;
	String name;
	int score;

	// 생성자: 학생의 id, 이름, 점수를 초기화합니다.
	Std(int a, String b, int c){
		id = a; name = b; score = c;
	}

	// 점수 변경 메소드
	void change(int d) {
		score = d;
	}

	// 학생 정보 출력 메소드
	void pr() {
		System.out.println(id +" "+name+" "+score);
	}
}
