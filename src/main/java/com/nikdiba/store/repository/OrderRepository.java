package com.nikdiba.store.repository;

import com.nikdiba.store.entity.Order;
import com.nikdiba.store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "select * from Order o where o.status=:staus",nativeQuery = true)
    Order orderStatus(String status);

}
