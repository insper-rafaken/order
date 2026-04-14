package store.order;

import lombok.Builder;

@Builder
public record OrderItemOut(

    String id,
    String idproduto,
    Integer quantidade,
    Double total

) {

}
