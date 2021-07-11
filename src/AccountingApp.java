class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1; //어디든 vatRate 는 어느 인스턴스에도 동일하기 때문에
                                        //이럴때는 클래스 소속으로 내버려두는게 낫다 (static 유지)

    //생성자를 통해 입력값을 넣어야 하게 강제한다.
    public Accounting(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply); //인스턴스 소속의 변수이므로 static 을 빼야함
        System.out.println("Value of supply : " + a2.valueOfSupply); //인스턴스 소속의 변수이므로 static 을 빼야함

        System.out.println("VAT : " + a1.getVAT()); //인스턴스 소속의 메소드이므로 static 을 빼야함
        System.out.println("VAT : " + a2.getVAT());

        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
    }
}
