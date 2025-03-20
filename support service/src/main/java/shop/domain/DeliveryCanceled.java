package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private String quantity;
    private String address;
    private String orderId;
    private String customerId;

    public DeliveryCanceled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
