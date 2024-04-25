package day12.stream.quiz2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );

        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.
        List<Booking> by2022 = bookings
                .stream()
                .filter(booking -> booking.getYear() == 2022)
                .sorted(Comparator.comparing(Booking::getPrice))
                .collect(Collectors.toList());
        System.out.println("=====2022년 여행 가격 오름차 정렬=====");
        System.out.println(by2022);

        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.
        List<String> allCountry = bookings
                .stream()
                .map(booking -> booking.getDestination().getCountry())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("====여행지가 있는 모든 나라====");
        System.out.println(allCountry);

        // 연습 3: Paris에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.
        List<Traveler> toParisTraveler = bookings
                .stream()
                .filter(booking -> booking.getDestination().getCity().equals("Paris"))
                .map(Booking::getTraveler)
                .sorted(Comparator.comparing(Traveler::getName))
                .collect(Collectors.toList());
        System.out.println("파리에 예약된 모든 여행자 이름순 오름차");
        System.out.println(toParisTraveler);

        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환.
        List<String> emailList = bookings
                .stream()
                .map(Booking::getTraveler)
                .sorted(Comparator.comparing(Traveler::getEmail))
                .map(Traveler::getEmail)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("모든 여행자의 이메일 리스트");
        System.out.println(emailList);

        // 연습 5: Italy로의 여행이 한 건이라도 있는지 여부 확인.
        boolean flag1 = bookings
                .stream()
                .anyMatch(booking -> booking.getDestination().getCountry().equals("Italy"));
        System.out.println("이태리로의 여행이 한건이라도 있는가?");
        System.out.println(flag1);

        // 연습 6: France로의 모든 여행의 총 가격을 출력.
        double totalPriceToFrance = bookings
                .stream()
                .filter(booking -> booking.getDestination().getCountry().equals("France"))
                .mapToDouble(Booking::getPrice)
                .sum();
        System.out.println("프랑스로의 모든 여행의 총 가격");
        System.out.println(totalPriceToFrance);

        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?
        double bestPrice = bookings
                .stream()
                .sorted(Comparator.comparing(Booking::getPrice).reversed())
                .limit(1)
                .collect(Collectors.toList())
                .get(0)
                .getPrice();

        System.out.println("모든 여행중 최고 가격");
        System.out.println(bestPrice);
        // 연습 8: 가장 저렴한 여행의 정보 탐색.

        Booking cheapOne = bookings
                .stream()
                .sorted(Comparator.comparing(Booking::getPrice))
                .limit(1)
                .collect(Collectors.toList())
                .get(0);

        System.out.println("가장 저렴한 여행 정보");
        System.out.println(cheapOne);
        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.

        List<Booking> over2000Price = bookings
                .stream()
                .filter(booking -> booking.getPrice() >= 2000)
                .collect(Collectors.toList());
        System.out.println("2000이 넘는 모든 여행 정보");
        System.out.println(over2000Price);
        // 연습 10: 모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격을 계산하시오.

        double avgSkipOne = bookings
                .stream()
                .sorted(Comparator.comparing(Booking::getPrice))
                .skip(1)
                .mapToDouble(Booking::getPrice)
                .average()
                .getAsDouble();
        System.out.println("가장 낮은 가격 제외 평균");
        System.out.println(avgSkipOne);
        // 연습 11: 모든 여행자의 여행 예약을 여행지별로 그룹화하여 출력하시오.


        // 연습 12: 모든 예약 중 최고 가격과 최저 가격의 차이를 계산하시오.
        List<Booking> allPrice = bookings
                .stream()
                .sorted(Comparator.comparing(Booking::getPrice))
                .collect(Collectors.toList());
        double result = allPrice.get(allPrice.size() - 1).getPrice() - allPrice.get(0).getPrice();
        System.out.println("최고가 - 최저가");
        System.out.println(result);
    }

}
