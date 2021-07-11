class Cal{
    public int sum(int v1, int v2){
        return v1 + v2;
    }
    // 같은 이름의 메소드를 형태가 다르게 하여 메소드 생성
    // 이와 같은 것을 오버로딩 -> 상속과는 관계 없다.
    public int sum(int v1, int v2, int v3){
        return this.sum(v1,v2) + v3;
    }
}
class Cal2 extends Cal{
    public int minus(int v1, int v2){
        return v1 - v2;
    }
    // 부모가 가지고 있는 기능을 덮어쓰기 했다 -> 오버라이딩
    public int sum(int v1, int v2){
        System.out.println("Cal3!!!");
        return super.sum(v1,v2);
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        Cal2 c2 = new Cal2();

        System.out.println(c1.sum(4,1,3));
        System.out.println(c2.sum(4,1));
        System.out.println(c2.minus(4,1));
    }
}
