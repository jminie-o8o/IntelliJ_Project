interface Claculable {
    double PI = 3.14; // 변수를 인터페이스에 정의할 때는 내용을 적는다.
    int sum(int v1, int v2); //메소드를 인터페이스에 정의할 때는 내용이 들어가지 않는다.
}
interface Printable{
    void print(); //메소드를 인터페이스에 정의할 때는 내용이 들어가지 않는다.
}
class RealCal implements Claculable, Printable{
    public int sum(int v1, int v2){
        return v1 + v2;
    }

    public void print() {
        System.out.println("This is RealCal");
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        RealCal r = new RealCal();
        Printable p = new RealCal(); // 다형성을 사용
        Claculable c = new RealCal(); // 다형성을 사용

        System.out.println(c.sum(2,1));
        p.print();
        System.out.println(c.PI);
    }
}
