package pizza;


import ingredients.Toppingable;

/**
 * Pizza
 */
public class Pizza {
    private Toppingable[] toppings;
    private String name;


    public Pizza(Toppingable[] toppings, String name) {
        this.setToppings(toppings);
        this.setName(name);
    }

    public Toppingable[] getToppings() {
        return toppings;
    }


    public void setToppings(Toppingable[] toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


}