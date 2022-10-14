import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

<<<<<<< Updated upstream
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd");
=======
        SimpleDateFormat formatter = new SimpleDateFormat("/MMM/dd");
        System.out.println();
>>>>>>> Stashed changes
        System.out.println(formatter.format(new Date()));
    }
}
