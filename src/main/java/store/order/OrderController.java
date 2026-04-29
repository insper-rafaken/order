package store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "order",
    url = "${order.url}"
)
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(
        @RequestBody OrderIn in
    );

    @GetMapping("/orders")
    public ResponseEntity<List<OrderOut>> findAll();

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderOut> findById(
        @PathVariable String id,
        @RequestParam(required = false) String currency
    );

}