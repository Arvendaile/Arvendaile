import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now.format(formatter));
        }

    }
}
