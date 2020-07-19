package xin.leiguang.sell.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.leiguang.sell.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678910");
        orderDetail.setOrderId("111111112");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("1111111123");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(1.23));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        assertNotNull(result);
    }

    @Test
    void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("111111112");
        assertNotEquals(0, orderDetailList.size());
    }
}