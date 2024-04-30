package inh_0;

public class prof {

    int id;
    String name;

    // 교수 아이디와 이름 초기화
    prof(int a, String b){
        id = a;
        name = b;
    }
    void pr(){
        System.out.println(id+" "+name); // 교수 아이디와 이름 출력
    }
}
