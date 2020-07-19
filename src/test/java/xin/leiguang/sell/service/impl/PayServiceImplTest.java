package xin.leiguang.sell.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.leiguang.sell.dto.OrderDTO;
import xin.leiguang.sell.service.OrderService;
import xin.leiguang.sell.service.PayService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    void create() {
        OrderDTO orderDTO = orderService.findOne("1595088210876409585");
        payService.create(orderDTO);
    }

    @Test
    void refund() {
        OrderDTO orderDTO = orderService.findOne("1595088210876409585");
        payService.refund(orderDTO);
    }
}