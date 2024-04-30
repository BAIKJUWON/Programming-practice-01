package MainP;

import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("학생의 숫자를 입력하세요 : ");
        int std = inp.nextInt();

        // Avg5 클래스의 인스턴스 생성
        Avg5 p = new Avg5(std);
        // 학생의 점수를 입력하는 메서드 호출
        p.input(std);

        // 학생별 평균 계산 및 출력
        System.out.println("\n학생별 평균 점수:");
        for (int i = 0; i < std; i++) {
            float studentAvg = p.avg(i); // 각 학생의 평균 점수 계산
            System.out.println((i + 1) + "번째 학생의 평균 점수: " + studentAvg);
        }

        // 과목별 평균 계산 및 출력
        System.out.println("\n과목별 평균 점수:");
        for (int j = 0; j < 3; j++) { // 각 과목마다
            float subjectAvg = p.subjectAvg(j); // 각 과목의 평균 점수 계산
            System.out.println((j + 1) + "번째 과목의 평균 점수: " + subjectAvg);
        }
    }
}

