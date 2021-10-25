package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

/**
 * 商品服务
 *
 * @author tsz
 * @date 2021/10/25
 */
public interface ItemService {
    /**
     * 模拟获取全部商品
     *
     * @param orderId 订单id
     * @return {@link List}<{@link Item}>
     */
    List<Item> getItems(String orderId);

    /**
     * 模拟减少商品数量
     *
     * @param list 商品列表
     */
    void decreaseNumbers(List<Item> list);
}
