package hiteshtestautomation;

import java.util.Comparator;

public class GenericGpaComparator<T extends GenericIStudent<?, ?, Double>> implements Comparator<T> {
    @Override
    public int compare(T t, T t1) {
        return Double.compare(t.getGpa(), t1.getGpa());
    }
}
