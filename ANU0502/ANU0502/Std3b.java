package ANU0502;

public class Std3b {
    int id, score;
    String name;
    Std3b.next;
    Std3b(int a, String b, int c){
        id = a; name = b; score = c; next = null;
    }
    void pr(){
        System.out.println(id+" "+ name + " "+ score);
    }
}
