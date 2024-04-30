package circle.NewPack;

import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Avg37 p = new Avg37();
        System.out.print("인덱스 숫자를 입력하시오:");
        int n = inp.nextInt();
        p.set(n);

        System.out.println("기하평균: " + p.g());
        System.out.println("조화평균: " + p.h());
        System.out.println("평균: "+ p.avg());
    }
}
