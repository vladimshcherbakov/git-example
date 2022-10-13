import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM yyyy");
        System.out.println(formatter.format(new Date()));
    }
}
