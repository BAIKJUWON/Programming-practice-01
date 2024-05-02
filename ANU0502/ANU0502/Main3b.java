package ANU0502;

import java.util.Scanner;

public class Main3b {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        Stack3b p = new Stack3b();
        
        Std3b q;
        
        int n=inp.nextInt();
        
        for(int k=0;k<n;k++){
            q = new Std3b(inp.nextInt(),inp.nextInt(),inp.nextInt());
            p.push(q);
        }
        p.pr();
        q = p.pop();
        p.pr();
        q.pr();
    }
}
