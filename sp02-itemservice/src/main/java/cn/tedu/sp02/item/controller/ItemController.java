package cn.tedu.sp02.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.service.ItemService;
import cn.tedu.web.util.JsonResult;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * ItemController
 *
 * @author tsz
 * @date 2021/10/25
 */
@Slf4j
@RestController
@SuppressWarnings("rawtypes")
public class ItemController {
    /**
     * 项服务
     */
    @Resource
    private ItemService itemService;

    /**
     * 当前服务端口号
     */
    @Value("${server.port}")
    private int port;

    /**
     * 获取订单下的商品
     *
     * @param orderId 订单id
     * @return {@link JsonResult}<{@link List}<{@link Item}>>
     */
    @GetMapping("/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        log.info("server.port=" + port + ", orderId=" + orderId);

        List<Item> items = itemService.getItems(orderId);
        return JsonResult.ok(items).msg("port=" + port);
    }

    /**
     * 减少数量
     *
     * @param items 商品
     * @return {@link JsonResult}
     */
    @PostMapping("/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        itemService.decreaseNumbers(items);
        return JsonResult.ok();
    }
}
