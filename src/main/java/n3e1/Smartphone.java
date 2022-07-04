package n3e1;

public class Smartphone implements Telefon {

    public void ferFotos() {
        System.out.println("Fent foto...");
    }

    @Override
    public void trucar() {
        System.out.println("Trucant...");
    }
}
