package xin.leiguang.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import xin.leiguang.sell.dataobject.OrderDetail;
import xin.leiguang.sell.dto.OrderDTO;
import xin.leiguang.sell.enums.ResultEnum;
import xin.leiguang.sell.exception.SellException;
import xin.leiguang.sell.form.OrderForm;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid((orderForm.getOpenid()));

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException((ResultEnum.PARAM_ERROR));
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
