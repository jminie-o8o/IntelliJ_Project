class Cal3{
    int v1;
    int v2;
    Cal3(int v1, int v2){
        System.out.println("Cal3 in int!");
        this.v1 = v1;
        this.v2 = v2;
    }
    public int sum(int v1, int v2){
        return this.v1 + this.v2; //this 를 붙여줬으므로 멤버변수 사용
    }
}
class Cal4 extends Cal3{

    // 생성자가 있는 클래스를 상속받았다면 생성자를 만들어서 부모클래스를 반드시 호출해야 한다.
    Cal4(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal4 in int!!!!!!!!!!!!");
    }
    public int minus(int v1, int v2){
        return this.v1 - super.v2;
    }
}
public class InheritanceApp2 {
    public static void main(String[] args) {
        Cal3 c3 = new Cal3(2,1);
        Cal4 c4 = new Cal4(2,1);
        System.out.println(c3.sum(10,5));
        System.out.println(c4.minus(10,5));
    }
}
