package day57;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //1. ArrayList

        ArrayList<Integer> numbers=new ArrayList<>();


        //2. List.of metodu
        List<Integer> numbers1=List.of(1,2,3,4,5);

        //3. Arrays.asList
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //4. Collections.addAll
        Collections.addAll(numbers,1,2,3,4,5);

        numbers.add(6);
        numbers.add(0,7);

        System.out.println(numbers);

        numbers.addAll(integers);

        System.out.println(numbers);

        numbers.addAll(6,numbers1);

        System.out.println(numbers);


        System.out.println("Numbers size: "+numbers.size());


        Integer integer = numbers.get(0);
        System.out.println("İlk eleman : "+integer);

        numbers.forEach(number-> System.out.printf("%d x %d = %d\n",number,number,number*number));
        System.out.println("--------------------------------");
        numbers.forEach(item->{
            int kare=item*item;
            System.out.println(kare);
        });

        System.out.println("--------------------");
        Iterator<Integer> iterator = numbers.iterator();
        if(iterator.hasNext()) System.out.println(iterator.next());
        System.out.println("--------------------------");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
}
