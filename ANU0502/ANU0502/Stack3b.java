package ANU0502;

public class Stack3b {
    Std3b top;
    Stack3b() {
        top = null;
    }
    void push(Std3b a){
        a.next = top;
        top = a;
    }
    Std3b pop(){
        Std3b t = top;
        top = top.next;
        return t;
    }
    void pr(){
        Std3b t = top;
        while(t!=null){
            t.pr();
            t=t.next;
        }
    }
}
