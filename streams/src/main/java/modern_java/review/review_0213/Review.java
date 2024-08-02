package modern_java.review.review_0213;



import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Review {
    public static void main(String[]args){
        //1 Find all transactions in the year 2011 and sort them by value (small to high).
        //2 What are all the unique cities where the traders work?
        //3 Find all traders from Cambridge and sort them by name.
        //4 Return a string of all traders’ names sorted alphabetically.
        //5 Are any traders based in Milan?
        //6 Print the values of all transactions from the traders living in Cambridge.
        //7 What’s the highest value of all the transactions?
        //8 Find the transaction with the smallest value.


        //1 Find all transactions in the year 2011 and sort them by value (small to high).
        TransactionFactory.generateTransactions().stream()
                .filter(s->s.getYear()==2011)
                .sorted((s1,s2)->Integer.compare(s2.getValue(), s1.getValue()))
                .forEach(System.out::println);

        //2 What are all the unique cities where the traders work?
        TransactionFactory.generateTransactions().stream()
                .map(s->s.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //3 Find all traders from Cambridge and sort them by name.
        TransactionFactory.generateTransactions().stream()
                .filter(s->s.getTrader().getCity().equals("Cambridge"))
                .sorted((s1,s2)->s2.getTrader().getName().compareTo(s1.getTrader().getName()))
                .map(n->n.getTrader().getName())
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //4 Return a string of all traders’ names sorted alphabetically.
        TransactionFactory.generateTransactions().stream()
                .sorted((s1,s2)->s1.getTrader().getName().compareTo(s2.getTrader().getName()))
                .map(n->n.getTrader().getName())
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //5 Are any traders based in Milan?
        Boolean AreThereAny = TransactionFactory.generateTransactions().stream()
                .anyMatch(s->s.getTrader().getCity().equals("Milan"));
        System.out.println(AreThereAny);
        System.out.println();

        //6 Print the values of all transactions from the traders living in Cambridge.
        TransactionFactory.generateTransactions().stream()
                .filter(s->s.getTrader().getCity().equals("Cambridge"))
                .map(n->n.getValue())
                .forEach(System.out::println);
        System.out.println();

        //7 What’s the highest value of all the transactions?
        int maxVal = TransactionFactory.generateTransactions().stream()
                .mapToInt(s->Integer.valueOf(s.getValue()))
                .max().getAsInt();
        System.out.println(maxVal);

        //8 Find the transaction with the smallest value.
        List<Transaction> tr =TransactionFactory.generateTransactions().stream()
                .limit(1)
                .sorted((s1,s2)->Integer.compare(s1.getValue(),s2.getValue()))
                .collect(Collectors.toList());

        //8 Find the transaction with the smallest value.
        Transaction tr2 =TransactionFactory.generateTransactions().stream()
                .min((s1,s2)->Integer.compare(s1.getValue(),s2.getValue())).get();

    }
}
