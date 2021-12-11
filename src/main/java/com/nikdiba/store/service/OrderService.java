package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.Order.AddToOrderRequest;
import com.nikdiba.store.apiModel.Order.GetOrderByIdResponse;
import com.nikdiba.store.entity.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {




    GetOrderByIdResponse getOrder(Long id) throws Exception;

}
