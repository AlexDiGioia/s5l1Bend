package alex.s5l1Bend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    private String name;
    private double basePrice;
    private int baseCalories;
    private String size; //standard o XL
    private List<Topping> toppings = new ArrayList<>();

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getTotalPrice() {
        return basePrice + toppings.stream().mapToDouble(Topping::getPrice).sum();
    }

    public int getTotalCalories() {
        return baseCalories + toppings.stream().mapToInt(Topping::getCalories).sum();
    }

    @Override
    public String toString() {
        StringBuilder pizzaDescription = new StringBuilder(size + " " + name + " (tomato, cheese");
        for (Topping topping : toppings) {
            pizzaDescription.append(", ").append(topping.getName());
        }
        pizzaDescription.append(") - Calories: ").append(getTotalCalories())
                .append(" - Price: €").append(getTotalPrice());
        return pizzaDescription.toString();
    }
}

