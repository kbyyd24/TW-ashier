package cn.gaoyuexiang.reader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public interface Reader {

    /**
     * 加载文件中的商品信息
     * @param t jackson 框架解析 json 为对象时需要对象的类类型
     * @param <T> Goods 类或 OnSaleMsg 类
     * @return 返回商品信息列表
     * @throws IOException
     */
    <T>ArrayList<T> read(T t) throws IOException;
}
