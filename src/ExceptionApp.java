import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp {
    public static void main(String[] args) {
        // try with resource statements
        try(FileWriter f = new FileWriter("data2.text")){
            f.write("Hello");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
