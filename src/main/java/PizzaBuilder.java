abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }
    public void createNewPizzaProduct(){ pizza = new Pizza();}

    public abstract void buildCiasto();
    public abstract void buildSos();
    public abstract void buildPromien();
}
