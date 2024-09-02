package alex.s5l1Bend.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzaMenuConfig {

    @Bean
    public Topping formaggio() {
        return new Topping("Formaggio", 0.69, 92);
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 0.99, 35);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 0.69, 22);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Ananas", 0.79, 24);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 0.99, 86);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 1.29, 0);
    }

    @Bean
    public Drink vino() {
        return new Drink("Vino (0.75l, 13%)", 7.49, 607);
    }

    @Primary
    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 4.99, 1104, "M");
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("Hawaiian Pizza", 6.49, 1024, "M");
        pizza.addTopping(prosciutto());
        pizza.addTopping(pineapple());
        return pizza;
    }

    @Bean
    public Pizza diavola() {
        Pizza pizza = new Pizza("Diavola", 5.99, 1160, "M");
        pizza.addTopping(salami());
        return pizza;
    }

    @Bean
    public Pizza MaxiprosciuttoFunghi() {
        Pizza pizza = new Pizza("MAXI Prosciutto e Funghi", 7.69, 2354, "XL");
        pizza.addTopping(prosciutto());
        pizza.addTopping(funghi());
        return pizza;
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margherita(), hawaiianPizza(), diavola(), MaxiprosciuttoFunghi());
        List<Drink> drinks = Arrays.asList(lemonade(), water(), vino());
        return new Menu(pizzas, drinks);
    }
}