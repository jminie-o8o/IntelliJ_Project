class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance Var";

    public static void classMethod(){
        System.out.println(classVar); //클래스 메소드에서는 클래스 변수에는 접근 가능
//        System.out.println(instanceVar); //Error
    }
    public void InstanceMethod(){
        System.out.println(classVar); //인스턴스 메소드에서는 클래스 변수에는 접근 가능
        System.out.println(instanceVar); // 인스턴스 메소드에서는 인스턴스 변수에도 접근 가능
    }
}
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
//        System.out.println(Foo.instanceVar); //Error

        Foo.classMethod(); // 클래스 메소드는 호출이 된다.
//        Foo.InstanceMethod(); // 인스턴스 메소드는 인스턴스 소속이기 때문에 클래스를 통해서 접근은 안된다.

        // 클래스의 변수를 바꾸면 모든 인스턴스의 변수도 같이 바뀐다
        // 인스턴스에서 클래스의 변수를 바꿀 수 있는데 그러면 클래스변수가 바뀌고 그것을 사용하는 모든 인스턴스에서 클래스 변수가 바뀜
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // I classvar
        System.out.println(f1.instanceVar); // I instance Var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar); // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance Var
    }
}
