package store.order;

import lombok.Builder;

@Builder
public record OrderItemOut(

    String productId,
    Integer quantity,
    Double price

) {

}
