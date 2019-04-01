public class SzefKuchni {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void zrobPizze(){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildCiasto();
        pizzaBuilder.buildSos();
        pizzaBuilder.buildPromien();
    }
}
