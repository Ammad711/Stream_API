package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // filter(Predicate)
            // Predicate means boolean valued function meaning will return true or false
            // e->{} //lambda expressions

        // map(function)
        // this will not filter instead will perform operations on elements

        List<String> list=new ArrayList<>();
        list.add("Ankit");
        list.add("Abhinav");
        list.add("Amit");
        list.add("Harun");
        List<String> newlist= list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newlist);

        List<Integer> intlist=new ArrayList<>();
        intlist.add(1);
        intlist.add(33);
        intlist.add(34);
        intlist.add(30);
        intlist.add(22);
        List<Integer> newnumbers=intlist.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newnumbers);
        intlist.stream().forEach(
                e->{
                    System.out.println(e);
                });
        newnumbers.stream().forEach(System.out::println);  // Using method reference

        // sorting of numbers using sorted.
        newnumbers.stream().sorted().forEach(System.out::println);
        Integer min= intlist.stream().min((x,y)->x.compareTo(y)).get(); //Using Comparator method
        System.out.println("Minimum number -> "+min);

        Integer max=intlist.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum number -> "+max);

        

    }
}
