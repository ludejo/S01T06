package n2e2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> potipoti = new ArrayList<>();
        potipoti.add(1);
        potipoti.add("#1");
        potipoti.add(1.5);
        VariadicMethod.showElements(potipoti);
    }
}
