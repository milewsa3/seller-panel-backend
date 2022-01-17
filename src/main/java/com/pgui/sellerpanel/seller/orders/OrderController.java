package com.pgui.sellerpanel.seller.orders;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class OrderController {

    OrderRepository repository;

    @GetMapping
    public Page<Order> getAll(@RequestParam(defaultValue = "0") Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, 5);
        return repository.findAll(pageable);
    }
}
