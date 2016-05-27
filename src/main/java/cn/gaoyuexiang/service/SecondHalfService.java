package cn.gaoyuexiang.service;

import cn.gaoyuexiang.dto.Ticket;
import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.OnSaleMsg;
import cn.gaoyuexiang.enums.OnSaleEnum;
import cn.gaoyuexiang.exception.GoodsNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 第二个半价收银台
 */
public class SecondHalfService implements AshierService {

    public Ticket checkout(ArrayList<Goods> goodsList, ArrayList<OnSaleMsg> onSaleList, String[] cart)
            throws GoodsNotFoundException {
        Ticket ticket = new Ticket();
        HashMap<String, Goods> goodsMap = listToMap(goodsList);
        List<String> onSaleBarcodes = getOnSaleBarcodes(onSaleList);

        for (String barcode :
                cart) {
            Goods goods = goodsMap.get(barcode);
            if (goods == null)
                throw new GoodsNotFoundException();
            if (onSaleBarcodes != null && onSaleBarcodes.contains(barcode))
                ticket.addGoods(goods, true);
            else
                ticket.addGoods(goods, false);
        }

        return ticket;
    }

    private HashMap<String, Goods> listToMap(ArrayList<Goods> goodsList) {
        HashMap<String, Goods> goodsMap = new HashMap<String, Goods>(goodsList.size());
        for (Goods goods : goodsList) {
            goodsMap.put(goods.getBarcode(), goods);
        }
        return goodsMap;
    }

    private List<String> getOnSaleBarcodes(ArrayList<OnSaleMsg> onSaleList) {
        for (OnSaleMsg msg :
                onSaleList) {
            if (msg.getType().equals(OnSaleEnum.BUY_SECOND_GET_HALF_PRICE.getOnSaleMsg()))
                return msg.getBarcodes();
        }
        return null;
    }
}
