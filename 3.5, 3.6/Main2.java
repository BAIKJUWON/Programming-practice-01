package JavaPS;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // 사용자로부터 입력 받기
        int a = inp.nextInt();
        int b = inp.nextInt();

        Avg36 q = new Avg36();
        // 결과 출력
        System.out.println("평균 : " + q.avg(a,b));
        System.out.println("조화평균 = " + q.har(a, b)); // 조화 평균 결과 출력
        System.out.println("기하평균 = " + q.geo(a, b)); // 기하 평균 결과 출력
        inp.close();
    }
}


