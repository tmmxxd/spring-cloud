package cn.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单
 *
 * @author tsz
 * @date 2021/10/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private User user;
    private List<Item> items;
}
