import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 60; i++) {
            Pizza pizza = Pizzeria.getPizza(losujCiasto(), losujSos(), losujSrednice());
            pizza.show();
            System.out.println();
        }

        Pizza pizza = Pizzeria.getPizza("grube", "pomidorowy", 42);
        pizza.show();
        System.out.println();
    }

    private static String losujCiasto() {
        switch (new Random().nextInt(4)) {
            case 0:
                return "grube";
            case 1:
                return "cienkie";
            default:
                return "tradycyjne";
        }
    }
    private static String losujSos() {
        switch (new Random().nextInt(6)) {
            case 0:
                return "pomidorowy";
            case 1:
                return "czosnkowy";
            case 2:
                return "ziołowy";
            case 3:
                return "ostry";
            default:
                return "jogurtowy";
        }
    }
    private static int losujSrednice() {
       return new Random().nextInt(17)+26;
    }


}
