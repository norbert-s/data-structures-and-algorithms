package modern_java.review_june_2023;

import modern_java.example.traders.Trader;
import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Review {
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
        List<Transaction> transactions = TransactionFactory.generateTransactions();
        transactions.stream()
                .filter(s->s.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .peek(System.out::println)
                .collect(Collectors.toList());

        transactions.stream()
                .map(s->s.getTrader().getCity())
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

        transactions.stream()
                .map(s->s.getTrader())
                .filter(s->s.getCity()=="Cambridge")
                .map(s->s.getName())
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());

        String str =transactions.stream()
                .map(s->s.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(str);
        //5 Are any traders based in Milan?
        Optional<List<Trader>>list = Optional.of(transactions.stream()
                .map(s -> s.getTrader())
                .filter(s -> s.getCity() == "Milan")
                .collect(Collectors.toList()));
        if(list.isPresent()) System.out.println("yes");
        else System.out.println("no");
        System.out.println("-----------------------------");
        //6 Print the values of all transactions from the traders living in Cambridge.
        transactions.stream()
                .filter(s->s.getTrader().getCity()=="Cambridge")
                .map(s->s.getValue())
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("-----------------------------");
        //7 What’s the highest value of all the transactions?
        int value = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare).get();
        System.out.println(value);

        //8 Find the transaction with the smallest value.
        Transaction transaction = transactions.stream()
                .min((a,b)->Integer.compare(a.getValue(),b.getValue()))
                .get();

        System.out.println(transaction);

        int [] arr = {1,3,4,1};
        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

    }
}
