package test1;

public class Std {
	int id, score;
	
	String name;
	Std(int a, String b, int c){
		id = a; name = b; score = c;
	}
	void pr() {
		System.out.println(id+" "+name+" "+score);
	}

}
