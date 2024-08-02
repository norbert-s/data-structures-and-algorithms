package modern_java.review.exercise;

import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class PuttingItAllIntoPractice {
    public static void main(String[]args){
//        1 Find all transactions in the year 2011 and sort them by value (small to high).
        TransactionFactory.generateTransactions()
                .stream()
                .filter(s->s.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .peek(System.out::println)
                .collect(Collectors.toList());

//        2 What are all the unique cities where the traders work?
        System.out.println("--------------------------------------");
        TransactionFactory.generateTransactions()
                .stream()
                .map(s->s.getTrader().getCity())
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

//        3 Find all traders from Cambridge and sort them by name.
        System.out.println("--------------------------------------");
        TransactionFactory.generateTransactions()
                .stream()
                .filter(s->s.getTrader().getCity().equals("Cambridge"))
                .map(s->s.getTrader().getName())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

//        4 Return a string of all traders’ names sorted alphabetically.
        System.out.println("--------------------------------------");
        String str = TransactionFactory.generateTransactions()
                .stream()
                .map(s->s.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(str);

//        5 Are any traders based in Milan?
        System.out.println("--------------------------------------");
        Boolean isThereAnyoneFromMilan = TransactionFactory.generateTransactions()
                .stream()
                .anyMatch(s->s.getTrader().getCity().equals("Milan"));
        System.out.println(isThereAnyoneFromMilan);

//        6 Print the values of all transactions from the traders living in Cambridge.
        System.out.println("--------------------------------------");
        TransactionFactory.generateTransactions()
                .stream()
                .filter(s->s.getTrader().getCity().startsWith("Ca"))
                .map(s->s.getValue())
                .peek(System.out::println)
                .collect(Collectors.toList());

//        7 What’s the highest value of all the transactions?
        System.out.println("--------------------------------------");
        OptionalInt max = TransactionFactory.generateTransactions()
                .stream()
                .mapToInt(Transaction::getValue)
                .max();
        System.out.println(max);

        System.out.println("--------------------------------------");
        int max2 = TransactionFactory.generateTransactions()
                .stream()
                .map(s->s.getValue())
                .reduce(0,(a,b)->Integer.max(a,b));
        System.out.println(max2);


//        8 Find the transaction with the smallest value.
        System.out.println("--------------------------------------");
        Optional<Transaction> smallestTransaction =
                TransactionFactory.generateTransactions().stream()
                        .min(comparing(s->s.getValue()));

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
//        for(int i=0;i<5;i++){
//            numbers.add(random.nextInt(91));
//        }
//        System.out.println(numbers);
//        List<Integer> nums = IntStream.range(1,6)
//                .collect()


    }
}
