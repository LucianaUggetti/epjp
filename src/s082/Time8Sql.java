package s082;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
// necessario passsare da sql a java
public class Time8Sql {
    public static void main(String[] args) {
        Date date = Date.valueOf(LocalDate.now()); //c'è un Date, devo vedere import.
        										// valueOf è un metodo statico
        System.out.println("Sql Date" + date);
        System.out.println("Converted to LocalDate: " + date.toLocalDate());
        
        Time time = Time.valueOf(LocalTime.now());
        System.out.println("Sql Time" + time);
        System.out.println("Converted to LocalTime: " + time.toLocalTime());
        
        Timestamp ts = Timestamp.valueOf(LocalDateTime.now()); // mi da giorno e ora
        System.out.println("Sql Timestamp" + ts);
        System.out.println("Converted to LocalDateTime: " + ts.toLocalDateTime());
        System.out.println("Converted to Instant: " + ts.toInstant());
    }
}
