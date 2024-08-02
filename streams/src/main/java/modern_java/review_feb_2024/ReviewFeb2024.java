package modern_java.review_feb_2024;

import modern_java.example.traders.Trader;
import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReviewFeb2024 {
    public static void main(String[] args) {
        //1 Find all transactions in the year 2011 and sort them by value (small to high).
        //2 What are all the unique cities where the traders work?
        //3 Find all traders from Cambridge and sort them by name.
        //4 Return a string of all traders’ names sorted alphabetically.
        //5 Are any traders based in Milan?
        //6 Print the values of all transactions from the traders living in Cambridge.
        //7 What’s the highest value of all the transactions?
        //8 Find the transaction with the smallest value.

        //1 Find all transactions in the year 2011 and sort them by value (small to high).

//        TransactionFactory.generateTransactions().stream().filter(s->s.getYear()==2011).sorted();
//        //2 What are all the unique cities where the traders work?
//        List<Transaction> list = TransactionFactory.generateTransactions().stream()
//                .sorted((s1,s2)->s1.getTrader().getCity().compareTo(s2.getTrader().getCity()))
//                .collect(Collectors.toList());
//        System.out.println();
//
//        List<String> list2 = TransactionFactory.generateTransactions().stream()
//                .map(s->s.getTrader().getCity())
//                .sorted((s1,s2)->s2.compareTo(s1))
//                .collect(Collectors.toList());
//
//        //3 Find all traders from Cambridge and sort them by name.
//        List<Transaction> trader = TransactionFactory.generateTransactions().stream()
//                .filter(s->s.getTrader().getName().equals("Cambridge"))
//                .sorted((s1,s2)->s1.getTrader().getName().compareTo(s2.getTrader().getName()))
//                .collect(Collectors.toList());
//
//        //4 Return a string of all traders’ names sorted alphabetically.
//        List<String> stringsOfNames = TransactionFactory.generateTransactions().stream()
//                .map(s->s.getTrader().getName())
//                .sorted()
//                .collect(Collectors.toList());

        //5 Are any traders based in Milan?
       Boolean basedInMilan = TransactionFactory.generateTransactions().stream()
                .map(s->s.getTrader().getCity())
                .anyMatch(s->s.equals("Milan"));
        System.out.println(basedInMilan);

        //6 Print the values of all transactions from the traders living in Cambridge.
        TransactionFactory.generateTransactions().stream()
                .filter(s->s.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 What’s the highest value of all the transactions?
        Optional<Integer> maxVal = TransactionFactory.generateTransactions().stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);
        System.out.println(maxVal.get());

        //8 Find the transaction with the smallest value.
        Optional<Transaction> smallestTransaction = TransactionFactory.generateTransactions().stream()
                .reduce((s1,s2)->s1.getValue()<s2.getValue()?s1:s2);

        System.out.println(smallestTransaction);


    }
}
