package luiznux.learning.microservices.order;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {

    @Id
    private Long id;

    @Column
    private Integer idClient;

    @Column
    private Integer amount;

    @Column
    @ElementCollection
    private List<Long> shopListId;
}
