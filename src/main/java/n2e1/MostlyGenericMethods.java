package n2e1;

public class MostlyGenericMethods {
    public MostlyGenericMethods() {
    }

    public static <T> void imprimirArguments(T t1, int i2, T t3) {
        System.out.println("Paràmetre 1: " + t1);
        System.out.println("Paràmetre 2: " + i2);
        System.out.println("Paràmetre 3: " + t3);
    }
}
