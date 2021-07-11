import java.util.Scanner;

public class InputApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("달러환율을 입력하세요.");
        String exchangeString = scanner.nextLine();

        System.out.println("순대국값을 입력하세요.");
        String priceOfSoupString = scanner.nextLine();
        try {
            int exchange = Integer.parseInt(exchangeString);
            int priceOfSoup = Integer.parseInt(priceOfSoupString);
            System.out.println("순대국은 "+ priceOfSoup/exchange +"달러입니다");

        } catch (NumberFormatException e){
            System.out.println("숫자를 입력하세요");
        }
    }
}
