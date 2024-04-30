package dddd;

public class Cal39 extends Cal{
	float power(float a, float b) {
		float p = 1;
		for(int k=1;k<=b;k++) p = mul(p,a);
		return p;
	}
	float fac(int n) {
		float p=1;
		for(int k=1;k<=n;k++) p = mul(p,(float)k);
		return p;
	}

}
