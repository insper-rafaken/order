package store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "order",
    url = "http://order:8080"
)
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(
        @RequestBody OrderIn in,
        @RequestHeader("idAccount") String idAccount
    );

    @GetMapping("/orders")
    public ResponseEntity<List<OrderOut>> findAll(
        @RequestHeader("idAccount") String idAccount
    );

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderOut> findById(
        @PathVariable String id,
        @RequestHeader("idAccount") String idAccount,
        @RequestParam(required = false) String currency
    );

}
