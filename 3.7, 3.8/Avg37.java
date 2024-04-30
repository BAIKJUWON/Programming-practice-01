package circle.NewPack;

import java.util.Scanner;

class Avg37 extends Cal37 { // Cal37 클래스를 상속받는 Avg37 클래스 정의
    int a[]; // 정수 배열 선언

    void set(int n) { // 배열 크기 설정 및 사용자로부터 배열 요소 입력
        a = new int[n];
        Scanner inpp = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = inpp.nextInt();
    }

    float avg() { // 평균 계산 메소드
        int s = 0;
        for (int i = 0; i < a.length; i++)
            s = add(s, a[i]);
        return div(s, a.length);
    }

    float g() { // 기하평균 계산 메서드
        int mul = 1; // 곱을 저장할 변수 초기화
        for (int i = 0; i < a.length; i++) // 배열의 요소 개수만큼 반복
            mul *= a[i]; // 모든 요소들을 곱함
        return (float)Math.pow(mul, 1.0/a.length); // 모든 요소의 곱에 배열의 길이를 거듭제곱으로 나눈 값 반환
    }


    float h() { // 조화평균 계산 메소드
        float sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += 1.0/a[i];
        return a.length / sum;
    }
}
