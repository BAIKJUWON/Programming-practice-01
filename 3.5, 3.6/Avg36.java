package JavaPS;

class Avg36 extends Cal35 {
    float har(float a, float b) {
        if (a == 0 || b == 0) {
            System.out.println("Harmonic mean is undefined for zero.");
            return 0;
        }
        a = 1 / a;
        b = 1 / b;
        return 1 / ((a + b) / 2);  // 조화 평균 계산
    }

    float geo(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("You must enter a positive number.\r\n");  // 양수 입력 안내 메시지
            return 0;
        }
        return (float) Math.sqrt((float) mul(a, b));  // 두 수의 곱의 제곱근 계산
    }

    float avg(int a, int b){
        int av = (a+b)/2;
        return av;
    }
}