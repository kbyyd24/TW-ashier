package cn.gaoyuexiang.entry;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 购物车信息
 */
public class Cart {

    private String barcode;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "barcode='" + barcode + '\'' +
                '}';
    }
}
