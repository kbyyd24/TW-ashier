package cn.gaoyuexiang.service;

import cn.gaoyuexiang.dto.Ticket;
import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.OnSaleMsg;
import cn.gaoyuexiang.exception.GoodsNotFoundException;

import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 收银台计算服务接口
 */
public interface AshierService {

    /**
     * 结算购物车
     * @param goodsList 所有商品信息
     * @param onSaleList 优惠商品列表
     * @param cart 购物车商品列表
     * @return 结算出的小票
     */
    Ticket checkout(ArrayList<Goods> goodsList, ArrayList<OnSaleMsg> onSaleList, String[] cart) throws GoodsNotFoundException;
}
