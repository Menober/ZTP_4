public class Pizza {
    String ciasto = "";
    String sos = "";
    int srednica = 0;

    public void setCiasto(String ciasto) {
        this.ciasto = ciasto;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setSrednica(int srednica) {
        this.srednica = srednica;
    }

    public void show() {
        System.out.println("Ciasto: " + ciasto + " Sos: " + sos + " Srednica: " + srednica );
    }
}
