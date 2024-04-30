package dddd;

public class Tay3a extends Cal39 {
	int n;
	Tay3a(int a){
		n = a;
	}
	
	float cos(float x) {
		float r = rad(x);
		float s = 1;
		for(int k=1;k<=n;k++)s=add(s,power(-1,k)*power(r, 2*k)/fac(2*k));
		return s;
	}
	float rad(float x) {
		return x*(float)3.141592/180;
	}

}
