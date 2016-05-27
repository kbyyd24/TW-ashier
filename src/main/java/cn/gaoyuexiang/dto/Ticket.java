package cn.gaoyuexiang.dto;

import cn.gaoyuexiang.entry.Goods;

import java.util.HashMap;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class Ticket {
    private double allPrice;
    private double prePrice;
    private HashMap<String, Production> items;

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

    private void updatePrice(Production goods) {
        double price = goods.getPrice();
         if (goods.getNumber() % 2 == 0) {
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
