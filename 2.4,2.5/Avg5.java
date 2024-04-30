package MainP;

import java.util.Scanner;

class Avg5 {
    Scanner inp = new Scanner(System.in);
    // 학생의 점수를 저장하는 배열
    private int[][] scores;

    // 생성자 추가: 학생 수를 받아서 배열 초기화
    public Avg5(int std) {
        scores = new int[std][3];
    }

    // 학생의 점수를 입력하는 메서드
    public void input(int std) {
        System.out.println("국어, 영어, 수학 점수를 입력하세요:");
        for (int i = 0; i < std; i++) {
            System.out.print((i + 1) + "번째 학생:\n");
            System.out.print("국어 점수: ");
            scores[i][0] = inp.nextInt();
            System.out.print("영어 점수: ");
            scores[i][1] = inp.nextInt();
            System.out.print("수학 점수: ");
            scores[i][2] = inp.nextInt();
        }
    }

    // 평균을 계산하는 메서드
    public float avg(int studentIndex) {
        int sum = 0;
        for (int score : scores[studentIndex]) {
            sum += score;
        }
        return (float) sum / scores[studentIndex].length;
    }

    // 과목별 평균을 계산하는 메서드
    public float subjectAvg(int subjectIndex) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i][subjectIndex];
        }
        return (float) sum / scores.length;
    }
}
