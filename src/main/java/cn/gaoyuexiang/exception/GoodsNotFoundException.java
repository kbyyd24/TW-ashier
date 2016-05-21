package cn.gaoyuexiang.exception;

import java.io.IOException;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 如果账单中的商品没有找到，将会抛出此异常
 * 如果没有在结帐前调用 Ashier.beginWork() 方法，也会抛出此异常
 */
public class GoodsNotFoundException extends IOException {

    public GoodsNotFoundException() {}

    public GoodsNotFoundException(String message) {
        super(message);
    }
}