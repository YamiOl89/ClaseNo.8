package base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Debes crear una instancia de PizzaItaliana y agregar los ingredientes
        PizzaItaliana pizza = new PizzaItaliana("Pizza Margherita");
        pizza.addTopping(new Topping("Tomato", 1.5));
        pizza.addTopping(new Topping("Mozzarella", 2.0));
        pizza.addTopping(new Topping("Basil", 0.5));

        // Calcular y obtener el precio de la pizza
        double pizzaPrice = pizza.getPizzaPrice();
        System.out.println("El precio de la pizza es: $" + pizzaPrice);
    }
}

class PizzaItaliana {
    private String name;
    private ArrayList<Topping> toppings = new ArrayList<>();

    public PizzaItaliana(String name) {
        this.name = name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPizzaPrice() {
        double totalPrice = 0.0;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
}

class topping {
    private String name;

    public topping(String name, double price) {
        this.name = name;
    }

    public double getPrice() {
        // Aquí puedes definir el precio de cada ingrediente
        // Por ejemplo, podrías tener un mapa que relacione nombres de ingredientes con sus precios
        // Para este ejemplo, asumiremos que cada ingrediente tiene un precio fijo de 1.0
        return 1.0;
    }

    public String getNombre() {


        return null;
    }

}