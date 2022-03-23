package com.example.demo.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.config.MessageConfig;
import com.example.demo.dto.Order;
import com.example.demo.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
    	order.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderStatus= new OrderStatus(order, "PROCESS","order placed successfully in" + restaurantName);
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, orderStatus);
		return "success !!";
    }
}
