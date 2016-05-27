package cn.gaoyuexiang.enums;

/**
 * Created by melo on 16-5-27.
 */
public enum OnSaleEnum {

    BUY_SECOND_GET_HALF_PRICE(1, "BUY_SECOND_GET_HALF_PRICE");

    private int index;

    private String OnSaleMsg;

    OnSaleEnum(int index, String onSaleMsg) {
        this.index = index;
        OnSaleMsg = onSaleMsg;
    }

    public int getIndex() {
        return index;
    }

    public String getOnSaleMsg() {
        return OnSaleMsg;
    }

    public static OnSaleEnum stateOf(int index) {
        for (OnSaleEnum type: values()) {
            return type;
        }
        return null;
    }
}
