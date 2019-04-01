import java.util.ArrayList;

public class Pizzeria {
    private static final ArrayList<Pizza> pizze = new ArrayList<Pizza>();
    static SzefKuchni szefKuchni = new SzefKuchni();

    public static Pizza getPizza(final String ciasto, final String sos, final int srednica) {
        Pizza pizza = znajdzPizze(ciasto, sos, srednica);
        if (pizza == null) {
            if (ciasto.equals("grube") && sos.equals("pomidorowy") && srednica == 42) {
                pizza = makeDuzaGrubaPizza();
                pizze.add(pizza);
                System.out.println("Mamma mia! Odkryłem grubą pizzę!");
            } else if (ciasto.equals("cienkie") && sos.equals("pomidorowy") && srednica == 30) {
                pizza = makeMalaCienkaPizza();
                pizze.add(pizza);
                System.out.println("Mamma mia! Odkryłem cienką pizzę!");
            } else {
                pizza = makeCustomizowanaPizza(ciasto, sos, srednica);
                pizze.add(pizza);
                System.out.println("O. Jaka ciekawa pizza..");
            }
        }else{
            System.out.println("To już było!!!");
        }
        return pizza;
    }

    private static Pizza makeCustomizowanaPizza(final String ciasto, final String sos, final int srednica) {
        Pizza pizza;
        PizzaBuilder customizowana = new PizzaBuilder() {
            @Override
            public void buildCiasto() {
                pizza.setCiasto(ciasto);
            }

            @Override
            public void buildSos() {
                pizza.setSos(sos);
            }

            @Override
            public void buildPromien() {
                pizza.setSrednica(srednica);
            }
        };
        szefKuchni.setPizzaBuilder(customizowana);
        szefKuchni.zrobPizze();
        pizza = szefKuchni.getPizza();
        return pizza;
    }

    private static Pizza makeMalaCienkaPizza() {
        Pizza pizza;
        PizzaBuilder malacienka = new MalaCienkaPizzaBuilder();
        szefKuchni.setPizzaBuilder(malacienka);
        szefKuchni.zrobPizze();
        pizza = szefKuchni.getPizza();
        return pizza;
    }

    private static Pizza makeDuzaGrubaPizza() {
        Pizza pizza;
        PizzaBuilder duzagruba = new DuzaGrubaPizzaBuilder();
        szefKuchni.setPizzaBuilder(duzagruba);
        szefKuchni.zrobPizze();
        pizza = szefKuchni.getPizza();
        return pizza;
    }

    private static Pizza znajdzPizze(String ciasto, String sos, int srednica) {
        for (Pizza pizza : pizze) {
            if (pizza.ciasto.equals(ciasto) && pizza.sos.equals(sos) && pizza.srednica == srednica)
                return pizza;
        }
        return null;
    }
}
