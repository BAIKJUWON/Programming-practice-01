package dddd;

public class EX extends Cal39 {
	int n;
	EX(int a){
		n = a;
	}
	float ex(float x) {
		float s = 1;
		for(int k=1;k<=n;k++) s = add(s, power(x,k)/fac(k));
		return s;
			
	}

}
