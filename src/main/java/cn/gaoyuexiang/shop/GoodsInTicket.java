package cn.gaoyuexiang.shop;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class GoodsInTicket {
    private String name;
    private int number;
    private String unit;
    private double price;
    private int preNumber;

    public GoodsInTicket(String name, String unit, double price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.number = 1;
    }

    public void print() {
        double prePrice = preNumber * price / 2;
        double subTotal = number * price - prePrice;
        System.out.println("名称 : " + name + ", 数量 : " + number + unit +
                ", 单价 : " + price + "(元), 小计 : " + subTotal +
                "(元), 优惠 : " + prePrice + "(元)");
    }

    public void printPre() {
        System.out.println("名称 : " + name + ", 数量 : " + preNumber);
    }

    public int getNumber() {
        return number;
    }

    public void addOne() {
        this.number++;
        this.preNumber = this.number / 2;
    }

    public double getPrice() {
        return price;
    }
}
