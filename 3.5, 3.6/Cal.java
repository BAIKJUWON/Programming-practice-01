package test0409;

public class Cal {
	float add(float a, float b) {
		return (float)a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	float mut(float a, float b) {
		float s = 0;
		for(int i = 0; i < b; i++) {
			s = add(s,a);
		}
		return s;
	}
	int div(int a, int b) {
		int s = a;
		int i;
		for(i = 0; s >= b; i++) {
			s = sub(s,b);
		}
		return i;
	}
}
