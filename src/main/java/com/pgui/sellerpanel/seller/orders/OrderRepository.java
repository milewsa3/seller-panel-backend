package com.pgui.sellerpanel.seller.orders;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    Page<Order> findAllByType(String type, Pageable pageable);

    Long countByType(String type);
}
