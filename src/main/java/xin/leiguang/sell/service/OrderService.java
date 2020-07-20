package xin.leiguang.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xin.leiguang.sell.dataobject.OrderMaster;
import xin.leiguang.sell.dto.OrderDTO;

public interface OrderService {

    /**
     * 创建订单
     */
    public OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询某用户的订单列表
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * 查询所有的订单列表
     */
    Page<OrderDTO> findList(Pageable pageable);
}
