package inh_0;

// Circle 클래스를 상속받는 Cylinder 클래스를 정의합니다.
public class 	Cylinder extends Circle {

	// 인스턴스 변수 h를 선언합니다.
	int h;

	// Cylinder 클래스의 생성자를 정의합니다.
	Cylinder(int a, int b){
		super(a); // 부모 클래스의 생성자를 호출하여 반지름 초기화
		h = b;    // 높이를 초기화
	}

	// 도형의 겉넓이를 계산하는 메서드를 재정의합니다.
	public float area() {
		// 상속받은 Circle 클래스의 area 메서드를 호출하여 원통의 원의 면적을 구하고,
		// 원통의 옆면의 면적을 추가하여 반환합니다.
		return super.area() * 2 + (h * 2 * phi * r);
	}

	// 도형의 차원을 변경하는 메서드를 정의합니다.
	void change(int a, int b) {
		super.change(a); // 부모 클래스의 change 메서드를 호출하여 반지름을 변경합니다.
		h = b;           // 높이를 변경합니다.
	}

	// 도형의 부피를 계산하는 메서드를 정의합니다.
	float vol() {
		// 원통의 원의 면적에 높이를 곱하여 부피를 계산하여 반환합니다.
		return super.area() * h;
	}
}
