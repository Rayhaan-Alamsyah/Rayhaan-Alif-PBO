package handson5;

public class CompareUtil {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        if (a == null || b == null) {
            return a == b;
        }
        return a.compareTo(b) == 0;
    }
}
