package com.pgui.sellerpanel.seller.orders;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class OrderController {

    OrderRepository repository;

    @GetMapping
    public Page<Order> getAll(@RequestParam(defaultValue = "0") Integer page) {
        Pageable pageable = PageRequest.of(page, 5);
        return repository.findAll(pageable);
    }

    @GetMapping("/{type}")
    public Page<Order> getAll(@PathVariable String type, @RequestParam(defaultValue = "0") Integer page) {
        Pageable pageable = PageRequest.of(page, 5);
        return repository.findAllByType(type, pageable);
    }

    @GetMapping("/count")
    public OrderCounts countOrders() {
        Long notSendCount = repository.countByType("not-send");
        Long unpaidCount = repository.countByType("unpaid");
        Long returnsCount = repository.countByType("returns");

        return OrderCounts.builder()
                .notSendCount(notSendCount)
                .unpaidCount(unpaidCount)
                .returnsCount(returnsCount)
                .build();
    }
}
