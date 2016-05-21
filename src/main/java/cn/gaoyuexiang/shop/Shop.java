package cn.gaoyuexiang.shop;

import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.PreMessager;
import cn.gaoyuexiang.reader.GoodsReader;
import cn.gaoyuexiang.reader.PreMessagerReader;
import cn.gaoyuexiang.reader.Reader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class Shop {
    private ArrayList<Goods> goodses;

    private ArrayList<PreMessager> preMessagers;

    public void openShop(String goodsInfo, String preGoods) throws IOException {
        Reader reader = new GoodsReader(goodsInfo);
        goodses = reader.read(new Goods());
        reader = new PreMessagerReader(preGoods);
        preMessagers = reader.read(new PreMessager());
    }

    public void openShop() throws IOException {
        this.openShop(GoodsReader.DEF_FILE, PreMessagerReader.DEF_FILE);
    }

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
