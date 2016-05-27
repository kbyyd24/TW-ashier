package cn.gaoyuexiang.reader;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class OnSaleMsgReader extends FileReader {

    public static final String DEF_FILE = "goodsMsg/onSaleGoods.json";

    public OnSaleMsgReader(String fileName) {
        super(fileName, DEF_FILE);
    }

    public OnSaleMsgReader() {
        super(DEF_FILE, DEF_FILE);
    }
}