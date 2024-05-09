package test1;

import java.util.Scanner;

public class Main3e {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Isort p = new Isort();
		
		int n = inp.nextInt();
		
		p.set(n);
		p.pr();
		p.sort();
		p.pr();
		
	}

}
