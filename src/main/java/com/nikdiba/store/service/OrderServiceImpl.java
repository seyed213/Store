package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.OrderMapper;
import com.nikdiba.store.apiModel.Order.AddToOrderRequest;
import com.nikdiba.store.apiModel.Order.GetOrderByIdResponse;
import com.nikdiba.store.entity.Order;
import com.nikdiba.store.entity.OrderProduct;
import com.nikdiba.store.entity.Product;
import com.nikdiba.store.enums.OrderStatus;
import com.nikdiba.store.repository.OrderProductRepository;
import com.nikdiba.store.repository.OrderRepository;
import com.nikdiba.store.repository.ProductRepository;
import com.nikdiba.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderProductRepository orderProductRepository;


//        order.setUser(userRepository.findById(addToOrderRequest.getUserId()).get());
//        Order createdOrder = orderRepository.save(order);
//
//        Product product = productRepository.findById(addToOrderRequest.getProductId()).get();
//        OrderProduct orderProduct = new OrderProduct();
//        orderProduct.setProduct(product);
//        orderProduct.setPrice(product.getPrice());
//        orderProduct.setOrder(createdOrder);
//
//        OrderProduct createdOrderProduct = orderProductRepository.save(orderProduct);
//
//        return createdOrder;


    @Override
    public GetOrderByIdResponse getOrder(Long id) {

        Order order = orderRepository.findById(id).get();

        GetOrderByIdResponse response = OrderMapper.Instance.map2(order);


        return response;


    }

}
