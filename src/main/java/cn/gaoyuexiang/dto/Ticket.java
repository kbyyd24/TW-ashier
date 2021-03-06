package cn.gaoyuexiang.dto;

import cn.gaoyuexiang.entry.Goods;

import java.util.HashMap;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 结算小票，保存打印小票需要的信息
 */
public class Ticket {
    /*实际支付价格*/
    private double allPrice;
    /*优惠的价格*/
    private double prePrice;
    /*商品列表*/
    private HashMap<String, Production> items = new HashMap<String, Production>();

    /**
     * 添加商品到小票，同时更新总价
     * @param goods 商品信息
     * @param isOnSale 是否优惠
     */
    public void addGoods(Goods goods, boolean isOnSale) {
        if (items.containsKey(goods.getBarcode())) {
            String barcode = goods.getBarcode();
            items.get(barcode).addOne();
            this.updatePrice(items.get(barcode));
        } else {

            Production goodsInTicket = new Production(
                    goods.getName(), goods.getUnit(), goods.getPrice(), isOnSale
            );
            items.put(goods.getBarcode(), goodsInTicket);
            this.updatePrice(goodsInTicket);
        }
    }

    /**
     * 更新总价
     * @param goods 商品
     */
    private void updatePrice(Production goods) {
        double price = goods.getPrice();
         if (goods.getNumber() % 2 == 0 && goods.isOnSale()) {
             allPrice += price / 2;
             prePrice += price / 2;
         } else {
             allPrice += price;
         }
    }


    public double getAllPrice() {
        return allPrice;
    }

    public double getPrePrice() {
        return prePrice;
    }

    public HashMap<String, Production> getItems() {
        return items;
    }
}
