package Especialidades;

import base.Pizza;
import java.util.ArrayList; // Agrega esta importación para ArrayList

public class PizzaItaliana extends Pizza {
  private String salsa;

  public String getSalsa() {
    return salsa;
  }

  public void setSalsa(String salsa) {
    this.salsa = salsa;
  }

  public PizzaItaliana(String name, double price, ArrayList<String> toppings, String salsa) {
    super(name, price, toppings);
    this.salsa = salsa;
  }
}
