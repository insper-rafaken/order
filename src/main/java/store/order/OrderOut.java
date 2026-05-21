package store.order;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;

@Builder
public record OrderOut(

    String id,
    String date,
    List<OrderItemOut> items,
    BigDecimal total,
    String currency

) {

}
