package n1e1;

public class NoGenericMethods {
    private String cadena1;
    private String cadena2;
    private String cadena3;

    public NoGenericMethods(String cadena1, String cadena2, String cadena3) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
        this.cadena3 = cadena3;
    }

    public String getCadena1() {
        return cadena1;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public String getCadena3() {
        return cadena3;
    }

    public void setCadena3(String cadena3) {
        this.cadena3 = cadena3;
    }
}
