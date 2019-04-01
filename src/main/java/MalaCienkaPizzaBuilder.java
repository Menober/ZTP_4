public class MalaCienkaPizzaBuilder extends PizzaBuilder{
    public void buildCiasto() {
        pizza.setCiasto("cienkie");
    }

    public void buildSos() {
        pizza.setSos("pomidorowy");
    }

    public void buildPromien() {
        pizza.setSrednica(30);
    }

    public void show() {
        System.out.println("Ciasto: " + pizza.ciasto + " Sos: " + pizza.sos + " Srednica: " + pizza.srednica + " Rodzaj pizzy: mala, cienka ");
    }
}
