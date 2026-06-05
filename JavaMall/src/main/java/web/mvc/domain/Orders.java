package web.mvc.domain;

import jakarta.persistence.*;
import lombok.*;

import javax.sound.sampled.Line;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId; //pk
    private String orderDate;
    private String userId;//fk
    private String address;
    private int totalAmount;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderLine> orderLineList = new ArrayList<>();
}
