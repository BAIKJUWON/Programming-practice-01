package test1;

class Sum3d {
    int modifiedFib(int n) {
        if (n == 1 || n == 2 || n == 3) return 1; // 첫 세 항은 1
        else return 2 * modifiedFib(n - 1) + 3 * modifiedFib(n - 2) + modifiedFib(n - 3); // 변형된 피보나치 계산
    }

    int sum(int n) {
        int s = 0;
        for (int k = 1; k <= n; k++) {
            s += modifiedFib(k); // 1부터 n까지 변형된 피보나치 항의 합
        }
        return s;
    }
}

