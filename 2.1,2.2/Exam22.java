package Anu0319;

import java.util.Scanner;

public class Exam22 {
    public static void main(String[] args) {
        int n, r; // n과 r을 저장할 변수 선언
        float cb; // 조합 값을 저장할 변수 선언
        Scanner inp = new Scanner(System.in); // 입력을 받기 위하여 스캐너를 inp로 지정
        Cal2 p = new Cal2(); // Cal2 클래스의 객체 생성

        // 사용자로부터 n 입력 받기
        System.out.print("n을 입력:");
        n = inp.nextInt();

        // 사용자로부터 r 입력 받기
        System.out.print("r을 입력:");
        r = inp.nextInt();

        // Cal2 객체 p의 cb 메소드를 사용하여 n과 r에 대한 조합 계산
        cb = p.cb(n, r);

        // 결과 출력
        System.out.println("조합:" + cb);
    }
}
