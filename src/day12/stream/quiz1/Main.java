package day12.stream.quiz1;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> valueUp = transactions
                .stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("================ 2021 거래액 오름차 정렬========");
        System.out.println(valueUp);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        List<String> allCity =
                transactions
                        .stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("===============모든 도시이름 중복없이============");
        System.out.println(allCity);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        List<Trader> traderInCambridge =
                transactions
                        .stream()
                        .map(Transaction::getTrader)
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList());
        System.out.println("============ 캠브릿지 모든 거래자 이름순 정렬========");
        System.out.println(traderInCambridge);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        List<String> traderName =
                transactions
                        .stream()
                        .map(Transaction::getTrader)
                        .sorted(Comparator.comparing(Trader::getName))
                        .map(Trader::getName)
                        .collect(Collectors.toList());
        System.out.println("===============모든 거래자의 이름 이름리스트 오름차정렬");
        System.out.println(traderName);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions
                .stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("===밀라노에 거주하는 사람이 한명이라도 있는가? ===");
        System.out.println(flag1);

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalValueInCambridge = transactions
                .stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("캠브릿지에 사는 거래자의 모든 거래액의 총합");
        System.out.println(totalValueInCambridge);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        Integer bestTransaction = transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .limit(1)
                .map(Transaction::getValue)
                .collect(Collectors.toList())
                .get(0);

        System.out.println("=============최고거래액==========");
        System.out.println(bestTransaction);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        List<Transaction> smallTransaction = transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("===========최소 거래액 거래정보========");
        System.out.println(smallTransaction);


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        System.out.println("========거래액이 500 이상인 거래정보=======");
        transactions
                .stream()
                .filter(transaction -> transaction.getValue() >= 500)
                .forEach(System.out::println);

        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        double oneSkipAverage = transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .skip(1)
                .mapToInt(Transaction::getValue)
                .average()
                .getAsDouble();
        System.out.println("===========최소거래 제외 평균거래액========");
        System.out.println(oneSkipAverage);


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        System.out.println("Year: 2021");
        transactions
                .stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .map(ByYear::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Year: 2022");
        transactions
                .stream()
                .filter(transaction -> transaction.getYear() == 2022)
                .map(ByYear::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */


        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        System.out.println("===========최고거래액 - 최소거래액========");
        List<Integer> allValues = transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        int sub = allValues.get(allValues.size() - 1) -  (int)allValues.get(0);
        System.out.println(sub);
    }


    private static class ByYear {
        private String trader;
        private int year;
        private int value;

        @Override
        public String toString() {
            return "ByYear{" +
                    "trader='" + trader + '\'' +
                    ", year=" + year +
                    ", value=" + value +
                    '}';
        }

        public ByYear(Transaction transaction) {
            this.trader = transaction.getTrader().getName() + " in " + transaction.getTrader().getCity();
            this.year = transaction.getYear();
            this.value = transaction.getValue();
        }
    }

}
