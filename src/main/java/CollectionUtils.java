import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionUtils<T extends Comparable<T>> implements Comparable<T>{
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }
    public static<T> List newArrayList() {
        List<T> newArrayList = new ArrayList<>();
        return newArrayList;
    }

    public static<T> int indexOf(List<? extends T> source, T t) { // Producer extends
        return source.indexOf(t);
    }

    public static<T> Stream<T> limit(List<T> source, int size) {
        return source.stream().limit(size);
    }

    public static<T> void add(List<? super T> source, T t) { // Consumer
        source.add(t);
    }

    public static<T> void removeAll(List<? extends T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        boolean result;
        for (T element : c2) {
            if (c1.contains(element)){
                return result = true;
            }
        }
        return false;
    }

    public static <T extends Comparable<? super T>> List range(List list, T min, T max) {
        List<T> newList = new ArrayList<>();
        for (Object element : list) {
            Integer diffMin = (Integer) element - (Integer) min;
            Integer diffMax = (Integer) element - (Integer) max;
            if (diffMin >= 0 && 0 >= diffMax) {
                newList.add((T) element);
            }
        }
        Collections.sort(newList);
        return newList;
    }

    public static<T extends Comparable<? super T>> List range(List<? extends T> list, T min, T max, Comparator comparator) {
        List<T> newList = new ArrayList<>();
        for (Object element : list) {
            Integer diffMin = (Integer) element - (Integer) min;
            Integer diffMax = (Integer) element - (Integer) max;
            if (diffMin >= 0 && 0 >= diffMax) {
                newList.add((T) element);
            }
        }
        newList.sort(comparator);
        return newList;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
