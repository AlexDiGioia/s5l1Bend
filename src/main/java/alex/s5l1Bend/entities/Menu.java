package alex.s5l1Bend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    //public Menu(List<Pizza> pizzas, List<Drink> drinks) {
    //    this.pizzas = pizzas;
    //    this.drinks = drinks;
    //}

    @Override
    public String toString() {
        StringBuilder menuDescription = new StringBuilder("Menu:\nPizze:\n");
        for (Pizza pizza : pizzas) {
            menuDescription.append(pizza.toString()).append("\n");
        }
        menuDescription.append("Drinks:\n");
        for (Drink drink : drinks) {
            menuDescription.append(drink.toString()).append("\n");
        }
        return menuDescription.toString();
    }
}