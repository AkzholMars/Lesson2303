import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < 20; i++){
            int r = (int) (Math.random() * (9-1)) + 1;
            integers.add(r);
        }

        //integers.forEach(System.out::print);
        System.out.println(integers);

        for (Integer integer : integers){

            if (!integerSet.add(integers.get(integer))){
                integers1.add(integer);
                count++;

            }
        }
        System.out.println(integerSet);
        //integerSet.forEach(System.out::print);
        System.out.println(integers1);
        System.out.println("Count: " + count);
        //integers1.forEach(System.out::print);
    }
}