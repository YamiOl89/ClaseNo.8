package Interface;

public class PizzaBase implements  {

    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void prepare() {
        System.out.println("Preparing " + nombre);
    }
}
