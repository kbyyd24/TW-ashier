package cn.gaoyuexiang.ashier;

import cn.gaoyuexiang.exception.GoodsNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by melo on 16-5-27.
 * 测试第二个半价收银台的功能
 */
public class SecondHalfAshierTest {

    /*收银台*/
    private Ashier ashier;

    /**
     * 初始化收银台并加载商品信息
     * @throws IOException
     */
    @Before
    public void initAshier() throws IOException {
        ashier = new SecondHalfAshier();
        ashier.loadLists();
    }

    /**
     * 正常购物车的测试方法，包含了如下情况：
     *   * 条形码出现两次
     *   * 条形码后有'-'连接购买数量
     *   * 商品属于优惠商品，且满足优惠条件
     *   * 商品属于优惠商品，但不满足优惠条件
     * @throws GoodsNotFoundException
     */
    @Test
    public void checkout() throws GoodsNotFoundException {
        String[] cart = new String[]{"ITEM000000", "ITEM000000", "ITEM000002-2", "ITEM000001-3", "ITEM000003"};
        String ticket = ashier.checkout(cart);
        System.out.println(ticket);
    }

    /**
     * 包含商店不存在的商品条形码的购物车测试方法
     */
    @Test
    public void checkoutErrorCart() {
        String[] cart = new String[]{"ITEM000000-5", "ITEM000007"};
        try {
            String ticket = ashier.checkout(cart);
            System.out.println(ticket);
        } catch (GoodsNotFoundException e) {
            System.err.println("Goods not found : " + e.getMessage());
        }
    }

}