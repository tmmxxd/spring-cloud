package cn.tedu.sp01.service;


import cn.tedu.sp01.pojo.Order;

/**
 * 订单服务
 *
 * @author tsz
 * @date 2021/10/25
 */
public interface OrderService {
    /**
     * 模拟根据订单id得到订单
     *
     * @param orderId 订单id
     * @return {@link Order}
     */
    Order getOrder(String orderId);

    /**
     * 添加订单
     *
     * @param order 订单
     */
    void addOrder(Order order);
}

