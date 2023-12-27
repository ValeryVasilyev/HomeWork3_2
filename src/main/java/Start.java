import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start{

    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>(); // Consumer (Parent)
        List<Apple> apples = new ArrayList<>(); // Producer (Child)

        Fruit fruit = new Fruit();
        Apple apple = new Apple();

        fruits.add(new Fruit());
        apples.add(new Apple());

        CollectionUtils.addAll(apples, fruits);

        CollectionUtils.newArrayList();

        CollectionUtils.indexOf(fruits, new Fruit());
        CollectionUtils.indexOf(apples, new Fruit());
        CollectionUtils.indexOf(fruits, new Apple());

        CollectionUtils.limit(apples, 1);

        CollectionUtils.add(fruits, new Fruit());
        CollectionUtils.add(fruits, new Apple());
        CollectionUtils.add(apples, new Apple());

        CollectionUtils.removeAll(fruits, apples);
        CollectionUtils.removeAll(apples, fruits);
        CollectionUtils.removeAll(apples, apples);

        CollectionUtils.add(fruits, new Fruit());
        CollectionUtils.add(apples, new Apple());

        fruits.add(fruit);
        fruits.add(apple);
        apples.add(apple);

        System.out.println("Contains all:");
        System.out.println(CollectionUtils.containsAll(apples, fruits));
        System.out.println(CollectionUtils.containsAll(fruits, apples));

        System.out.println("Contains any:");
        System.out.println(CollectionUtils.containsAny(apples, fruits));
        System.out.println(CollectionUtils.containsAny(fruits, apples));

        System.out.println(CollectionUtils.range(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3, 8));

    }

}
