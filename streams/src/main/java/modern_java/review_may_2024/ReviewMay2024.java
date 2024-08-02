package modern_java.review_may_2024;

import modern_java.example.traders.Transaction;
import modern_java.example.traders.TransactionFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static modern_java.example.traders.TransactionFactory.generateTransactions;


public class ReviewMay2024 {
    public static void main(String [] args){

//        8 Find the transaction with the smallest value.
        //1 Find all transactions in the year 2011 and sort them by value (small to high).
        generateTransactions().stream()
                .filter(x->x.getYear()==2011)
                .sorted(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction o1, Transaction o2) {
                        return o2.getValue()-o2.getValue();
                    }
                })
                .forEach(System.out::println);
        System.out.println("*********************");
        generateTransactions().stream()
                .filter(x->x.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println("*********************");

        //        2 What are all the unique cities where the traders work?
        generateTransactions().stream()
                .map(x->x.getTrader()
                .getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println("*********************");

//        3 Find all traders from Cambridge and sort them by name.
        generateTransactions().stream()
                .filter(x->x.getTrader().getCity().equals("Cambridge"))
                .map(x->x.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);
        System.out.println("*********************");

        // 4 Return a string of all traders’ names sorted alphabetically.
        generateTransactions().stream()
                .map(x->x.getTrader().getName())
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("*********************");
        // 5 Are any traders based in Milan?
        boolean van = generateTransactions().stream()
                .anyMatch(x->x.getTrader().getCity().equals("Milan"));
        System.out.println(van);

        System.out.println("*********************");
        // 6 Print the values of all transactions from the traders living in Cambridge.
        generateTransactions().stream()
                .filter(x->x.getTrader().getCity().equals("Cambridge"))
                .map(x->x.getValue())
                .forEach(System.out::println);

        System.out.println("*********************");

        // 7 What’s the highest value of all the transactions?
        Optional<Integer> maxVal = generateTransactions().stream()
                .map(x->x.getValue())

                .max((x,y)->x.compareTo(y));
        if(maxVal.isPresent()) System.out.println(maxVal.get());


        // 7 What’s the highest value of all the transactions?
        int sumVal = generateTransactions().stream()
                .mapToInt(Transaction::getValue)
                .sum();

        Optional<Integer> sumVal2 = generateTransactions().stream()
                .map(Transaction::getValue)
                .reduce(Integer::sum);

        int sumVal3 = generateTransactions().stream()
                .map(Transaction::getValue)
                .reduce(0, (a, b) -> a + b);

        Optional<Integer> sumVal4 = generateTransactions().stream()
                .map(Transaction::getValue)
                .reduce((a, b) -> a + b); // Manuálisan adjuk össze a tranzakció értékeit

        if (sumVal4.isPresent()) {
            System.out.println("Az összeg: " + sumVal4.get());
        }
            List<String> words = Arrays.asList("Hello", "World", "from", "Java");
            Optional<String> sentence = words.stream()
                    .reduce((a, b) -> a + " " + b);

            sentence.ifPresent(System.out::println);
            List<Integer> numbers = Arrays.asList(5, 3, 10, 1, 4);
            Optional<Integer> maxNumber = numbers.stream()
                    .reduce(Math::max);

            maxNumber.ifPresent(max -> System.out.println("A legnagyobb szám: " + max));



        List<Order> orders = Arrays.asList(
                new Order(2, 19.99),
                new Order(1, 5.49),
                new Order(10, 1.99)
        );
       Double totalRevenue = orders.stream()
                .map(Order::getTotalPrice)
                .reduce(0.0, Double::sum);

        System.out.println("Teljes bevétel: " + totalRevenue);

        // 8 Find the transaction with the smallest value.
        Optional<Transaction> transaction = generateTransactions().stream()
                .reduce((x1,x2)->x1.getValue()<x2.getValue()?x1:x2);

        int sumVal5 = generateTransactions().stream()
                .map(x->x.getValue())
                .reduce(0,(x1,x2)->x1+x2);


        System.out.println();
        Optional<Transaction> smallest = generateTransactions().stream()
                .reduce((x1,x2)->x1.getValue()<x2.getValue()?x1:x2)
                ;
        System.out.println(smallest.get());
        String str1 = "string";
        String str2 = str1;
        String str3 = new String("string");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));


        Order order = orders.get(0);
        Order order2 = makeAmends(order);
        System.out.println(order2.price);
    }

    static Order makeAmends(Order order){
        order.setPrice(111);
        order = new Order(2,11.11);
        return order;
    }


}
class Order {
    int quantity;
    double price;

    public void setPrice(double price){
        this.price=price;
    }

    Order(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalPrice() {
        return quantity * price;
    }
}