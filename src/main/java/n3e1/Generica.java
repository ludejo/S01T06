package n3e1;

public class Generica {

    // En estar upper-bounded per Telefon, que es interfície, no es pot cridar el métode fer fotos quan es passa un objecte de tipus Smartphone
    public static <T extends Telefon> void genericTelefon(T t1) {
        t1.trucar();
    }

    public static <T extends Smartphone> void genericSmartphone(T t1) {
        t1.trucar();
        t1.ferFotos();
    }
}
