package cn.tedu.sp04.order.service;

import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.service.OrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 订单服务impl
 *
 * @author tsz
 * @date 2021/10/25
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 得到订单
     *
     * @param orderId 订单id
     * @return {@link Order}
     */
    @Override
    public Order getOrder(String orderId) {
        //TODO: 调用user-service获取用户信息
        //TODO: 调用item-service获取商品信息
        Order order = new Order();
        order.setId(orderId);
        return order;
    }

    /**
     * 添加订单
     *
     * @param order 订单
     */
    @Override
    public void addOrder(Order order) {
        //TODO: 调用item-service减少商品库存
        //TODO: 调用user-service增加用户积分
        log.info("保存订单：" + order);
    }

}
