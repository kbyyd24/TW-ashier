package cn.gaoyuexiang.ashier;

import cn.gaoyuexiang.entry.Cart;
import cn.gaoyuexiang.shop.Shop;
import cn.gaoyuexiang.exception.GoodsNotFoundException;
import cn.gaoyuexiang.shop.Ticket;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * interface to use ashier
 */
public interface Ashier {

    /**
     * 结帐方法
     * @param cart 账单信息
     * @return 格式化的小票字符串
     * @throws GoodsNotFoundException
     */
    Ticket checkout(ArrayList<Cart> carts)
            throws GoodsNotFoundException;
}
