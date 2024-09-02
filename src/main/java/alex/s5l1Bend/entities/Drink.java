package alex.s5l1Bend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
    private String name;
    private double price;
    private int calories;

    @Override
    public String toString() {
        return String.format("%s - Calorie: %d - Prezzo: €%.2f", name, calories, price);
    }
}
