package store.order;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record OrderItemOut(

    String id,
    String productId,
    Integer quantity,
    BigDecimal total

) {

}
