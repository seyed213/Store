package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.Order.GetOrderByIdResponse;
import com.nikdiba.store.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper Instance = Mappers.getMapper(OrderMapper.class);


    @Mapping(source = "total_price", target = "totalPrice")
    GetOrderByIdResponse map2(Order order);

}
