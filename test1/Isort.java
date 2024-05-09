package test1;

import java.util.Scanner;

public class Isort {
	Std a[];
	
	void set(int n) {
		Scanner inpp = new Scanner(System.in);
		a = new Std[n];
		
		for(int k=0;k<n;k++)
			a[k] = new Std(inpp.nextInt(), inpp.next(),inpp.nextInt());
	}
	
	void sort() {
		int i,j;
		Std t;
		for(i=1;i<a.length;i++) {
			t = a[i];
			for(j=i-1;j>=0;j--) {
				if(a[j].id>t.id)a[j+1]=a[j];
				else break;				
			}
			a[j+1] = t;
		}
	}
	void pr() {
		for(int k=0; k<a.length;k++)a[k].pr();
	}

}
