package test1;

public class Sum3c {
    private int a, r, n;  // 'r'은 공비를 의미

    public Sum3c(int a, int r, int n) {
        this.a = a;
        this.r = r;
        this.n = n;
    }

    int sum() {
        int s = 0;
        int term = a;
        for (int k = 0; k < n; k++) {
            s += term;
            term *= r;  // 다음 항은 이전 항에 공비를 곱한 값
        }
        return s;
    }

    int sum(int a, int r, int n) {
        int s = 0;
        int term = a;
        for (int k = 0; k < n; k++) {
            s += term;
            term *= r;
        }
        return s;
    }
}
