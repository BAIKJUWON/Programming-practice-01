package inh_0;

// 인터페이스 A를 구현하는 Circle 클래스를 정의합니다.
public class Circle implements A {

	// 인스턴스 변수 r을 선언합니다.
	int r;

	// 넓이를 계산하는 메서드를 재정의합니다.
	@Override
	public float area() {
		// 원의 넓이를 계산하여 반환합니다.
		return phi * r * r;
	}

	// Circle 클래스의 생성자를 정의합니다.
	Circle(int a){
		r = a; // 반지름을 초기화합니다.
	}

	// 도형의 차원을 변경하는 메서드를 정의합니다.
	void change(int a) {
		r = a; // 반지름을 변경합니다.
	}
}
