package luiznux.learning.microservices.client;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import luiznux.learning.microservices.order.Order;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

    @Id
    private Long id;
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    @OneToMany
    private List<Order> orders;
}

