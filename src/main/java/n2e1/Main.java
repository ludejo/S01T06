package n2e1;

public class Main {
    public static void main(String[] args) {
        MostlyGenericMethods.imprimirArguments(1, 2, 3);
        MostlyGenericMethods.imprimirArguments("1", 2, "3");
        // La següent crida no es pot executar al no coincidir els tipus dels par
        // MostlyGenericMethods.imprimirArguments("1", "2", "3");
    }

}
