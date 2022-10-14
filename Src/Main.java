import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

<<<<<<< Updated upstream
        SimpleDateFormat formatter = new SimpleDateFormat("/MMM/dd");
        System.out.println(" Текущая дата: " + formatter.format(new Date()));
=======
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd");
        System.out.println(formatter.format(new Date()));
>>>>>>> Stashed changes
    }
}
