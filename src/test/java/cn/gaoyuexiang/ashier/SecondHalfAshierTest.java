package cn.gaoyuexiang.ashier;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by melo on 16-5-27.
 */
public class SecondHalfAshierTest {

    private Ashier ashier;

    @Before
    public void initAshier() throws IOException {
        ashier = new SecondHalfAshier();
        ashier.loadLists();
    }

    @Test
    public void checkout() throws Exception {
        String[] cart = new String[]{"ITEM000000", "ITEM000000", "ITEM000002-2", "ITEM000001-3", "ITEM000003"};
        String ticket = ashier.checkout(cart);
        System.out.println(ticket);
    }

}