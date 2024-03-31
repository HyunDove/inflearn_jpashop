package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery",fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    /** EnumType
     *  ORDINAL : 숫자로 들어간다. => READY 1, COMP 2
     *  중간에 다른 컬럼이 생기면 숫자가 뒤로 밀리기에 절대 사용하면 안된다.
     *  STRING로 사용!
     * */
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP

}
