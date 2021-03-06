package ku.message.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private long id;

    private String name;
    private double price;

}
