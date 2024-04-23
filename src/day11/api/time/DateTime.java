package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println("date.getYear() = " + date.getYear());

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(Calendar.YEAR);

        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        System.out.println(nowDate.getYear());
        System.out.println(nowDate.getMonthValue());

        LocalTime nowTime = LocalTime.now();

        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate targetDate = LocalDate.of(2022, 3, 19);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산
        // 도서 대여시스템에서 빌린날짜로부터 3일 뒤가 반납일
        LocalDate rentalDate = LocalDate.now();
        System.out.println("rentalDate = " + rentalDate);
        LocalDate returnDate =rentalDate.plusDays(50);
        System.out.println("returnDate = " + returnDate);

        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022, 12, 27);
        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");

        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);
    }
}
