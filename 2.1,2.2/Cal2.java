package Anu0319;

public class Cal2 {
    // 두 수를 곱하는 메소드
    float mul(float a, float b) {
        return a * b;
    }

    // 거듭제곱을 계산하는 메소드
    float exp(float a, int b) {
        float p;
        int j;
        p = 1;
        for(j = 1; j <= b; j++) {
            p = mul(p, a);
        }
        return p;
    }

    // 팩토리얼을 계산하는 메소드
    float fac(int n) {
        float f;
        int i;
        f = 1;

        for(i = 1; i <= n; i++) {
            f = mul(f, i);
        }
        return f;
    }

    // 조합을 계산하는 메소드
    float cb(int n, int r) {
        // n 팩토리얼을 계산
        float nt = fac(n);
        // r과 (n-r) 팩토리얼을 곱하여 분모 계산
        float dt = mul(fac(r), fac(n - r));
        // 조합 계산하여 반환
        return nt / dt;
    }
}
