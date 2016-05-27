package cn.gaoyuexiang.dto;

/**
 * Created by melo on 16-5-26.
 */
public class Production {
    /*商品名称*/
    private String name;
    /*购买数量*/
    private int number = 1;
    /*单位*/
    private String unit;
    /*打折数量*/
    private int preNumber;
    /*商品单价*/
    private double price;
    /*优惠价格*/
    private double prePrice;
    /*是否是优惠商品*/
    private boolean isOnSale;

    public Production(String name, String unit, double price, boolean isOnSale) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.isOnSale = isOnSale;
    }

    public void addOne() {
        this.number ++;
        this.preNumber = this.number / 2;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getUnit() {
        return unit;
    }

    public int getPreNumber() {
        return preNumber;
    }

    public double getPrice() {
        return price;
    }

    public double getPrePrice() {
        return prePrice;
    }

    public boolean isOnSale() {
        return isOnSale;
    }
}
