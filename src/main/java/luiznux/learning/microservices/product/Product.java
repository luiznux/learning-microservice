package luiznux.learning.microservices.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {

    @Id
    private Long id;

    @Column
    private String prodCode;

    @Column
    private String prodName;

    @Column
    private Integer inventory;

    @Column
    private String description;
}
