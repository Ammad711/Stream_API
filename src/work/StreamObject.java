package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        System.out.println("hello");
        // Stream API - collection process
        // Collection / group of objects such as arrays
        // Arrays.stream()

        // 1 - blank
        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });
        // 2 - array , object , collection
        String names[]={"Durgesh","Uttam","Ankit","Divya"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 Builder pattern
        Stream<Object> build=Stream.builder().build();

        // 4 Array Stream
        //IntStream
        IntStream stream= Arrays.stream(new int[]{22,3,21,233,45});
        stream.forEach(e-> {
            System.out.println(e);
        });

        // 5 List , Set
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(50);
        list1.add(3);
        list1.add(11);
        list1.add(67);
        Stream<Integer> stream2=list1.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });


    }
}
