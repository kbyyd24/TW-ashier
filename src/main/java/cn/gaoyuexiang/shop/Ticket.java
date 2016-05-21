package cn.gaoyuexiang.shop;

import cn.gaoyuexiang.entry.Goods;

import java.util.HashMap;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class Ticket {
    private double allPrice;
    private double prePrice;
    private HashMap<String, GoodsInTicket> items;

    public void addGoods(Goods goods) {
        if (items.containsKey(goods.getBarcode())) {
            String barcode = goods.getBarcode();
            items.get(barcode).addOne();
            this.updatePrice(items.get(barcode));
        } else {
            GoodsInTicket goodsInTicket = new GoodsInTicket(
                    goods.getName(), goods.getUnit(), goods.getPrice()
            );
            items.put(goods.getBarcode(), goodsInTicket);
            this.updatePrice(goodsInTicket);
        }
    }

    private void updatePrice(GoodsInTicket goods) {
        double price = goods.getPrice();
         if (goods.getNumber() % 2 == 0) {
             allPrice += price / 2;
             prePrice += price / 2;
         } else {
             allPrice += price;
         }

    }
}
