import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd");
        System.out.println(formatter.format(new Date()));
    }
}
