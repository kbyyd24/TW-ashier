package cn.gaoyuexiang.ashier;

import cn.gaoyuexiang.dto.Production;
import cn.gaoyuexiang.dto.Ticket;
import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.OnSaleMsg;
import cn.gaoyuexiang.exception.GoodsNotFoundException;
import cn.gaoyuexiang.reader.GoodsReader;
import cn.gaoyuexiang.reader.OnSaleMsgReader;
import cn.gaoyuexiang.reader.Reader;
import cn.gaoyuexiang.service.AshierService;
import cn.gaoyuexiang.service.SecondHalfService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * implement interface Ashier
 */
public class SecondHalfAshier implements Ashier {
    /*商品信息列表*/
    private ArrayList<Goods> goodsList;
    /*优惠信息列表*/
    private ArrayList<OnSaleMsg> onSaleList;

    public void loadLists(String goodsInfoFile, String onSaleInfoFile) throws IOException {
        Reader reader = new GoodsReader(goodsInfoFile);
        this.goodsList = reader.read(new Goods());
        reader = new OnSaleMsgReader(onSaleInfoFile);
        this.onSaleList = reader.read(new OnSaleMsg());
    }

    public void loadLists() throws IOException {
        this.loadLists(GoodsReader.DEF_FILE, OnSaleMsgReader.DEF_FILE);
    }

    public String checkout(String[] cart) throws GoodsNotFoundException {
        //处理条形码中包含"-"的情况
        ArrayList<String> cartList = new ArrayList<String>(cart.length * 2);
        for (String item : cart) {
            String[] strs = item.split("-");
            if (strs.length == 1) {
                cartList.add(strs[0]);
                continue;
            }
            int number = Integer.parseInt(strs[1]);
            for (int i = 0; i < number; i++)
                cartList.add(strs[0]);
        }
        String[] newCart = new String[cartList.size()];
        cartList.toArray(newCart);

        AshierService service = new SecondHalfService();
        Ticket ticket = service.checkout(this.goodsList, this.onSaleList, newCart);
        return createTicket(ticket);
    }

    private String createTicket(Ticket ticket) {
        final String onSaleTitle = "第二个半价商品 : \n";
        String strTicket = "<没钱赚商店>购物清单\n";
        String onSaleTicket = onSaleTitle;
        Collection<Production> productions = ticket.getItems().values();
        for (Production production : productions) {
            strTicket += "名称 : " + production.getName() + ", ";
            strTicket += "数量 : " + production.getNumber() + production.getUnit() + ", ";
            strTicket += "单价 : " + production.getPrice() + "(元)";
            if (production.isOnSale()) {
                strTicket += ", 优惠 : " + production.getPrePrice() + "(元)";
                onSaleTicket += "名称 : " + production.getName()
                        + ", 数量 : " + production.getPreNumber() + production.getUnit() + "\n";
            }
            strTicket += "\n";
        }

        if (!onSaleTicket.equals(onSaleTitle))
            strTicket += "---------------------\n" + onSaleTicket;

        strTicket += "-----------------------\n";
        strTicket += "总计 : " + ticket.getAllPrice() + "(元)\n";
        strTicket += "节省 : " + ticket.getPrePrice() + "(元)";

        return strTicket;
    }
}
