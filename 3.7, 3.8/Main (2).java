import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Max ko = new Max();
		Max ma = new Max();
		Max ag = new Max();
		System.out.println("학생의 수와 학생의 성적을 입력하시오 ");
		System.out.println("  < 예시 >");
		System.out.println(" 2 ");
		System.out.println(" [0]번째 학생의 국어성적:45 ");
		System.out.println(" [1]번째 학생의 국어성적:75 ");
		System.out.println(" [0]번째 학생의 수학성적:45 ");
		System.out.println(" [1]번째 학생의 수학성적:75 ");
		int n = sc.nextInt();
		ko.set(n);
		ma.set(n);
		ag.set(n, ko, ma);
		
		
		System.out.println("국어 평균: "+ko.avg());
		System.out.println("국어 최대값: "+ko.max());
		System.out.println("국어 최대값id: "+ko.maxId());
		
		System.out.println();
		
		System.out.println("수학 평균: "+ma.avg());
		System.out.println("수학 최대값: "+ma.max());
		System.out.println("수학 최대값id: "+ma.maxId());
		
		System.out.println();
		
		System.out.println("평균과목 평균: "+ag.avg());
		System.out.println("평균과목 최대값: "+ag.max());
		System.out.println("평균과목 최대값id: "+ag.maxId());
	}
}

class Cal5 {
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	float div(int a, int b) {
		return (float)a/b;
	}
}

class Avg1 extends Cal5 {
	int a[];
	
	void set(int n) {
		Scanner sc = new Scanner(System.in);
		a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("["+i+"]"+"학생의 성적 입력: ");
			a[i]=sc.nextInt();
		}
	}
	
	void set(int n, Avg1 ko, Avg1 ma) {
		a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = (ko.a[i]+ma.a[i])/2; 
		}
	}
	
	float avg() {
		int result=0;
		for(int i=0; i<a.length; i++) result=add(result, a[i]);
		return div(result, a.length);
	}
	
	
}

class Max extends Avg1 {
	int max() {
		int m=a[0];
		for(int i=1; i<a.length; i++) {
			if(m<a[i]) m = a[i];
		}
		return m;
	}
	
	int maxId() { 
		int m=a[0];
		int re=0;
		for(int i=1; i<a.length; i++) {
			if(m<a[i]) {
				m = a[i];
				re=i;
			}
		}
		return re;
	}
}

