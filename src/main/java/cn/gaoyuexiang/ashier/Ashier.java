package cn.gaoyuexiang.ashier;

import cn.gaoyuexiang.exception.GoodsNotFoundException;

import java.io.IOException;


/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 收银台接口
 */
public interface Ashier {

    /**
     * 加载商品信息
     * @param goodsInfoFile 所有商品信息的保存文件
     * @param onSaleInfoFile 优惠信息
     * @throws IOException
     */
    void loadLists(String goodsInfoFile, String onSaleInfoFile) throws IOException;
    void loadLists() throws IOException;

    /**
     * 结帐方法
     * @param cart 账单信息
     * @return 格式化的小票字符串
     * @throws GoodsNotFoundException
     */
    String checkout(String[] cart)
            throws GoodsNotFoundException;
}
