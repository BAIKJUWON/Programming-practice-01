package inh_0;

// Circle 클래스를 상속받는 Cone 클래스를 정의합니다.
public class Cone extends Circle {

	// 인스턴스 변수 h와 l을 선언합니다.
	int h;    // 원뿔의 높이
	float l;  // 원뿔의 대각선 길이

	// Cone 클래스의 생성자를 정의합니다.
	Cone(int a, int b) {
		super(a); // 부모 클래스의 생성자를 호출하여 반지름을 초기화합니다.
		h = b;    // 원뿔의 높이를 초기화합니다.
		l = (float)Math.sqrt(r*r+h*h); // 원뿔의 대각선 길이를 계산하여 초기화합니다.
	}

	// 도형의 겉넓이를 계산하는 메서드를 재정의합니다.
	public float area() {
		// 상속받은 Circle 클래스의 area 메서드를 호출하여 원뿔의 바닥면적을 구하고,
		// 원뿔의 측면적을 추가하여 반환합니다.
		return super.area() + phi*r*l;
	}

	// 도형의 차원을 변경하는 메서드를 정의합니다.
	void change(int a, int b) {
		super.change(a);  // 부모 클래스의 change 메서드를 호출하여 반지름을 변경합니다.
		h = b;            // 원뿔의 높이를 변경합니다.
		l = (float)Math.sqrt(r*r+h*h); // 원뿔의 대각선 길이를 다시 계산하여 초기화합니다.
	}

	// 도형의 부피를 계산하는 메서드를 정의합니다.
	float vol() {
		// 원뿔의 부피를 계산하여 반환합니다.
		return ((float)1/3)*super.area()*h;
	}
}
