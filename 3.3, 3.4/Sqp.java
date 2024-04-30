package inh_0;

public class Sqp implements A {

	// 인스턴스 변수 선언
	int w,l,h;
	float k1, k2;

	// 인터페이스 A의 area 메서드 재정의
	@Override
	public float area() {
		// 사각뿔의 겉넓이 계산하여 반환
		return w*l + w*k1 + l*k2;
	}

	// 사각뿔 클래스의 생성자
	Sqp(int a, int b, int c){
		w = a; l = b; h = c;
		k1 = (float)Math.sqrt((w/2)*(w/2)+h*h);
		k2 = (float)Math.sqrt((l/2)*(l/2)+h*h);
	}

	// 차원을 변경하는 메서드 정의
	void change(int a, int b, int c) {
		w = a; l = b; h = c;
		k1 = (float)Math.sqrt((w/2)*(w/2)+h*h);
		k2 = (float)Math.sqrt((l/2)*(l/2)+h*h);
	}

	// 부피를 계산하는 메서드 정의
	float vol() {
		return ((float)1/3)*w*l*h;
	}
}