package luiznux.learning.microservices.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "client", uniqueConstraints = {
        @UniqueConstraint(name = "uk_email",columnNames = {"email"})})
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;
}

