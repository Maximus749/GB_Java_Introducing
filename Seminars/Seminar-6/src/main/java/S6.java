import java.util.ArrayList;

public class S6 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        MySet mySet = new MySet(2, "e");
        System.out.println(mySet.b);
        mySet.getInfo();
    }

}


class MySet{
    int a;
    String b;

    public MySet(int a, String b){
        this.a = a;
        this.b = b;
    }
    public void getInfo(){
        System.out.println("Info");
    }
}
