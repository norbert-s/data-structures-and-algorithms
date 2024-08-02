package modern_java.example.traders;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[]args){
        List<Transaction> transactions = TransactionFactory.generateTransactions();
        // List<Trader> listByYearByValue = transactions.stream()
        //     .filter(x->x.getYear()==2011)
        //     .sorted(Comparator.comparing(Transaction::getValue))
        //     .map(Transaction::getTrader)
        //     .collect(Collectors.toList());

        //     // List<Trader> listByYearByValue= transactions.stream()
        //     // .filter(transaction -> transaction.getYear() == 2011)
        //     // .sorted(Comparator.comparing(Transaction::getValue))
        //     // .collect(Collectors.toList());   
        // System.out.println(listByYearByValue);

        //2.
        // List<String> cities = transactions.stream()
        //     .map(x->x.getTrader().getCity())
        //     .distinct()
        //     .collect(Collectors.toList());
        // System.out.println(cities);
        //3.
        // List<Trader> traderCambByName = transactions.stream()
        //     .map(Transaction::getTrader)
        //     .filter(x->x.getCity()=="Cambridge")
        //     .sorted(Comparator.comparing(Trader::getName))
        //     .distinct()
        //     .collect(Collectors.toList());
        // System.out.println(traderCambByName);

        //4.Return a string of all traders’ names sorted alphabetically.
        // String allTradersByName = transactions.stream()
        //     .map(x->x.getTrader().getName())
        //     .distinct()
        //     .sorted()
        //     .reduce("", (n1, n2) -> n1 + n2);
           
        // System.out.println(allTradersByName);

        // Optional<Trader> anyoneFromMilan = transactions.stream()
        //     .map(Transaction::getTrader)
        //     .filter(x->x.getCity()=="Milan")
        //     .findAny();
        // System.out.println(anyoneFromMilan.get());
        //6. Print the values of all transactions from the traders living in Cambridge.
        List<Integer> valuesByCambridge = transactions.stream()
            .filter(t -> t.getTrader().getCity().equals("Cambridge"))
            .map(Transaction::getValue)
            .collect(toList());
        System.out.println(valuesByCambridge);


        //What’s the highest value of all the transactions?
        
        Optional<Integer> highestValue = transactions.stream()
            .map(Transaction::getValue)
            .reduce(Integer::max);
        System.out.println(highestValue.get());
                
           
        // System.out.println(allTradersByName);

        Optional<Transaction> transactionWithSmallestValue = transactions.stream()
        .reduce((t1, t2) ->
                  t1.getValue() < t2.getValue() ? t1 : t2);
        Optional<Transaction> smallestTransaction = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
            
        System.out.println(transactionWithSmallestValue.get().getValue());

        Map<Integer, List<Transaction>> transactionsByCurrencies =
        transactions.stream().collect(groupingBy(Transaction::getYear));
        transactionsByCurrencies.forEach((x,y)->System.out.println(x+" "+y));


    }
}
