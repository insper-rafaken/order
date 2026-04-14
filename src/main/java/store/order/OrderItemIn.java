package store.order;

import lombok.Builder;

@Builder
public record OrderItemIn(

    String idproduto,
    Integer quantidade

) {

}
