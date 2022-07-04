package n2e2;

import java.util.List;

public class VariadicMethod {
    public static <T> void showElements(List<T> t1) {
        for (T i : t1) {
            System.out.println(i);
        }
    }
}
