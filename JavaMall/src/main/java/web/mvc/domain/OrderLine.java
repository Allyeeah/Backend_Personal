package web.mvc.domain;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderLineId; //pk 시퀀스관리
    private int orderId; //fk
    private String goodsId;
    private int unitPrice;
    private int qty;  //주문수량
    private int amount; //unitPrice * qty

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;
}
