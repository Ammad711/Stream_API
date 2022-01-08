package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        // ***With and without stream API
        //Q) Create a list and filter all even numbers from list
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(50);
        list1.add(3);
        list1.add(11);
        list1.add(67);

        List<Integer> list2=Arrays.asList(23,34,55,66,38);
        //list1
        //without stream
        List<Integer> listeven=new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0){
                listeven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listeven);

        // Using Stream
        Stream<Integer> stream=list1.stream();
//        List<Integer> newlist=stream.filter(i->i%2==0).collect(Collectors.toList());  //lambda expression
//        System.out.println(newlist);

        List<Integer> newlist=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);

        List<Integer> newlist1 =list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newlist1);

    }
}
