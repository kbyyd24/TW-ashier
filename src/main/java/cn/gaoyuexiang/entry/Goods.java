package cn.gaoyuexiang.entry;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 * 商品信息对象
 */
public class Goods {
    //条形码
    private String barcode;
    //商品名
    private String name;
    //单位
    private String unit;
    //类别
    private String category;

    private String subCategory;
    //价格
    private double price;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
