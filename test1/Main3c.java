package test1;

import java.util.Scanner;

public class Main3c {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, r, n;  // 'a'는 첫 번째 항, 'r'은 공비, 'n'은 항의 수

        a = inp.nextInt();  // 첫 번째 항 입력
        r = inp.nextInt();  // 공비 입력
        n = inp.nextInt();  // 항의 수 입력

        Sum3c p = new Sum3c(a, r, n);

        System.out.println(p.sum());  // 첫 번째 등비수열의 합 출력

        a = inp.nextInt();  // 새로운 첫 번째 항 입력
        r = inp.nextInt();  // 새로운 공비 입력
        n = inp.nextInt();  // 새로운 항의 수 입력

        System.out.println(p.sum(a, r, n));  // 새로운 등비수열의 합 출력

        inp.close();  // Scanner 객체 닫기
    }
}
