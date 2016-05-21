package cn.gaoyuexiang.reader;

import cn.gaoyuexiang.json.JsonMapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class CartReader implements Reader {

    private String cart;

    public CartReader(String cart) {
        this.cart = cart;
    }

    public <T> java.util.ArrayList<T> read(T t) throws IOException {
        return JsonMapper.resolveJSON(new ByteArrayInputStream(cart.getBytes()), t);
    }
}
