package test0409;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Input Two numbers wants to calculate. : ");
		int a = inp.nextInt();
		int b = inp.nextInt();
		Cal p = new Cal();
		Cal_1 q = new Cal_1();
		System.out.println("a+b = "+p.add(a,b));
		System.out.println("a-b = "+p.sub(a,b));
		System.out.println("a*b = "+p.mut(a,b));
		System.out.println("a/b = "+p.div(a,b));
		System.out.println("average = "+q.avg(a,b));
		System.out.println("a^b = "+q.exp(a,b));

		System.out.println("harmonic mean = "+q.har(a,b));
		System.out.println("geometric mean = "+q.geo(a,b));

		
		System.out.println("Input a number wants to calculate pactorial. : ");
		a = inp.nextInt();
		System.out.println("pactorial a = "+q.pac(a));

	}

}
