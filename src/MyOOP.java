class print{
    // 클래스안에 있는 변수와 메소드 등을 멤버라고 부른다.
    public String delimiter = "";
    // 생성자는 클라스의 이름과 동일한 메소드를 만들어 주면 된다.
    // 생성자는 static 이라던지 void, int 같은 리턴타입을 지정하지 않는다.
    public print(String delimiter){
        this.delimiter = delimiter;
    }
    // printA 메소드 안에는 delimiter 라는 변수가 선언되지 않았기 때문에 MyOOP 안에 있는 변수를 사용
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
public class MyOOP {
    public static void main(String[] args) {
        print p1 = new print("----");
        p1.A();


        //..
//        print.delimiter = "----";  //print 클래스의 delimiter
//        print.A();
//        print.A();
//        print.A();
//        print.A();
//        //..
//        print.delimiter = "****";
//        print.B();
//        print.B();
//        print.B();
//        print.B();
 }
}
