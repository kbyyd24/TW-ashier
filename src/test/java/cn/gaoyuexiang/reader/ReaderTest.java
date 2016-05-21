package cn.gaoyuexiang.reader;

import cn.gaoyuexiang.entry.Cart;
import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.PreMessager;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class ReaderTest {

    @Test
    public void testRead() throws Exception {
        Reader reader = new GoodsReader();
        System.out.println("GoodsReader:\n" + reader.read(new Goods()));

        reader = new PreMessagerReader();
        System.out.println("PreMessagerReader:\n" + reader.read(new PreMessager()));

        reader = new CartReader("['ITEM000000','ITEM000000','ITEM000001-2','ITEM000003']");
        System.out.println("CartReader:\n" + reader.read(new Cart()));
    }
}