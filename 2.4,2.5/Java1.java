package MainP;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Str4 클래스의 인스턴스 생성
        Str4 p = new Str4();

        // 사용자로부터 두 개의 문자열을 입력받음
        String a = inp.next();
        String b = inp.next();

        // 문자열을 이어 붙여 출력
        System.out.println(p.concat(a, b));

        int n = a.length();

        // 주어진 문자열의 모든 부분 문자열을 출력
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(p.substring(a, i, j));
            }
        }

        // 문자열을 다른 문자열 안에 끼워 넣어 출력
        System.out.println(p.insertString(a, b, 2));

        // 문자열의 순열 출력
        System.out.println("순열:");
        p.permutation("", a);
    }
}

class Str4 {
    // 문자열을 이어 붙이는 메소드
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 주어진 문자열의 일부분을 추출하는 메소드
    public String substring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }

    // 주어진 문자열에 다른 문자열을 지정된 위치에 삽입하는 메소드
    public String insertString(String original, String toInsert, int position) {
        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.insert(position, toInsert);
        return stringBuilder.toString();
    }

    // 문자열의 순열을 구하는 메소드
    public void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}
