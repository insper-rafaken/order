package store.order;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;

@Builder
public record OrderOut(

    String id,
    LocalDateTime createdAt,
    String currency,
    List<OrderItemOut> items,
    Double total

) {

}
