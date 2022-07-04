package n1e2;

public class GenericMethods {

    public GenericMethods() {
    }

    public static <T> void imprimirArguments(T t1, T t2, T t3) {
        System.out.println("Paràmetre 1: " + t1);
        System.out.println("Paràmetre 2: " + t2);
        System.out.println("Paràmetre 3: " + t3);
    }
}
