package inh_0;

// Scanner 클래스를 사용하기 위해 import문 선언
import java.util.Scanner;

// Main 클래스 선언
public class Main2 {

	// main 메서드 시작
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner inp = new Scanner(System.in);

		// Cylinder, Cone, Tri, Sqp 객체 생성 및 초기화
		Cylinder p = new Cylinder(10, 10);
		Cone q = new Cone(6,6);
		Tri r = new Tri(6,5);
		Sqp s = new Sqp(4,8,2);

		// 각 도형의 겉넓이와 부피 출력
		System.out.println("원기둥의 겉넓이 : "+p.area());
		System.out.println("원기둥의 부피 : "+p.vol());

		System.out.println("\n원뿔의 겉넓이 : "+q.area());
		System.out.println("원뿔의 부피 : "+q.vol());

		System.out.println("\n삼각형의 넓이 : "+r.area());

		System.out.println("\n사각뿔의 겉넓이 : "+s.area());
		System.out.println("사각뿔의 부피 : "+s.vol());

		// 사용자로부터 원의 반지름과 높이 입력 받기
		System.out.println("\n원의 반지름을 입력하세요 : ");
		int a = inp.nextInt();

		System.out.println("도형의 높이를 입력하세요 : ");
		int b = inp.nextInt();

		// 원기둥의 차원 변경
		p.change(a,b);

		// 변경된 원기둥의 겉넓이와 부피 출력
		System.out.println("\n원기둥의 겉넓이 : "+p.area());
		System.out.println("원기둥의 부피 : "+p.vol());

		// 원뿔의 차원 변경
		q.change(a,b);
		System.out.println("\n원뿔의 겉넓이 : "+q.area());
		System.out.println("원뿔의 부피 : "+q.vol());

		// 사용자로부터 삼각형의 가로 길이와 세로 길이 입력 받기
		System.out.println("\n도형의 가로 길이를 입력하세요 : ");
		a = inp.nextInt();

		System.out.println("도형의 세로 길이를 입력하세요 : ");
		b = inp.nextInt();

		// 삼각형의 차원 변경
		r.change(a,b);
		System.out.println("\n삼각형의 넓이 : "+r.area());

		// 사용자로부터 사각뿔의 가로 길이, 세로 길이, 높이 입력 받기
		System.out.println("\n도형의 가로 길이를 입력하세요 : ");
		a = inp.nextInt();

		System.out.println("도형의 세로 길이를 입력하세요 : ");
		b = inp.nextInt();

		System.out.println("도형의 높이를 입력하세요 : ");
		int c = inp.nextInt();

		// 사각뿔의 차원 변경
		s.change(a,b,c);
		System.out.println("\n사각뿔의 겉넓이 : "+s.area());
		System.out.println("사각뿔의 부피 : "+s.vol());
	}
}