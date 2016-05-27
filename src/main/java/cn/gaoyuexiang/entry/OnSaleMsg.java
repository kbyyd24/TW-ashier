package cn.gaoyuexiang.entry;

import java.util.List;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 优惠信息对象
 */
public class OnSaleMsg {
    //优惠类型
    private String type;
    //优惠商品条形码
    private List<String> barcodes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    @Override
    public String toString() {
        return "OnSaleMsg{" +
                "type='" + type + '\'' +
                ", barcodes=" + barcodes +
                '}';
    }
}
