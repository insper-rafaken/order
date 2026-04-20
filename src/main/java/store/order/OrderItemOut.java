package store.order;

import lombok.Builder;

@Builder
public record OrderItemOut(

    String idProduct,
    Integer quantity,
    Double price

) {

}
