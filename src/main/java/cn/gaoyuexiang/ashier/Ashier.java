package cn.gaoyuexiang.ashier;

import cn.gaoyuexiang.exception.GoodsNotFoundException;

import java.io.FileNotFoundException;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * interface to use ashier
 */
public interface Ashier {

    /**
     * 载入商品信息和优惠信息，如果使用默认值，请使用重载的无餐方法
     * @param goodsInfoFile the json file has goods's information, default is goodsInfo.json
     * @param preferentialGoodsFile the json file has preferential goods information, default is preGoods.json
     * @throws FileNotFoundException
     */
    void beginWork (String goodsInfoFile, String preferentialGoodsFile)
            throws FileNotFoundException;

    void beginWork ()
            throws FileNotFoundException;

    /**
     * 结帐方法
     * @param cart 账单信息
     * @return 格式化的小票字符串
     * @throws GoodsNotFoundException
     */
    String checkout(String cart)
            throws GoodsNotFoundException;
}
