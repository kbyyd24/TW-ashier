package cn.gaoyuexiang.ashier;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by melo on 16-5-27.
 */
public class SecondHalfAshierTest {
    @Test
    public void checkout() throws Exception {
        Ashier ashier = new SecondHalfAshier();
        ashier.loadLists();
        String[] cart = new String[]{"ITEM000000", "ITEM000000", "ITEM000002-2"};
        String ticket = ashier.checkout(cart);
        System.out.println(ticket);
    }

}