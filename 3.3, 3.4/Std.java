package inh_0;

public class Std {
	// 멤버 변수 선언
	int id;
	String name;
	int score;

	// 생성자 정의
	Std(int a, String b, int c){
		id = a; name = b; score = c;
	}

	// 점수 변경 메소드
	void change(int d) {
		score = d;
	}

	// 정보 출력 메소드
	void pr() {
		System.out.println(id +" "+name+" "+score);
	}
}
