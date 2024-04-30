package Anu0319;

import java.util.Scanner;

public class Exam21 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //스캐너를 inp로 선언
        long a,b; // Long 타입의 변수 a,b를 선언
        Cal p = new Cal(); //연산자 클래스 생성

        a = inp.nextLong(); //long 타입의 데이터를 입력받아 변수 a에 저장
        b = inp.nextLong(); //long 타입의 데이터를 입력받아 변수 b에 저

        System.out.println(p.add(a,b)); //연산자 클래스에서 add함수를 호출하여 계산하여 출력
        System.out.println(p.sub(a,b)); //연산자 클래스에서 sub함수를 호출하여 계산하여 출력





    }
}
