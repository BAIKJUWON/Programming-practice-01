package fu;

import java.util.Scanner;

public class Main3h {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Queueh p = new Queueh();
        int n = inp.nextInt();
        Std t;
        for (int k = 0; k < n; k++) {
            t = new Std(inp.nextInt(), inp.next(), inp.nextInt());
            p.add(t);
        }
        p.pr();
        p.del().pr();
        p.pr();
    }
}

class Queueh {
    Std front, rear;

    Queueh() {
        front = rear = null;
    }

    void add(Std b) {
        if (rear == null) {
            rear = b;
            front = b;
        } else {
            rear.next = b;
            rear = b;
        }
    }

    Std del() {
        if (front == null) return null;
        Std t = front;
        front = front.next;
        return t;
    }

    void pr() {
        Std t = front;
        while (t != null) {
            t.pr();
            t = t.next;
        }
    }
}

class Std {
    int id, score;
    String name;
    Std next;

    Std(int a, String b, int c) {
        id = a;
        name = b;
        score = c;
        next = null;
    }

    void pr() {
        System.out.println(id + " " + name + " " + score);
    }
}
