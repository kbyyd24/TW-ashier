package cn.gaoyuexiang.shop;

import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.PreMessager;

import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 商店类，可以通过spring注入，以保存商品和优惠信息
 */
public class Shop {
    private ArrayList<Goods> goodses;

    private ArrayList<PreMessager> preMessagers;

    public ArrayList<Goods> getGoodses() {
        return goodses;
    }

    public void setGoodses(ArrayList<Goods> goodses) {
        this.goodses = goodses;
    }

    public ArrayList<PreMessager> getPreMessagers() {
        return preMessagers;
    }

    public void setPreMessagers(ArrayList<PreMessager> preMessagers) {
        this.preMessagers = preMessagers;
    }
}
