package ttt.domain;

import java.util.Date;
import lombok.Data;
import ttt.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
}
