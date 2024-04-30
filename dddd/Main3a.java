package dddd;

import java.util.Scanner;

public class Main3a {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int n = inp.nextInt();
		
		Tay3a p = new Tay3a(n);
		float x = inp.nextInt();
		System.out.println(p.cos(x));
	}

}
