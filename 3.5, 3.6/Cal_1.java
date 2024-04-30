package test0409;

public class Cal_1 extends Cal {
	
	float avg(int a, int b) {
		return (float)(add(a,b)/2.0);
	}

	float exp(float a, float b) {
		int e = 1;
		for(int i = 0; i < b; i++)
			e *= a;
		return e;
	}
	float pac(float a) {
		if(a == 1) return 1;
		return a * pac(a-1);
	}
	
	float har(float a, float b) {
		a = 1/a;
		b = 1/b;
		return 1/(add(a,b)/2);
	}
	
	float geo(int a, int b) {
		if(a<=0 || b<=0) {
			System.out.println("You must enter a positive number.\r\n");
			return 0;
		}
		return (float)Math.sqrt(mut(a,b));		
	}

}
