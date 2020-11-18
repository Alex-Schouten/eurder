package com.alex.eurder.service.mapper;

import com.alex.eurder.service.dto.OrderDTO;
import com.alex.eurder.business.entity.shop.Order;
import com.alex.eurder.service.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order toEntity(OrderDTO orderDTO) {
        Order result = new Order(orderDTO.getCustomerId(), orderDTO.getItemId());
        return result;
    }

    public OrderDTO toDTO(Order order){
        OrderDTO result = new OrderDTO();
        result.setOrderId;
    }
}
