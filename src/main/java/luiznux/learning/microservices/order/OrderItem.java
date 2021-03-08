package luiznux.learning.microservices.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

   @Id
   private Long id ;

   @ManyToOne(fetch = FetchType.LAZY)
   @Column
   private Order order;

   @Column
   private Long productId;
}
