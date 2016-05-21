package cn.gaoyuexiang.ashier;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 测试接口
 * 正确的账单格式 : ['ITEM000001','ITEM000001','ITEM000003-2']
 */
public class AshierTest {

    //正常的账单
    private String normalCart = "['ITEM000000','ITEM000000','ITEM000001-2','ITEM000003']";
    //账单包含不存在的商品
    private String errorDataCart = "['ITEM000000','ITEM000000','ITEM000001-2','ITEM000007']";
    //账单格式不正确
    private String errorFormatCart = "'ITEM000000','ITEM000000','ITEM000001-2','ITEM000003'";

    /**
     * 正常使用测试
     * @throws Exception
     */
    @Test
    public void testCheckout() throws Exception {
        Ashier ashier = new AshierImp();
        ashier.beginWork();
        String ticket = ashier.checkout(normalCart);
        System.out.println(ticket);
    }

    /**
     * 使用包含不正确商品条形码的账单测试
     * @throws Exception
     */
    @Test
    public void testErrorDataCart() throws Exception {
        Ashier ashier = new AshierImp();
        ashier.beginWork();
        String ticket = ashier.checkout(errorDataCart);
        System.out.println(ticket);
    }

    /**
     * 使用格式不正确的账单测试
     * @throws Exception
     */
    @Test
    public void testErrorFormatCart() throws Exception {
        Ashier ashier = new AshierImp();
        ashier.beginWork();
        String ticket = ashier.checkout(errorFormatCart);
        System.out.println(ticket);
    }
}
