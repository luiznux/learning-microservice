package luiznux.learning.microservices.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private Long id;

    @Column
    private LocalDateTime createdAt;

    @Column
    private OrderStatus orderStatus;

    @Column
    private Long clientId;

    @Column
    @OneToMany
    private List<OrderItem> orderItem;
}
