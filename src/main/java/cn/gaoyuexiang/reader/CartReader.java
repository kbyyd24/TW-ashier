package cn.gaoyuexiang.reader;

import cn.gaoyuexiang.entry.Cart;
import cn.gaoyuexiang.json.JsonMapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 没有使用jackson解析，不需要实现Reader接口
 */
public class CartReader {

    private String cart;

    public CartReader(String cart) {
        this.cart = cart;
    }

    public ArrayList<Cart> read() {
        String[] barcodes = cart.split(",");
        ArrayList<Cart> carts = new ArrayList<Cart>(barcodes.length);
        Cart cart = new Cart();
        for (String barcode :
                barcodes) {
            barcode = barcode.substring(
                    barcode.indexOf('\''),
                    barcode.lastIndexOf('\'')
            );
            cart.setBarcode(barcode);
            carts.add(cart);
        }
        return carts;
    }
}
