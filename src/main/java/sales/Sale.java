package sales;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sale {
    private String item;
    private int quantity;
    private double pricePerUnit;

}
