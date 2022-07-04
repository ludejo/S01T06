package n1e2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alba", "Álvarez", 30);
        ArrayList<Integer> llistaEnters = new ArrayList<>();
        llistaEnters.add(10);
        llistaEnters.add(20);
        llistaEnters.add(30);
        GenericMethods.imprimirArguments(persona1, 2, "Hello... Neuman");
        GenericMethods.imprimirArguments(0, 1, "1");
        GenericMethods.imprimirArguments(persona1, null, llistaEnters);
    }
}
