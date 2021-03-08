package luiznux.learning.microservices.product;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
