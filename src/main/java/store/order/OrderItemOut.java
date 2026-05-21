package store.order;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record OrderItemOut(

    String id,
    Product product,
    Integer quantity,
    BigDecimal total

) {

    @Builder
    public record Product(String id) {}

}
