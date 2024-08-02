package com.company;
import javax.print.DocFlavor;
import java.util.Hashtable;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        Iterator i =  ((LinkedList<Integer>) a).descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ArrayList<String> obj = new ArrayList<>();

        obj.add("vino");
        obj.add("ajith");
        obj.add("praveen");
        obj.add("naveen");

        ListIterator<String> it = obj.listIterator(obj.size());
        while (it.hasPrevious())
            System.out.println(it.previous());

        Vector <Integer> vec = new Vector<Integer>(3);
        vec.add(100);
        vec.addAll(a);
        System.out.println();
        Enumeration n = vec.elements();
        while(n.hasMoreElements()){
            System.out.println(n.nextElement());
        }
        System.out.println(vec.capacity());
        vec.addAll(a);
        vec.addAll(a);
        vec.add(5);
        while(n.hasMoreElements()){
            System.out.println(n.nextElement());
        }

        System.out.println(vec.capacity());
//        Map<Integer,String> map = new HashMap<>();
//        map.put(5,"Adam");
//        map.put(2,"Ildi");
//        map.put(1,"Karoly");
//
//        map.forEach((k,v)-> System.out.println(k+v));
//
//        for( Integer j : map.keySet()){
//            System.out.println(j+" "+map.get(j));
//        }
//        Map<Integer,String> map2 = new TreeMap<>(map);
//        map2.forEach((k,v)-> System.out.println(k+v));

        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(5,"Adam");
        map.put(2,"Ildi");
        map.put(1,"Karoly");

        map.forEach((k,v)-> System.out.println(k+v));

        for( Integer j : map.keySet()){
            System.out.println(j+" "+map.get(j));
        }
//        Map<Integer,String> map2 = new TreeMap<>(map);
//        map2.forEach((k,v)-> System.out.println(k+v));
//        map.replace(5,"bobby");
//        map.forEach((k,v)-> System.out.println(k+v));
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(6);
        int sum =0;
        Iterator<Integer> qa = queue.iterator();
        while (qa.hasNext()){
            sum += qa.next();
        }
        System.out.println(sum);
        System.out.println();
        PriorityQueue<Integer> prio = new PriorityQueue<>(3);
        prio.add(3);
        prio.add(2);
        prio.add(6);
        prio.add(9);
        prio.forEach(k-> System.out.println(k));
        Iterator<Integer> pi = ((LinkedList<Integer>) queue).listIterator(queue.size());
        while (((ListIterator<Integer>) pi).hasPrevious()){
            System.out.println(((ListIterator<Integer>) pi).previous());
        }

        Deque<String> deque = new ArrayDeque<>();
        Integer [] array = {1,2,3};
        String [] arr = {"as","ad","af"};
        List<String> arrList = Arrays.asList(arr);
//        String [] back = (String[]) arrList.toArray();
//        for(Object ii: back){
//            System.out.println(ii);
//        }

        List<String> list = new ArrayList<>(); // empty list
        list.add("Fluffy"); // [Fluffy]
        list.add("Webby"); // [Fluffy, Webby]
        String[] array2 = new String[list.size()]; // empty array
        array2[0] = list.get(1); // [Webby]
        array2[1] = list.get(0); // [Webby, Fluffy]
        for(String iii: array2){
            System.out.println(iii);
        }
        String[] array3 = { "gerbil", "mouse" }; // [gerbil, mouse]
        List<String> list2 = Arrays.asList(array3); // returns fixed size list
        list2.set(1, "test"); // [gerbil, test]
        array3[0] = "new"; // [new, test]
        System.out.println();
        System.out.println();
        String[] array4 =  list2.toArray(new String[0]); // [new, test]
        for(String ii: array4){
            System.out.println(ii);
        }
        ArrayList<Integer> pr = new ArrayList<>();
        pr.add(1);
        pr.add(2);
        pr.remove(new Integer(2));
        System.out.println(pr);

    }


}
