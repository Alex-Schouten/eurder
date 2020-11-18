package com.alex.eurder.service;

import com.alex.eurder.business.entity.shop.Order;
import com.alex.eurder.business.repository.OrderRepository;
import com.alex.eurder.service.dto.OrderDTO;
import com.alex.eurder.service.dto.users.CustomerDTO;
import com.alex.eurder.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private OrderMapper orderMapper;
    private ItemService itemService;
    private CustomerService customerService;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper, ItemService itemService, CustomerService customerService) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.itemService = itemService;
        this.customerService = customerService;
    }

    public OrderDTO OrderAnItem(OrderDTO orderDTO) {
        Order order = orderRepository.orderAnItem(OrderMapper.toEntity(orderDTO));
        OrderDTO result = orderMapper.toDTO(order);
        return result ;
    }
}
