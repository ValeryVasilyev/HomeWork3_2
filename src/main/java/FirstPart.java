import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface FirstPart {

    /** Заполняем массив значениями */
    static List<String> fillArray(){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("C++");
        list.add("Python");
        list.add("PHP");
        list.add("JavaScript");
        list.add("Ruby");
        list.add("Go");
        list.add("C#");
        list.add("C#");
        list.add("Python");
        list.add("Python");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        return list;
    }

    /** Метод выводит в консоль уникальные значения из массива */
    static void getUniqueValues(List<String> list){
        HashSet<String> uniqueValues = new HashSet<>(list);
        System.out.println("Unique values:");
        for(String value : uniqueValues){
            System.out.println(value);
        }
    }
    /** Метод выводит в консоль количество повторений по каждому уникальному значению */
    static void countValues(List<String> list){
        HashSet<String> uniqueValues = new HashSet<>(list);
        for(String uniqueValue : uniqueValues){ //
            int count = 0;
            for(String value : list){
                if(uniqueValue.equals(value)){
                     count++;
                 }
            }
            System.out.println("Value " + uniqueValue + " has count: " + count);
        }
    }
}
