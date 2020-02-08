package kr.silee.chapter5;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class ChapterFive
{
    public static void main(String[] args)
    {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan  = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
                                                       new Transaction(raoul, 2012, 1000),
                                                       new Transaction(raoul, 2011, 400),
                                                       new Transaction(mario, 2012, 710),
                                                       new Transaction(mario, 2012, 700),
                                                       new Transaction(alan, 2012, 950));

        transactions.stream()
                    .filter(tr -> tr.getYear() == 2011)
                    .sorted(comparing(Transaction::getYear))
                    .forEach(System.out::println);

        transactions.stream()
                    .map(Transaction::getTrader)
                    .map(Trader::getCity)
                    .distinct()
                    .forEach(System.out::println);

        transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(tr -> "Cambridge".equals(tr.getCity()))
                    .map(Trader::getName)
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);

        transactions.stream()
                    .map(Transaction::getTrader)
                    .map(Trader::getCity)
                    .filter(city -> city.equals("Milan"))
                    .findAny()
                    .ifPresent(System.out::println);
    }
}
