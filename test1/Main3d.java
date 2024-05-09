package test1;

import java.util.Scanner;

public class Main3d {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter n: "); // 사용자에게 입력 받기
        int n = inp.nextInt(); // n 값을 입력 받음
        Sum3d p = new Sum3d(); // Sum3d 클래스의 객체 생성
        
        while(n != 0) { // 0이 입력되면 종료
            System.out.println("Sum of modified Fibonacci sequence up to " + n + ": " + p.sum(n));
            System.out.print("Enter n (0 to exit): ");
            n = inp.nextInt(); // 다음 n 값을 입력 받음
        }
        
        inp.close(); // Scanner 객체 닫기
    }
}